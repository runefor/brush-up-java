package kr.ac.kopo.day02;

public class LoopMain03 {
    public static void main(String[] args) {
//        for (int i = 5; i > 0; i--) {
//            System.out.printf("%d", i);
//        }
//        System.out.println(" ");
//        for (int i = 1; i <= 5; i++) {
//            System.out.printf("%d", (6 - i));
//        }

        /*
        문제 : 1 ~ 100까지의 정수를 출력
        1 2 ~ 100

        100 ~ 1 사이의 정수 출력

        100 99 ~ 1

        1 ~ 100 홀수 출력

        1 3 5 7 9 11 ~ 99

        100 ~ 1 짝수
        한 라인에 정수를 5개씩 출력

        100 98 96 94 90

         */

        // 1.
        for (int i = 1; i <= 100; i++){
            System.out.print(i + " ");
        }
        // 2번 문제
        System.out.println();
        for (int i = 100; i >= 1; i--){
            System.out.print(i + " ");
        }
        // 3번 문제
        System.out.println();
        for (int i = 1; i <= 100; i += 2){
            System.out.printf("%d ", i);
        }
        // 3번 문제 ++로 만들기
        System.out.println();
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 1)
                System.out.printf("%d ", i);
        }
        // 4번 문제 맨첨에 생각한거.
        System.out.println();
        int cnt = 0;
        for (int i = 100; i > 0; i -= 2){
            System.out.printf("%d ", i);
            cnt++;
            if (cnt % 5 == 0){
                System.out.println();
            }
        }
        // 최종안 ?
        System.out.println();
        int cnt2 = 0;
        for (int i = 100; i > 0; i--){
            if (i % 2 == 0){
                System.out.printf("%d ", i);
                cnt2++;
                if (cnt2 % 5 == 0){
                    System.out.println();
                }
            }
        }

        // 교수님 답안으로 쫌 고친거 1
        System.out.println();
        int cnt3 = 0;
        for (int i = 100; i > 0; i--){
            if (i % 2 == 0){
                System.out.printf("%d ", i);
                if (++cnt3 % 5 == 0){
                    System.out.println();
                }
            }
        }
        // 교수님 답안으로 쫌 고친거 2
        System.out.println();
        int cnt4 = 0;
        for (int i = 100; i > 0; i -= 2){
            System.out.printf("%d ", i);
            if (++cnt4 % 5 == 0){
                System.out.println();
            }
        }


    }
}
