package task_three_arr;

import java.util.Arrays;
import java.util.Random;

public class Arr {
        public static void main (String[]args){
            /**
             * 1.
             * - Массив размерностью 20
             * - Он заполняется случайными целыми числами от -10 до 10
             * - Нужно найти максимальный отрицательный и минимальный положительный элементы массива
             * - Поменять их местами.
             * */
            Random random = new Random();
            int[] mas = new int[20];

            for (int i = 0; i < mas.length; i++)
                mas[i] = ((int) (Math.random() * 21) - 10);

            for (int i = 0; i < mas.length; i++)
                System.out.print(mas[i] + "  ");

            int posMin = Integer.MAX_VALUE;
            int inOfMax = 0;
            int min = mas[0];
            int inOfMin = 0;

            for (int i = 0; i < mas.length; i++) {

                if (mas[i] > 0 && mas[i] < posMin) {
                    posMin = mas[i];
                    inOfMax = i;
                }
                if (min > mas[i]) {
                    min = mas[i];
                    inOfMin = i;
                }
            }
            System.out.println("\nМинимальный положительный:  " + posMin + "\nМаксимальный отрицательный: " + min);

                int el = mas[inOfMax];
                mas[inOfMax] = mas[inOfMin];
                mas[inOfMin] = el;
                System.out.println(Arrays.toString(mas));

        }
}
