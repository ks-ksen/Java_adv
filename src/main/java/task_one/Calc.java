package task_one;

import java.util.Scanner;

/**
 * @author Ксения
 * Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
 * */

public class Calc {
    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа через пробел ");
        double a = reader.nextDouble();
        double b = reader.nextDouble();

        double res = a + b;
        System.out.printf("Результат сложения: %.4f",res); // Полученный результат округляется до 4-х знаков после запятой.

    }
}
