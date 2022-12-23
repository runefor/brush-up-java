package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {
    public static void main(String[] args) {
        String[] names = new String[]{
                "홍길동",
                "강길동",
                "왠길동"
        };

//        System.out.println("첫번째 이름 : " + names[0]);
//        System.out.println("두번째 이름 : " + names[1]);
//        System.out.println("세번째 이름 : " + names[2]);

        // 배열의 전체 원소를 출력하는 방법.
        // 1. index를 이용하여 출력하는 방법.

        System.out.println("index를 이용하여 출력하는 방법.");
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }

        // 2. 1.5버전의 for문

        System.out.println("\nfor-each 문을 이용한 방법");
        for (String i: names
             ) {
            System.out.print(i + " ");
        }

        // 3. Arrays.toString() 메소드를 이용할 수 있음.

        // Arrays 오브젝트의 toString() 메서드를 이용하여 출력할 수 있음.

        System.out.println("\n" + Arrays.toString(names));

    }
}
