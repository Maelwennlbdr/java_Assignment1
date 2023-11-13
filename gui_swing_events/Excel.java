package gui_swing_events;

public class Excel {

    private String userInput;

    public Excel(String userInput) {
        this.userInput = userInput;
    }

    public float sumTotal() {
        String[] numbersStr = userInput.split(" ");
        float[] numbers = new float[numbersStr.length];

        float sum = 0;

        for (int i = 0; i< numbersStr.length; i++){
            numbers[i] = Float.parseFloat(numbersStr[i]);
            sum += numbers[i];
        }

        return sum;
    }

    public float average() {
        String[] numbersStr = userInput.split(" ");
        float[] numbers = new float[numbersStr.length];
        float total = sumTotal();

        for (int i = 0; i< numbersStr.length; i++){
            numbers[i] = Float.parseFloat(numbersStr[i]);
        }

        if (numbersStr.length > 0) {
            return total / numbersStr.length;
        } else {
            return 0;
        }
    }

    public float max() {
        String[] numbersStr = userInput.split(" ");
        float[] numbers = new float[numbersStr.length];
        float max=Float.parseFloat(numbersStr[0]);

        for (int i = 0; i< numbersStr.length; i++){
            numbers[i] = Float.parseFloat(numbersStr[i]);
            if(numbers[i]>max){
                max=numbers[i];
            }
        }

        return max;
    }

    public float min() {
        String[] numbersStr = userInput.split(" ");
        float[] numbers = new float[numbersStr.length];
        float min=Float.parseFloat(numbersStr[0]);

        for (int i = 0; i< numbersStr.length; i++){
            numbers[i] = Float.parseFloat(numbersStr[i]);
            if(numbers[i]<min){
                min=numbers[i];
            }
        }

        return min;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
