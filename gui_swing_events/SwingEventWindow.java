package gui_swing_events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEventWindow extends JFrame implements ActionListener {

    JPanel mainPanel = new JPanel();
    JPanel pnl0 = new JPanel();;
    JPanel pnl01 = new JPanel();
    JPanel pnl1 = new JPanel();
    JPanel pnl2 = new JPanel();
    JPanel pnl3= new JPanel();
    JPanel pnl4 = new JPanel();
    JLabel title = new JLabel("Excel Functions\n");
    JLabel instruction = new JLabel("Enter your numbers separated by spaces\n");
    JTextField input = new JTextField(30);

    ButtonGroup radioGroup = new ButtonGroup();
    JRadioButton autoSum = new JRadioButton("AutoSum", true);
    JRadioButton average = new JRadioButton("Average");
    JRadioButton max = new JRadioButton("Maximum");
    JRadioButton min = new JRadioButton("Minimum");

    JButton btnCalculate = new JButton("Calculate");


    JLabel result = new JLabel("Result:");
    JTextField output = new JTextField(10);

    Excel resultInput = new Excel(input.getText());

    float resultCalcul;


    GridLayout layout = new GridLayout(6, 1);


    public SwingEventWindow() {
        super("GUI Swing Window");

        setSize(500, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCalculate.addActionListener(this);

        output.setEditable(false);

        radioGroup.add(autoSum);
        radioGroup.add(average);
        radioGroup.add(max);
        radioGroup.add(min);

        pnl0.add(title);
        pnl01.add(instruction);
        pnl1.add(input);
        pnl2.add(autoSum);
        pnl2.add(average);
        pnl2.add(max);
        pnl2.add(min);
        pnl3.add(btnCalculate);
        pnl4.add(result);
        pnl4.add(output);

        mainPanel.add(pnl0);
        mainPanel.add(pnl01);
        mainPanel.add(pnl1);
        mainPanel.add(pnl2);
        mainPanel.add(pnl3);
        mainPanel.add(pnl4);

        mainPanel.setLayout(layout);

        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnCalculate) {
            calculate(actionEvent);
        }
    }

    public void calculate(ActionEvent actionEvent){
        resultInput.setUserInput(input.getText());
        if (autoSum.isSelected()) {
            resultCalcul = resultInput.sumTotal();
        } else if (average.isSelected()) {
            resultCalcul = resultInput.average();
        } else if (max.isSelected()) {
            resultCalcul = resultInput.max();
        } else if (min.isSelected()) {
            resultCalcul = resultInput.min();
        }
        output.setText(Float.toString(resultCalcul));
    }
}
