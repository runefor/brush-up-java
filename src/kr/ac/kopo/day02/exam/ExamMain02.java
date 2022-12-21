package kr.ac.kopo.day02.exam;

import java.util.Scanner;

public class ExamMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력해주세요. : ");
        int age = sc.nextInt();

//        if (age > 0 && age > 100){
//            switch (age / 10){
//                case 0:
//                    System.out.println(age + "세는 영유아입니다.");
//                default:
//                    System.out.println(age + "세는" + (age / 10) + "0대입니다.");
//            }
//        }else {
//            System.out.println("잘못입력했습니다.");
//        }

        switch ((age >= 0 && age < 100 ? 1 : 0)){
            case 1:
                if (age < 10){
                    System.out.println(age + "세는 영유아입니다.");
                }
                System.out.println(age + "세는 " + (age / 10) + "0대입니다.");
                break;
            case 0:
                System.out.println("잘못입력했습니다.");
                break;
        }
    }
}
