package kr.ac.kopo.day04;

public class MethodMain01 {
    public static void main(String[] args) {
        int num = 10;

        int re = prnStar(num);
        System.out.println("리턴값 : " + re);
    }

    static int prnStar(int data){
        int a = 1;
        System.out.println("data : " + data);
        return a;
    }

}
