package kr.ac.kopo.day01;

import java.util.Scanner;

public class OperationMain03 {
    public static void main(String[] args) {
        /*
        정수 : 12
        정수 : 4
        4는 12의 약수인가? : true

        정수 : 12
        정수 : 5
        5는 12의 약수인가? : false
         */

        int a = 12;
        int b = 0;
        System.out.printf("%d는 %d의 약수 여부 판단 %b\n", b, a, b != 0 && a % b == 0);


    }
}
