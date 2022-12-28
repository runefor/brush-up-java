package kr.ac.kopo.day07.examT;
/**
 * 삼각형
 */
public class Triangle extends PlaneFigure{

    public Triangle(int width, int height) {
        super(width, height);
        this.name = "삼각형";

        setArea(width * height / 2);
    }

    

    
    
    
}
