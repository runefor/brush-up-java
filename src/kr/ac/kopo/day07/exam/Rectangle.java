package kr.ac.kopo.day07.exam;

/**
 * 직사각형
 */
public class Rectangle extends Figure{
    Rectangle(){}

    Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    void area() {
        System.out.printf("x : %d, y : %d  직사각형의 넓이는 %d",(int)x, (int)y, (int)(x * y));
    }
}
