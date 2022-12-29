package kr.ac.kopo.day08.figure;

public class Rectangle extends PlaneFigure{
    public Rectangle(int width, int height) {
        super(width, height);
        this.name = "직사각형";
        setArea(width * height);
    }
    public  Rectangle(int width){
        super(width);
    }
}
