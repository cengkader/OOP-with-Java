package Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        float num1, num2;
        System.out.println("Please enter the num1:");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextFloat();
        System.out.println("Please enter the num2:");
        num2 = scanner.nextFloat();

        Calculations c1 = new Calculations();
        System.out.println("Addition:  " + num1 + "+" + num2 + " = " + c1.addition(num1, num2));
        System.out.println("Subtraction:  " + num1 + "-" + num2 + " = " + c1.subtraction(num1, num2));
        System.out.println("Multiplication:  " + num1 + "*" + num2 + " = " + c1.multiplication(num1, num2));

        try{
            System.out.println("Division:  " + num1 + "/" + num2 + " = " + c1.division(num1, num2));

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
