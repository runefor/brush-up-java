package kr.ac.kopo.day06.exam;

public class IceCream {
    String name;
    int price;

    static int icecreamCnt;
    static int icecreamTotal;

    IceCream(){}
    IceCream(String name, int price){
        this.name = name;
        this.price = price;
        IceCream.icecreamCnt++;
        IceCream.icecreamTotal += price;
    }

    String getName(){
        return this.name;
    }
    int getPrice(){
        return this.price;
    }

    static void setIcecreamCnt(){
        System.out.println("판매된 총 개수 : " + IceCream.icecreamCnt + "개");
    }
    static void setIcecreamTotal(){
        System.out.println("판매된 아이스크림 총계 : " + IceCream.icecreamTotal + "월");
    }
}
