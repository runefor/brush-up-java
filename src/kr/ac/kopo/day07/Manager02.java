package kr.ac.kopo.day07;

public class Manager02 extends Employee {
    /**
     * 관리 사원 목록 저장을 위한 배열
     */
    Employee[] empList;

    Manager02() {
    }

    Manager02(String name, int salary, String grade, Employee[] empList) {
        super(name, salary, grade);
        this.empList = empList;
    }

    // 메서드 오버라이드(Method Override) : 매서드 재정의
    @Override
    void info() {
        System.out.println("---------------------------------------------");
        super.info();
        System.out.println("관리 사원 목록");
        for (Employee e : empList
        ) {
            e.info();
        }
    }
}
