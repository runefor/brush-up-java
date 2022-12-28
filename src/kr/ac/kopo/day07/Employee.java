package kr.ac.kopo.day07;

public class Employee {
    String name;
    int salary;
    String grade;

    Employee(){}
    Employee(String name, int salary, String grade){
        this.name = name;
        this.salary = salary;
        this.grade = grade;
    }
    void info(){
        System.out.printf("사원명 : %s, 연봉 : %d만원, 직급 : %s\n", name, salary, grade);
    }
}
