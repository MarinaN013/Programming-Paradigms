package HomeWork_1;

import java.util.Arrays;

public class BubbleSortDeclarative
    {
        public static void main(String args[]) {
            int[] sortArr = {12, 6, 4, 1, 15, 10};
            Arrays.sort(sortArr);
            for(int i = 0; i < sortArr.length; i++){
                System.out.print(sortArr[i] + "\n");
            }
        }
    }

