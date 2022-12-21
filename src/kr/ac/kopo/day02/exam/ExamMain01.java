package kr.ac.kopo.day02.exam;

import java.util.Scanner;

public class ExamMain01 {
    public static void main(String[] args) {
        /*
        나이를 입력하면
        27새는 20대라고 나오게 하라.

        0 ~ 9세 영유아
        10 ~ 19세 10대
        20 ~ 29세 20대
        30 ~ 39세 30대
        ..
        90 ~ 99세

        나머지는 오류로 인식
         */

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("나이를 입력해주세요. : ");
            int age = sc.nextInt();
            if(age >= 0 && age < 10){
                System.out.println("영유아입니다.");
                break;
            } else if (age >= 10 && age < 20) {
                System.out.println("10대입니다.");
                break;
            } else if (age >= 20 && age < 30) {
                System.out.println("20대입니다.");
                break;
            }else if (age >= 30 && age < 40) {
                System.out.println("30대입니다.");
                break;
            }else if (age >= 40 && age < 50) {
                System.out.println("40대입니다.");
                break;
            }else if (age >= 50 && age < 60) {
                System.out.println("50대입니다.");
                break;
            }else if (age >= 60 && age < 70) {
                System.out.println("60대입니다.");
                break;
            }else if (age >= 70 && age < 80) {
                System.out.println("70대입니다.");
                break;
            }else if (age >= 80 && age < 90) {
                System.out.println("80대입니다.");
                break;
            }else if (age >= 90 && age < 100) {
                System.out.println("90대입니다.");
                break;
            }else {
                System.out.println("나이를 잘못입력했습니다.");
                System.out.println("0 ~ 99 사이의 나이를 입력해주세요.");
                continue;
            }
        }



    }
}
