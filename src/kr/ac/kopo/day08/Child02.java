package kr.ac.kopo.day08;

public class Child02 extends Parent{
    int age;
    String hobby;
    Child02(){
        name = "자식2";
        age = 17;
        hobby = "게임";
    }

    void game(){
        System.out.println("나는 게임을 한다.");
    }
    void sing(){
        System.out.println("나는 노래를 한다.");
    }

    @Override
    void print() {
        System.out.println("나는 자식2이다");
    }
}
