package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc.next(); // 문자열을 입력 받는 거.

        /*
        System.out.print("문자 아무거나 입력해주세요. 근데 공백은 안되요. :  ");
        String str = sc.next(); // 공백 인식 안함 ㅅㄱ, 한마디로 단어 단위로 입력 받음~~
        System.out.println(str);
        */

        System.out.print("문자 아무거나 입력해주세요. 이제 공백도 돼요. :  ");
        String str = sc.nextLine(); // 문장 단위로 입력 받음~~
        System.out.println(str);

        System.out.print("이번엔 정수를 입력해줘~ : ");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.print("이번엔 실수를 입력해줘~ : ");
        double num2 = sc.nextDouble();
        System.out.println(num2);

//        System.out.print("문자를 입력해줘! : ");
//        char ch = sc.nextLine().charAt(0);
//        System.out.println(ch);
    }
}
