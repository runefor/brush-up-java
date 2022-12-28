package kr.ac.kopo.day07.exam;

import java.util.Random;

public class FigureContller {
    Figure figure;
    Random r = new Random();
    int figu,x, y;
    FigureContller(){}

    void start(){
        info();
        instance();
        result();
    }

    void info(){
        System.out.println("도형의 넓이를 출력하는 프로그램");
        System.out.println("1. 삼각형 2. 정사각형 3. 직사각형 4. 원");
        figu = r.nextInt(4) + 1;
    }
    void instance(){
        if(figu == 2 || figu == 4){
            x = r.nextInt(9) + 2;
        }else {
            x = r.nextInt(9) + 2;
            y = r.nextInt(9) + 2;
        }
    }

    void result(){
        switch (figu){
            case 1:
                figure = new Triangle(x, y);
                figure.area();
                break;
            case 2:
                figure = new Square(x);
                figure.area();
                break;
            case 3:
                figure = new Rectangle(x, y);
                figure.area();
                break;
            case 4:
                figure = new Circle(x);
                figure.area();
                break;
        }
    }


}
