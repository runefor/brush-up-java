package kr.ac.kopo.day05;

public class StringMain01 {
    public static void main(String[] args) {
        String s = new String("「 」");
        char[] chs = {'H', 'e', 'l', 'l', 'o'};
        byte[] by = {72, 101, 108, 108, 111};
        String s2 = new String(chs);
        String s3 = new String(chs, 1, 3);
        String s4 = new String(by);
        System.out.printf("[%s]\n", s);
        System.out.printf("[%s]\n", s2);
        System.out.printf("[%s]\n", s3);
        System.out.printf("[%s]\n", s4);
    }
}
