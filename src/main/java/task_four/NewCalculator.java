package task_four;

import java.util.Scanner;

/**
 * Реализовать калькулятор в стиле ООП
 */

public class NewCalculator {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        double number1 = reader.nextDouble();
        int number2 = reader.nextInt();
        System.out.print("Введите оператор (+, -, *, /): ");

        Plus plus = new Plus(number1,number2);
        Minus minus = new Minus(number1,number2);
        Multiplication multi = new Multiplication(number1,number2);
        Division divi = new Division(number1,number2);

        char op = reader.next().charAt(0);
        switch (op) {
            case '+':
                System.out.print("Резултат: " + plus.add(number1,number2));
                break;
            case '-':
                System.out.print("Резултат: " + minus.subtract(number1,number2));
                break;
            case '*':
                System.out.print("Резултат: " + multi.times(number1,number2));
                break;
            case '/':
                if (number2 == 0) {
                    System.out.print("На ноль делить нельзя!");
                }else
                    System.out.print("Резултат: " + divi.div(number1,number2));
                break;

            default:
                System.out.print("Некорректный оператор");
        }
        reader.close();
    }
}
