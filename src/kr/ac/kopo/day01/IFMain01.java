package kr.ac.kopo.day01;

import java.util.Scanner;

public class IFMain01 {
    public static void main(String[] args) {
        System.out.print("언제 일어났어?(시간만 알려주면 돼.) : ");
        Scanner sc = new Scanner(System.in);
        int 기상시간 = sc.nextInt();
        if (기상시간 < 7){
            System.out.println("밥을 먹고 간다.");
        }
        System.out.println("학교에 간다!");
    }
}
