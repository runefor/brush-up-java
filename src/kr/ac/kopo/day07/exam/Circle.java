package kr.ac.kopo.day07.exam;

/**
 * 원
 */
public class Circle extends Figure{
    Circle(){}

    Circle(double x) {
        super(x);
    }

    @Override
    void area() {
        System.out.printf("x : %d, y : %d  원의 넓이는 %f",(int)x, (int)x, (x * Math.PI * 2));
    }
}
