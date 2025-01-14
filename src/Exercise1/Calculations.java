package Exercise1;

public class Calculations {
    public float addition(float number1, float number2){
        return (number1 + number2);
    }

    public float subtraction(float number1, float number2){
        return (number1 - number2);
    }

    public float multiplication(float number1, float number2){
        return number1 * number2;
    }

    public float division(float number1, float number2){
        if(number2 == 0){
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return number1 / number2;
    }
}
