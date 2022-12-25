package kr.ac.kopo.day04.exam;

import java.util.Arrays;
import java.util.Scanner;

public class ExamMain03 {
    public static void main(String[] args) {
        /*
        다음과 같은 결과를 보이는 프로그램 작성

        총 몇개의 아이스크림을 구매하시겠습니까? 3(입력)

        *** 1번째 아이스크림 구매 ***

        아이스크림명 : 비비빅(입력)

        아이스크림가격 : 1000(입력)


        *** 2번째 아이스크림 구매 ***

        아이스크림명 : 월드콘(입력)

        아이스크림가격 : 2000(입력)


        *** 3번째 아이스크림 구매 ***

        아이스크림명 : 붕어싸만코(입력)

        아이스크림가격 : 1500(입력)


        < 총 3개의 아이스크림 구매정보 출력 >

        번호  아이스크림명  아이스크림가격

        1    비비빅       1000

        2    월드콘       2000

        3    붕어싸만코    1500
        */
        Scanner sc = new Scanner(System.in);
        String[] iceName = new String[3];
        int[] icePrice = new int[3];
        for(int i = 0; i < iceName.length; i++){
            System.out.println("*** " + (i + 1) + "번째 아이스크림 구매 ***");
            System.out.print("아이스크림명 : ");
            iceName[i] = sc.nextLine();
            System.out.print("아이스크림 가격 : ");
            icePrice[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println(Arrays.toString(iceName));
        System.out.println(Arrays.toString(icePrice));

        System.out.println("< 총 3개의 아이스크림 구매정보 출력 >");
        System.out.println("번호  아이스크림명  아이스크림가격");
        for(int i = 0; i < iceName.length; i++){
            System.out.println((i + 1) + "\t" + iceName[i] + "  " + icePrice[i]);
        }
    }
}
