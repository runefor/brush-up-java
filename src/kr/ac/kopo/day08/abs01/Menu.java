package kr.ac.kopo.day08.abs01;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Printer p = null; // 초기화 안해도 되긴하는데 초기화하는 것이 좀 더 좋은 방법인 것 같다.
    Menu(){}

    int choice(){
        System.out.print("출력할 프린터를 선택하여주세요. 1) 삼성, 2) LG 3) HP => ");
        return sc.nextInt();
    }

    void print(){
        int no = choice();
        switch (no){
            case 1:
                System.out.println("삼성 프린터를 선택하였습니다.");
                p = new SamsungPrinter();
//                p.print();
                break;
            case 2:
                System.out.println("LG 프린터를 선택하였습니다.");
                p = new LGPrinter();
//                p.print();
                break;
            case 3:
                System.out.println("HP 프린터를 선택하였습니다.");
                p = new HPPrinter();
//                p.print();
        }
        if(p != null)
            p.print();
        else
            System.out.println("1 ~ 3사이의 값을 입력해주세요.");
    }
}
