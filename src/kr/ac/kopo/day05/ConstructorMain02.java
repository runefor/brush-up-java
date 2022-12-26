package kr.ac.kopo.day05;

public class ConstructorMain02 {
    public static void main(String[] args) {
        Member m = new Member("홍길동", 26, "010-1234-0000");
        m.info();
        Member m2 = new Member("고길동", 30);
        m2.info();

    }
}
