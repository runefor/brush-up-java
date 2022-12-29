package kr.ac.kopo.day08;

public class CastMain02 {
    public static void main(String[] args) {
        Parent p = new Child01();
        Child01 c = (Child01) p;
        c.study();
        c.sleep();
        c.print();
    }
}
