package kr.ac.kopo.day04.exam;

import java.util.Arrays;

public class ExamMain01 {
    public static void main(String[] args) {
        int[] arr = new int[]{
                89, 34, 10, 27, 9
        };

        System.out.println(Arrays.toString(arr).replaceAll("[^0-9 ]",""));

        // reverse
//        StringBuffer sb = new StringBuffer(Arrays.toString(new int[]{arr[0]}).replaceAll("[^0-9 ]",""));
//        String reversedStr = sb.reverse().toString();
//        System.out.println(reversedStr);

        for (int j : arr) {
            StringBuffer sb = new StringBuffer(Arrays.toString(new int[]{j}).replaceAll("[^0-9 ]", ""));
            String reversedStr = sb.reverse().toString();
            System.out.print(reversedStr + " ");
        }

        System.out.println("\n" + reverse(arr[0]));
    }

    public static int reverse(int x) { // x = 1234

        int rev = 0;

        while(x!=0) {
            rev = rev*10 + x%10;
            x/=10;
        }
        return rev; // 4321
    }
}
