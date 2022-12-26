package kr.ac.kopo.day05;

public class MethodMain02 {
    // 매서드 오버로딩(Overloading)
    // 클래스 내에 메서드명이 같으면서 매개변수가 다른 것을 가리키는 말.
    public static void main(String[] args) {
        Method m = new Method();
        Method m2 = new Method();

        m.call();
        m.call(2);
        m.call(2, 't');
        m.call("str");
        m.call2();
    }

}
