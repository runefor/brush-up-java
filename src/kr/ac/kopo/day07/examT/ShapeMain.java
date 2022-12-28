package kr.ac.kopo.day07.examT;

public class ShapeMain {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.prnArea();

        Triangle t = new Triangle(6, 4);
        t.prnArea();

        Square s = new Square(6);
        s.prnArea();
    }
}
