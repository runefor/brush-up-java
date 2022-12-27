package kr.ac.kopo.day06.exam;

import java.util.Locale;
import java.util.Scanner;

public class IceCreamMarket {

    IceCream[] ices;
    Scanner sc = new Scanner(System.in);

    void open(){

        boolean timeOut = false;
        while (!timeOut){
        System.out.print("총 몇개의 아이스크림을 구매하시겠습니까? : ");
        int iceCnt = Integer.parseInt(sc.nextLine());
        int sum = 0;
        ices = new IceCream[iceCnt];
            for(int i = 0; i < ices.length; i++){
                System.out.println("*** " + (i + 1) + "번째 아이스크림 구매 ***");
                System.out.print("아이스크림명 : ");
                String iceName = sc.nextLine();
                //sc.nextLine();
                System.out.print("아이스크림 가격 : ");
                int icePrice = Integer.parseInt(sc.nextLine());
                ices[i] = new IceCream(iceName, icePrice);
                sum += icePrice;
            }
            get();
            System.out.println("총계 : " + sum + "원");

            timeOut = isNext();
        }
    }

    boolean isNext(){
        boolean bool = false;
        System.out.print("계속할래?(Y/N) : ");
        String answer = sc.nextLine();
        answer = answer.toUpperCase();
        bool = answer.equals("Y");
        return !bool;
    }


    void get(){
        System.out.println("< 총" + ices.length + "개의 아이스크림 구매정보 출력 >");
        for(int i = 0; i < ices.length; i++){
            System.out.println("번호  아이스크림명  아이스크림가격");
            System.out.println((i + 1) + "\t\t" + ices[i].getName() + "\t\t" + ices[i].getPrice());
        }
    }

    void close(){
        IceCream.setIcecreamCnt();
        IceCream.setIcecreamTotal();
    }
}
