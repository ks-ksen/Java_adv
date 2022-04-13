package task_five;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TaskFile {

    public static void main(String[] args) throws FileNotFoundException {

        /***
         * Прочитать слова из файла.
         *Отсортировать в алфавитном порядке.
         */

        File file = new File("words");

        Scanner scanner = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        for (String wor : list) {
            String[] word = wor.split(" ");
            Arrays.sort(word);

            for (String w : word) {
                System.out.println(w);
            }
        }
        /**
         * Посчитать сколько раз каждое слово встречается в файле
         *Вывести статистику на консоль
         */

        HashMap<String, Integer> map = new HashMap<>();
        for (String w : list) {
            String[] item = w.split(" ");
            for (String t : item) {
                if (map.containsKey(t)) {
                    map.put(t, map.get(t) + 1);
                } else {
                    map.put(t, 1);
                }
            }
        }
        for (String key : map.keySet()) {
            System.out.println("Word: " + key + " Count: " + map.get(key));
        }
        /**
         * Найти слово с максимальным количеством повторений
         * Вывести на консоль это слово и сколько раз оно встречается в файле
         */

        int p = 0;
        for (String w : map.keySet()) {
            if (p < map.get(w)) {
                p = map.get(w);

                System.out.println("Самое повторяющееся слово: " + w + " (встречается " + map.get(w) + " раз)");
            }
        }
        scanner.close();
    }
}
