package kr.ac.kopo.day07;

public class Manager01 extends Employee{
    /** 관리 사원 목록 저장을 위한 배열 */
    Employee[] empList;

    Manager01(){}
    Manager01(String name, int salary, String grade, Employee[] empList){
        // 내꺼에 맴버 변수가 없다면 this를 써서 부모 꺼를 쓸 수도 있다.
        this.name = name;
        this.salary = salary;
        this.grade = grade;
        this.empList = empList;
    }

    void info(){
        System.out.println("---------------------------------------------");
        super.info();
        System.out.println("관리 사원 목록");
        for (Employee e: empList
        ) {
            e.info();
        }
    }
}
