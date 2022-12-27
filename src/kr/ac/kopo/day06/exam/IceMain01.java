package kr.ac.kopo.day06.exam;

import java.util.Scanner;

public class IceMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String iceName;
        int icePrice, total = 0, totalPrice = 0;
        String yesOrNo;
        while (true){
            System.out.print("총 몇개의 아이스크림을 구매하시겠습니까? : ");
            int iceCnt = Integer.parseInt(sc.nextLine());
            Ice[] ices = new Ice[iceCnt];
            for(int i = 0; i < ices.length; i++){
                System.out.println("*** " + (i + 1) + "번째 아이스크림 구매 ***");
                System.out.print("아이스크림명 : ");
                iceName = sc.nextLine();
                System.out.print("아이스크림 가격 : ");
                icePrice = Integer.parseInt(sc.nextLine());

                ices[i] = new Ice(iceName, icePrice);
            }
            System.out.println("< 총" + ices.length + "개의 아이스크림 구매정보 출력 >");
            for(int i = 0; i < ices.length; i++){
                ices[i].iceInfo(i);
            }
            System.out.print("계속 구매하시겠습니까?");
//            sc.nextLine();
            yesOrNo = sc.nextLine();
            if(yesOrNo.equals("y")){
                for(int i = 0; i < ices.length; i++){
                    totalPrice += ices[i].price;
                }
            }else {
                for(int i = 0; i < ices.length; i++){
                    totalPrice += ices[i].price;
                }
                Ice.total(totalPrice);
                break;
            }
        }
    }
}
