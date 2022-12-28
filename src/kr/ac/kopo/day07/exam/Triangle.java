package kr.ac.kopo.day07.exam;

/**
 * 삼각형
 */
public class Triangle extends Figure{

    Triangle(){}

    Triangle(double x, double y) {
        super(x, y);
    }

    @Override
    void area() {
        System.out.printf("x : %d, y : %d  삼각형의 넓이는 %d",(int)x, (int)y, (int)(x * y / 2));
    }
}
