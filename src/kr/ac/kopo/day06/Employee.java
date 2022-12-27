package kr.ac.kopo.day06;

/**
 * 사원 정보 클래스 만들고 파.
 */
public class Employee {
    String name;
    String grade;
    int salary;
    static int employeeCnt;

    Employee(){
        Employee.employeeCnt++;
    }
    Employee(String name, String grade, int salary){
        this();
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }

    void info(){
        System.out.printf("사원명 : %s, 직급 : %s, 연봉 : %d\n",
                name, grade, salary);
    }
    static void employeeCntInfo(){
        System.out.printf("총합 : %d명의 사원이 있습니다.\n", Employee.employeeCnt);
    }
}
