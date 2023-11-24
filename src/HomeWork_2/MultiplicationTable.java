package HomeWork_2;
/*
На вход подается число n. Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
Обоснуйте выбор парадигм.
*/

public class MultiplicationTable {

    public static void main(String[] args) {
        multiplicationTable(1, 9);
    }

    public static void multiplicationTable(int firstMultiplier, int secondMultiplier) {
        for (int i = 1; i <= secondMultiplier; i++) {
            int b = i * firstMultiplier;
            System.out.printf(" %d x %d = %d\n", firstMultiplier, i, b);
        }
    }
}
