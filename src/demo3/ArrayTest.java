package demo3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(Arrays.toString(numbers));

        int[] bigger = new int[5];
        System.arraycopy(numbers, 0, bigger, 0, numbers.length);

        bigger[3] = 4;
        System.out.println(Arrays.toString(bigger));
    }
}
