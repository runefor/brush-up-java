package kr.ac.kopo.day05.exam;

public class MyStringMain {
    public static void main(String[] args) {
        MyString m1 = new MyString("Hello");
        MyString m2 = new MyString("HeLLo");

        if (m1.equalsIgnoreCase(m2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
    }
}
