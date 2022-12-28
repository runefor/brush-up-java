package kr.ac.kopo.day07;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();

        int ran = random.nextInt(10);
        System.out.println(ran);
    }
}
