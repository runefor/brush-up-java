package kr.ac.kopo.day08.figure;

public class PlaneFigure extends Figure{
    private int width;
    private int height;
    public PlaneFigure(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public PlaneFigure(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void prnArea(){
        System.out.printf("width : %d, height : %dė %s ëėīë %d\n", getWidth(), getHeight(), name, (int)getArea());
    }
}
