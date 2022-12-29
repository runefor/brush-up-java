package kr.ac.kopo.day08.abs01;

public abstract class Printer {

    String modelNo;
    void info(){
        System.out.println("모델명 : " + modelNo);
    }
    abstract void print();
}
