package kr.ac.kopo.day02.exam;

import java.util.Scanner;

public class ExamMain01Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("나이를 입력해주세요. : ");
            int age = sc.nextInt();
            if(age >= 0){  // 0 보다 크면에서 거르고 다음에 10보다 크면에서 거르고.
                if(age >= 10){
                    if (age >= 20){
                        if (age >= 30){
                            if (age >= 40){
                                if (age >= 50){
                                    if (age >= 60){
                                        if (age >= 70){
                                            if (age >= 80){
                                                if (age >= 90){
                                                    System.out.println("90대입니다.");
                                                    break;
                                                }
                                                System.out.println("80대입니다.");
                                                break;
                                            }
                                            System.out.println("70대입니다.");
                                            break;
                                        }
                                        System.out.println("60대입니다.");
                                        break;
                                    }
                                    System.out.println("50대입니다.");
                                    break;
                                }
                                System.out.println("40대입니다.");
                                break;
                            }
                            System.out.println("30대입니다.");
                            break;
                        }
                        System.out.println("20대입니다.");
                        break;
                    }
                    System.out.println("10대입니다.");
                    break;
                }
                System.out.println("영유아입니다.");
                break;
            }else {
                System.out.println("나이를 잘못입력했습니다.");
                System.out.println("0 ~ 99 사이의 나이를 입력해주세요.");
                continue;
            }
        }
    }
}
