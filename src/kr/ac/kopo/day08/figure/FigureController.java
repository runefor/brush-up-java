package kr.ac.kopo.day08.figure;

import java.util.Random;

public class FigureController {
    private Figure figure = null;
    private Random r = new Random();
    private int figu = 0;

    public FigureController(){}

    public void start(){
        info();
        result();
    }
    private void info(){
        System.out.println("도형의 넓이를 출력하는 프로그램");
        System.out.println("1. 삼각형 2. 정사각형 3. 직사각형 4. 원");
        figu = r.nextInt(4) + 1;
    }

    private int random(){
        return r.nextInt(9) + 2;
    }

    private void result(){
        switch (figu){
            case 1:
                figure = new Triangle(random(), random());
                figure.prnArea();
                break;
            case 2:
                figure = new Square(random());
                figure.prnArea();
                break;
            case 3:
                figure = new Rectangle(random(), random());
                figure.prnArea();
                break;
            case 4:
                figure = new Circle(random());
                figure.prnArea();
                break;
        }
    }
}
