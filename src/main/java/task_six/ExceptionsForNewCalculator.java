package task_six;

import task_four.Data;

import java.util.Scanner;

public class ExceptionsForNewCalculator {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        int number1 = reader.nextInt();
        int number2 = reader.nextInt();
        System.out.print("Введите оператор (+, -, *, /): ");

        Data oper = new Data(number1,number2);

        char op = reader.next().charAt(0);
        switch (op) {
            case '+':
                System.out.print("Резултат: " + oper.add(number1,number2));
                break;
            case '-':
                System.out.print("Резултат: " + oper.subtract(number1,number2));
                break;
            case '*':
                System.out.print("Резултат: " + oper.times(number1,number2));
                break;
            case '/':
                try {
                    System.out.print("Резултат: " + oper.div(number1,number2));
                } catch (ArithmeticException e){
                    System.out.print("На ноль делить нельзя!");
                }
                break;

            default:
                System.out.print("Некорректный оператор");
        }
        reader.close();
    }
}
