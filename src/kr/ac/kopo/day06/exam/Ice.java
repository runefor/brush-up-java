package kr.ac.kopo.day06.exam;

public class Ice {
    String name;
    int price;
    int total;
    static int iceCnt;

    Ice(){
        Ice.iceCnt++;
    }
    Ice(String name, int price){
        this();
        this.name = name;
        this.price = price;
    }

    void iceInfo(int i){
        System.out.println("번호  아이스크림명  아이스크림가격");
        System.out.println((i + 1) + "\t" + this.name + "  " + this.price);

    }

    static void total(int price){
        System.out.printf("총 구매 개수 : %d개\n", Ice.iceCnt);
        System.out.printf("총 구매 액 : %d원", price);
    }
}
