package kr.ac.kopo.day05;

/**
 * 맴버 변수 학습을 위한 클래스
 */
public class Member {
    String name;
    int age;
    String phoneNumber;
    // 매개변수 아무것도 없는걸 무조건 만들어주는 것이 정신건강에 좋다고 한다.
    Member(){

    }
    Member(String name, int age){
        // this 생성자.
        // 무조건 생성자 코드에서 첫 줄에 있어야함.
        // 이게 객체가 아직 다 안만들어져 있는 상태라서 그럼.
        this(name, age, "");
//        this.name = name;
//        this.age = age;
//        this.phoneNumber = "";
    }

    Member(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    void info(){
        System.out.println("이름 : " +  name + ", 나이 : " + age
                + "살, 전화번호 : " + phoneNumber);
    }

}
