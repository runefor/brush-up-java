package kr.ac.kopo.day08.figure01;

import java.util.Random;

public class ShapeController {
    private Random r;

    public ShapeController(){
        r = new Random();
    }

    private int getRandom(int start, int end){
        return r.nextInt(end - start) + start;
    }

    private int choiceShape(){
        System.out.print("1. 삼각형 2. 직사각형 3. 정사각형 4. 원 : ");
        int num = getRandom(1, 4);
        System.out.println("1 ~ 4 중 선택된 숫자 : " + num);
        return num;
    }

    private Shape getShape(int type){
        Shape shape = null;
        switch (type){
            case 1:
                shape = new Triangle(getRandom(2, 10), getRandom(2, 10));
                shape.printArea();
                break;
            case 2:
                shape = new Rectangle(getRandom(2, 10), getRandom(2, 10));
                shape.printArea();
                break;
            case 3:
                shape = new Square(getRandom(2, 10));
                shape.printArea();
                break;
            case 4:
                shape = new Circle(getRandom(2, 10));
                shape.printArea();
                break;
        }
        return shape;
    }

    public void process(){
        int type = choiceShape();
        Shape shape = getShape(type);
        shape.printArea();
    }
}
