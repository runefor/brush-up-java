package kr.ac.kopo.day05;

/**
 * 테스트용 개의 클래스임.
 */
public class Dog {

    String name;
    int age;
    Dog(){
        System.out.println("생성자 호출!!");
    }
    Dog(String n){
        this.name = n;
    }
    Dog(String n, int a){
        this.name = n;
        this.age = a;
    }
}
