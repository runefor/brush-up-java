package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain06 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int[] copy = new int[5];

        System.arraycopy(arr, 2, copy, 0,5);

        System.out.println(Arrays.toString(copy));
    }
}
