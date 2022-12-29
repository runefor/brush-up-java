package kr.ac.kopo.day08;

public class CastMain01 {
    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.print();
//
//        Child01 c1 = new Child01();
//        c1.print();
//
//        Parent cp = new Child02();
//        System.out.println(cp.name);
        print(new Child01());
        print(new Child02());
        print(new Parent());

    }

    static void print(Parent p){
//        System.out.println("p instanceof Child01 : " + (p instanceof Child01));
//        System.out.println("p instanceof Child02 : " + (p instanceof Child02));
//        System.out.println("p instanceof Parent : " + (p instanceof Parent));
//        p.print();

        if (p instanceof Child01){
            ((Child01) p).study();
            p.print();
        } else if (p instanceof Child02) {
            ((Child02) p).game();
            p.print();
        } else {
            p.print();
        }
    }
}
