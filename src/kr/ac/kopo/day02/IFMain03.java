package kr.ac.kopo.day02;

public class IFMain03 {
    public static void main(String[] args) {
        int time = 810;

        System.out.println("기상한다");

        // 8시이후 8시 15분이전 출발
//		if(800 <= time && time < 815) {
        if(time >= 800 && time < 815) {
            System.out.println("버스타고");
        }

        if(time < 815) {

            if(time < 800) {
                System.out.println("걸어서");
            } else {
                System.out.println("버스타고");
            }

        } else {
            System.out.println("택시타고");
        }

		/*
		if(time < 800) {
			System.out.println("걸어서");
		} else {
			// 출발시간이 8시 이후
			if(time < 815){
				System.out.println("버스타고");
			} else {
				System.out.println("택시타고");
			}
		}
		*/
        System.out.println("학교간다");
    }
}
