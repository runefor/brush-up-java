package kr.ac.kopo.day08.figure;

public abstract class Figure {
    private double area;
    protected String name;

    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }

    public abstract void prnArea();
}
