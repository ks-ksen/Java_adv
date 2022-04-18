package task_six;

import task_four.Data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsForNewCalculator {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        try {
            double number1 = reader.nextDouble();
            double number2 = reader.nextDouble();


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
               if (number2==0){
                   throw new ArithmeticException("Деление на ноль.");
               }else System.out.println("Резултат: " + oper.div(number1,number2));
                break;

                default:
                throw new UnsupportedOperationException ("Несуществующий оператор");
            }

        } catch (InputMismatchException c){
            System.out.print("Для ввода чисел используйте только цифры!");
        } catch (ArithmeticException z) {
            System.out.println("На 0 делить нельзя!");
        }catch (UnsupportedOperationException p){
            System.out.println("Некорректный оператор!");
        }
        reader.close();
    }
}
