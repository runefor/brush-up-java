package kr.ac.kopo.day06;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee.employeeCntInfo();

        Employee e1 = new Employee("양재형", "사원" , 3_000);
        Employee e2 = new Employee("이정훈", "사원", 4_000);
        Employee e3 = new Employee("김주형", "팀장", 4_500);

        e1.info();
        e2.info();
        e3.info();

//        int cnt = Employee.class.getDeclaredFields().length;
//        System.out.println(cnt);

        Employee.employeeCntInfo();
    }
}
