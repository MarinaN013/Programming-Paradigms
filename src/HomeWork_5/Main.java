package HomeWork_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int sum = Arrays.stream(array).sum();//преобразовываем массив в поток целых чисел
        System.out.println(sum);
    }
}
