package kr.ac.kopo.day07;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("양양양", 5_000, "사장");
        Employee e2 = new Employee("동동동", 8_000, "회장");
        Employee e3 = new Employee("훈훈훈", 9_000, "CEO");
        Employee e4 = new Employee("주주주", 9_000, "사원");
        Employee e5 = new Employee("잔잔잔", 9_000, "대리");

        Employee[] empList = {e1, e2, e3};
        // 상속해서 'new' 를 했기 때문에 부모 클래스랑 자식 클래스랑 같이 만들어진다.
        Manager02 m = new Manager02("양관리", 10_000, "관리직", empList);

        e1.info();
        e2.info();
        e3.info();
        e4.info();
        e5.info();

        m.info();
    }
}
