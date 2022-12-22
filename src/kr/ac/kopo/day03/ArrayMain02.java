package kr.ac.kopo.day03;

import java.util.Scanner;

public class ArrayMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i : nums){
            System.out.print( "num" + (i) + " : ");
            nums[i] = sc.nextInt();
            if (!sc.hasNext()){
                System.out.print( "num" + (i) + " : ");
            }
        }

        for (int i : nums){
            System.out.print(i);
        }
    }
}
