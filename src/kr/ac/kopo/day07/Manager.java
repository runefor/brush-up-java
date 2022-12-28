package kr.ac.kopo.day07;

public class Manager extends Employee{
    /** 관리 사원 목록 저장을 위한 배열 */
    Employee[] empList;

    Manager(){}
    Manager(String name, int salary, String grade, Employee[] empList){
        super.name = name;
        super.salary = salary;
        super.grade = grade;
        this.empList = empList;
    }

    void info(){
        super.info();
        System.out.println("관리 사원 목록");
        for (Employee e: empList
             ) {
            e.info();
        }
    }
}
