package kr.ac.kopo.day02;

import java.util.Objects;
import java.util.Scanner;

public class IFMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("일어난 시간을 입력하세여 ex)715 7시15분 : ");
        int 기상시간 = Integer.parseInt(sc.nextLine());
        System.out.println("아침에 일어난다.");


        if (기상시간 < 800){
            System.out.println("걸어서");
        }else {
            System.out.println("늦었네 그럼 뭐 타고 갈꺼야?");
            System.out.print("버스? 택시? : ");
            String str = sc.nextLine();
            if (Objects.equals(str, "버스")){
                System.out.println("버스타고");
            }else {
                System.out.println("택시타고");
            }

        }

        System.out.println("학교에 간다!");
    }
}
