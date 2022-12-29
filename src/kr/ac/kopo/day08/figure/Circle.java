package kr.ac.kopo.day08.figure;

public class Circle extends Figure{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
        this.name = "원";

        setArea(radius * radius * Math.PI);
    }
    @Override
    public void prnArea() {
        System.out.printf("반지름 %d의 %s 넓이는 %f\n", radius, name, getArea());
    }
}
