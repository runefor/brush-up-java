package kr.ac.kopo.day08.figure;

public class Square extends Rectangle{
    public Square(int width) {
        super(width);
        this.name = "정사각형";

        setArea(width * width);
    }

    @Override
    public void prnArea() {
        System.out.printf("width : %d, height : %d의 %s 넓이는 %d\n", getWidth(), getWidth(), name, (int)getArea());
    }
}
