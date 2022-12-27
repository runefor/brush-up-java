package kr.ac.kopo.day06.my;

import java.util.Scanner;

public class IceController {
    
    Scanner sc = new Scanner(System.in);
    Ice[] ices;
    int iceCnt, iceTotal = 0;
    String yString;
    boolean timeOut = false;
    void start(){
        while(!timeOut){
            System.out.print("구매할 아이스크림의 갯수를 입력해주세요. : ");
            iceCnt = Integer.parseInt(sc.nextLine());
            ices = new Ice[iceCnt];
            iceInput(); // 아이스크림 입력
            iceInfo(); // 입력한 아이스크림 정보 출력
            iceRePrice(); // while문 유지할 것인지 탈출할 것인지
        }
    }
    
    void iceInput(){
        for(int i = 0; i < ices.length; i++){
            System.out.printf("%d번째 아이스크림\n", i + 1);
            System.out.print("아이스크림 이름 : ");
            String iceName = sc.nextLine();
            System.out.print("아이스크림 가격 : ");
            int icePrice = Integer.parseInt(sc.nextLine());
            ices[i] = new Ice(iceName, icePrice);
            iceTotal += icePrice;
        }
    }
    
    void iceInfo(){
        System.out.printf("총 %d개의 아이스크림\n", ices.length);
        System.out.println("번호    아이스크림 이름     아이스크림 가격\n");
        for(int i = 0; i < ices.length; i++){
            System.out.printf("%d \t %s \t %d\n", (i + 1), ices[i].getIceName(), ices[i].getIcePrice());
        }
        System.out.printf("총 가격 %d원", iceTotal);
    }
    
    void iceRePrice(){
        System.out.print("아이스크림을 또 사시겠습니까? : (Y/N)");
        yString = sc.nextLine().toUpperCase();
        timeOut = !yString.equals("Y");
    }

    void end(){
        Ice.iceTotalInfo();
    }
}
