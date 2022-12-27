package kr.ac.kopo.day06;

import java.util.Arrays;

public class StringMain03 {
    public static void main(String[] args) {

        String[] names = {
                "홍길동",
                "홍길순",
                "윤길동",
                "강길순",
                "홍길동",
                "김철수",
                "윤길수",
                "엔갈길",
                " 공백 제거 "
        };

        System.out.println(" < 이름이 홍길동인 회원 목록 출력 > ");

        for (String name : names) {
            if (name.equals("홍길동")) {
                System.out.println(name);
            }
        }

        System.out.println("< 성이 홍씨인 회원 목록 출력 >");
        // 성이 한글자인 사람한테는 맞는데 두글자 이상은 아님.
        for (String name : names) {
            if (name.charAt(0) == '홍') {
                System.out.println(name);
            }
        }
        System.out.println();
        for (String name : names) {
            if (name.startsWith("홍")) {
                System.out.println(name);
            }
        }

        System.out.println(" < 이름이 길동인 회원 목록 출력 >");

        for (String name : names) {
            if (name.endsWith("길동"))
                System.out.println(name);
        }

        System.out.println(" < 이름에 길이 포함된 회원 목록 출력 >");

        for (String name : names) {
            if (name.contains("길"))
                System.out.println(name);
        }

        System.out.println();

        String str = "apple";
        String str2 = "apple";
        int cmp = str.compareTo(str2);
        System.out.println(cmp);

        if (cmp == 0) {
            System.out.println(str + " == " + str2);
        } else if (cmp > 0) {
            System.out.println(str + " > " + str2);
        } else {
            System.out.println(str + " < " + str2);
        }

        System.out.println(names[0].indexOf('홍'));
        System.out.println(names[0].substring(0, 2));
        System.out.println(names[0].concat(names[1]));
        System.out.println(names[0].replace("홍", "강"));
        System.out.println(names[names.length - 1].trim());

        String sp = "Hello it's me~";

        System.out.println(Arrays.toString(sp.split(" ")));

        double num = 100000;
        System.out.printf("실수 : %f\n", num);
        System.out.printf("valueOf(num) : %s\n", String.valueOf(num) + 1);
    }
}
