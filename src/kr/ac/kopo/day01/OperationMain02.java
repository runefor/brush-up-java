package kr.ac.kopo.day01;

public class OperationMain02 {
    public static void main(String[] args) {
        // 문제를 위한 문제

        int a = 1, b = -1, c = 0;

        // a = 2, b = 0, c = 1
        // 참, 거짓, 참
        // 거짓, 거짓
        //System.out.println(++a > 0 && ++b > 0 && ++c > 0);
        // 거짓이 되었기 때문에 c의 값은 변하지 않음.
        // 이거 변태끼가 있는거임
        // 이딴식으로 짜지 마셈....
        // a = 2, b = 0, c = 0
        //System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);

        // a = 2, b = 0, c = 1
        // 엔드 연산이 우선 순위가 높다고 한다. 범위 적은게 우선순위가 높음
        // 아래의 경우는 ++a > 0 || x
        // x = ++b > 0 && ++c > 0이다.
        // || = 참.
        // 뒤에꺼 연산을 안하니까.
        System.out.println(++a > 0 || ++b > 0 && ++c > 0);
        // a = 2, b = -1, c = 0
        System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);
    }
}
