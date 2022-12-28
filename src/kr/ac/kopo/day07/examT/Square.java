package kr.ac.kopo.day07.examT;

public class Square extends Rectangle{

    public Square(int width) {
        super(width, width);
        this.name = "정사각형";

        setArea(width * width);
    }
    
}
