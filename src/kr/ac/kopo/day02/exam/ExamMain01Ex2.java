package kr.ac.kopo.day02.exam;

import java.util.Scanner;

public class ExamMain01Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력해주세요. : ");
        int age = sc.nextInt();

        if (age > 0 && age > 100){
            switch (age / 10){
                case 0:
                    System.out.println("영유아입니다.");
                    break;
                case 1:
                    System.out.println("10대입니다.");
                    break;
                case 2:
                    System.out.println("20대입니다.");
                    break;
                case 3:
                    System.out.println("30대입니다.");
                    break;
                case 4:
                    System.out.println("40대입니다.");
                    break;
                case 5:
                    System.out.println("50대입니다.");
                    break;
                case 6:
                    System.out.println("60대입니다.");
                    break;
                case 7:
                    System.out.println("70대입니다.");
                    break;
                case 8:
                    System.out.println("80대입니다.");
                    break;
                case 9:
                    System.out.println("90대입니다.");
                    break;
                default:
                    System.out.println("나이를 잘못입력했습니다.");
                    break;
            }
        }else {
            System.out.println("0 ~ 99까지의 숫자만 입력해주세요.");
        }

    }
}
