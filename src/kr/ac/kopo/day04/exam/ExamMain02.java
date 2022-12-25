package kr.ac.kopo.day04.exam;

import java.util.Arrays;
import java.util.Scanner;

public class ExamMain02 {
    public static void main(String[] args) {
        // 1번 문제를 수정하는데, 만일 입력받은 정수가 0~99가 아니라면 다시 입력을 받도록 수정을 한다.

        int[] xList = new int[5];
        int x;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("5개의 정수를 입력받아 다음과 같이 출력하는 코드 작성. \n단, 정수는 0-99사이만 입력가능");
            for (int i = 0; i < 5; i++){
                System.out.print("num" + (i + 1) + "  : ");
                x = sc.nextInt();
                while(x >= 100 || x <= 0){
                    System.out.print("num" + (i + 1) + "  : ");
                    x = sc.nextInt();
                }
                xList[i] = x;

            }
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n< PRINT >");
        // []를 없애기 위해 replace 문을 이용하여 제거
        System.out.println(Arrays.toString(xList).replaceAll("[^0-9 ]",""));

        System.out.println("< REVERSE >");

        // 배열 정방향 순서로 출력
//        for (int k: xList) {
//            System.out.print(reverse(j) + " ");
//        }
        for(int k = xList.length -1; k >= 0; k--){
            System.out.print(reverse(xList[k]) + " ");
        }

    }

    // 깔끔하게 보이려고 함수를 이용하여 로직 구성
    static int reverse(int x) {

        int rev = 0;
        if (x /10 == 0){
            rev = x * 10;
        }else {
            while(x!=0) {
                rev = rev*10 + x%10;
                x/=10;
            }
        }
        return rev;
    }
}
