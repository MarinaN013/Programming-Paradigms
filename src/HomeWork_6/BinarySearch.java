package HomeWork_6;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearch(array, target, start, mid - 1);
        } else {
            return binarySearch(array, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Искомый элемент найден в индексе: " + index);
        } else {
            System.out.println("Искомый элемент не найден.");
        }
    }
}
