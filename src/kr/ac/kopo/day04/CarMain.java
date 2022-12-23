package kr.ac.kopo.day04;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "소나타";
        c1.price = 3500;
        Car c2 = new Car();
        c2.name = "모닝";
        c2.price = 1500;
        System.out.println("모델명 : " + c1.name + " 가격은 : " + c1.price + "만원");
        System.out.println("모델명 : " + c2.name + " 가격은 : " + c2.price + "만원");
    }
}
