package kr.ac.kopo.day08;

public class Child01 extends Parent{
    int age;

    Child01(){
        name = "자식01";
        age = 20;
    }

    void study(){
        System.out.println("나는 공부한다.");
    }
    void sleep(){
        System.out.println("나는 잡니다.");
    }

    @Override
    void print() {
        System.out.println("나는 자식입니다.~");
    }
}
