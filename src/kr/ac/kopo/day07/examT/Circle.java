package kr.ac.kopo.day07.examT;

public class Circle extends Shape{
    private int radius;
    private static final double PI = Math.PI;

    public Circle(int radius){
        this.radius = radius;
        this.name = "원";

        setArea(radius * radius * Circle.PI);
    }

    @Override
    public void prnArea() {
        System.out.printf("반지름 %d의 %s 넓이는 %f", radius, name, getArea());
    }
}
