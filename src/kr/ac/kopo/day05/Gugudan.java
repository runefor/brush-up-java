package kr.ac.kopo.day05;

/**
 * 구구단과 관련된 메서드들을 모아놓은 클래스
 *
 * @author fkjy1
 * @version 1.0
 * @since 2022-12-26
 */
public class Gugudan {

    // 아래 적은 것이 문서화 주석임.
    // 파이썬 함수 위에 """ """ 적는거랑 똑같은듯.

    /**
     * 호출자에서 넘겨준 단을 이용하여 구구단을 출력하는 메서드
     *
     * @param dan 출력할 구구단 단
     */
    public void print(int dan) {
        System.out.println("*** " + dan + " ***");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
    }

    /**
     * 전체 구구단(2 ~ 9단) 출력
     */
//    void print(){
//        for (int dan = 2; dan <= 9; dan++){
//            System.out.println("*** " + dan + " ***");
//            for(int i = 1; i <= 9; i++){
//                System.out.printf("%d * %d = %d\n", dan, i, dan * i);
//            }
//        }
//    }
//    void print() {
//        for (int dan = 2; dan <= 9; dan++) {
//            print(dan);
//        }
//    }
    public void print(){
        print(2, 9);
    }

    /**
     * 시작과 끝을 받아서 구구단을 출력해주는 메서드
     *
     * @param start 시작단
     * @param end   종료단
     */
    public void print(int start, int end) {
        for (int dan = start; dan <= end; dan++) {
            print(dan);
        }
    }

}
