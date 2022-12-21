package kr.ac.kopo.day02;

import java.util.Scanner;

public class SwtichMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~3의 숫자를 입력해주세요. : ");
        int num= sc.nextInt();

        switch (num){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
