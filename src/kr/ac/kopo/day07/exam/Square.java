package kr.ac.kopo.day07.exam;

/**
 * 정사각형
 */
public class Square extends Figure{
    Square(){}
    Square(double x) {
        super(x);
    }
    @Override
    void area() {
        System.out.printf("x : %d, y : %d  정사각형의 넓이는 %d",(int)x, (int)x, (int)(x * 2));
    }
}
