package kr.ac.kopo.day06.my;

public class Ice {
    String name;
    int price;

    static int iceTotalCnt;
    static int iceTotalPrice;

    Ice(){}

    Ice(String name, int price){
        this.name = name;
        this.price = price;
        Ice.iceTotalCnt++;
        Ice.iceTotalPrice += price;
    }

    String getIceName(){
        return this.name;
    }
    int getIcePrice(){
        return this.price;
    }

    static void iceTotalInfo(){
        System.out.printf("판매된 총 아이스크림 개수 : %d\n", Ice.iceTotalCnt);
        System.out.printf("판매된 총 아이스크림 가격 : %d\n", Ice.iceTotalPrice);

    }
}
