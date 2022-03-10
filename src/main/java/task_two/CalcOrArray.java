package task_two;

import java.util.Scanner;

public class CalcOrArray {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Выберите действие: 1 -Калькулятор, 2 - Массив слов \n");
        int sel = read.nextInt();

        double res;

        if (sel == 1) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Введите два числа через пробел: ");
            double a = reader.nextDouble();
            double b = reader.nextDouble();
            System.out.print("Введите оператор (+, -, *, /): ");

            char op = reader.next().charAt(0);
            switch (op) {
                case '+':
                    res = a + b;
                    System.out.print("Резултат: " + res);
                    break;
                case '-':
                    res = a - b;
                    System.out.print("Резултат: " + res);
                    break;
                case '*':
                    res = a * b;
                    System.out.print("Резултат: " + res);
                    break;
                case '/':
                    res = a / b;
                    if (b == 0) {
                        System.out.print("На ноль делить нельзя!");
                    } else
                        System.out.print("Резултат: " + res);
                    break;

                default:
                    System.out.print("Некорректный оператор");

            }
        }

        if (sel == 2) {
            Scanner vvod = new Scanner(System.in);
            System.out.print("Введите количество слов: ");
            int n = vvod.nextInt();
            String[] words = new String[n];

            System.out.print("Введите слова через пробел: ");
            for (int i = 0; i < n; i++) {
                words[i] = vvod.next();
            }
            String maxString = "";
            for (String w : words) {
                if (w.length() > maxString.length()) {
                    maxString = w;
                }
            }

            System.out.println("Это длинное слово: " + maxString);

        }
    }
}
