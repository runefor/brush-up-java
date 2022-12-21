package kr.ac.kopo.day02;

import java.util.Scanner;

public class IFMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~3의 숫자를 입력해주세요. : ");
        int num= sc.nextInt();

        if (num == 1){
            System.out.println("ONE");
        } else if (num == 2) {
            System.out.println("TWO");
        } else if (num == 3) {
            System.out.println("THREE");
        }else {
            System.out.println("ERROR");
        }
    }
}
