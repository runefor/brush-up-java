package kr.ac.kopo.day04.exam;

import java.util.Arrays;
import java.util.Scanner;

public class ExamMain01 {
    public static void main(String[] args) {
//        int[] arr = new int[]{
//                89, 34, 10, 27, 9
//        };
        int[] xList = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력받아 다음과 같이 출력하는 코드 작성. \n단, 정수는 0-99사이만 입력가능");
        for (int i = 0; i < 5; i++){
            System.out.print("num" + (i + 1) + "  : ");
            xList[i] = sc.nextInt();
        }

        System.out.println("\n< PRINT >");
        // []를 없애기 위해 replace 문을 이용하여 제거
//        System.out.println(Arrays.toString(arr).replaceAll("[^0-9 ]",""));
        System.out.println(Arrays.toString(xList).replaceAll("[^0-9 ]",""));

        // reverse
//        StringBuffer sb = new StringBuffer(Arrays.toString(new int[]{arr[0]}).replaceAll("[^0-9 ]",""));
//        String reversedStr = sb.reverse().toString();
//        System.out.println(reversedStr);
        // 문자열로 풀어보려고 했으나 실패.
//        for (int j : arr) {
//            StringBuffer sb = new StringBuffer(Arrays.toString(new int[]{j}).replaceAll("[^0-9 ]", ""));
//            String reversedStr = sb.reverse().toString();
//            System.out.print(reversedStr + " ");
//        }

        System.out.println("< REVERSE >");

        // 배열 정방향 순서로 출력
//        for (int j : arr) {
//            System.out.print(reverse(j) + " ");
//        }
        // 배열 역방향 순서로 출력
//        for(int k = arr.length -1; k >= 0; k--){
//            System.out.print(reverse(arr[k]) + " ");
//        }
        for(int k = xList.length -1; k >= 0; k--){
            System.out.print(reverse(xList[k]) + " ");
        }


        // 테스트 코드
//        System.out.println("\n" + reverse(arr[4]));
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
