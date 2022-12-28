package kr.ac.kopo.day07.exam;

public class Figure {

    double x, y;
    Figure(){}

    Figure(double x){
        this.x = x;
    }
    Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    void area(){}

    double getX(){
        return this.x;
    }

    double getY(){
        return this.y;
    }
}
