package task_three_pres;

public class Present {
    /**
     * 2. Формируется сладкий подарок.
     * - Он может включать в себя разные сладости (Candy, Jellybean, etc.)
     * - У каждой сладости есть название, вес, цена и свой уникальный параметр
     * - Необходимо собрать подарок из сладостей
     * - Найти общий вес подарка, общую стоимость подарка
     * - Вывести на консоль информацию о всех сладостях в подарке
     *
     */

    public static void main(String[] args) {
        Candy a = new Candy(2, 35.20, "ChocoBam!");
        Candy b = new Candy(1.5, 78, "Mumu");
        Jellybean c = new Jellybean (3, 46.01, 3);
        Jellybean d = new Jellybean (15, 110.50, 7);

        Sweets [] box = {a, b, c, d};
        double sum =0;
        double sum1 =0;
            for (Sweets someSweet : box){
                System.out.println(someSweet.toString());
                sum += someSweet.getWeight();
                sum1 += someSweet.getPrice();
            }

        System.out.printf("\nОбщий вес: %.2f kg.", sum);
        System.out.printf("\nОбщая стоимость: %.2f руб.", sum1);
    }
}
