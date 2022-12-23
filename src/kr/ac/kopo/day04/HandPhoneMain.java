package kr.ac.kopo.day04;

public class HandPhoneMain {
    public static void main(String[] args) {
        HandPhone hp = new HandPhone();

        hp.name = "홍길동";
        hp.phoneNumber = "010-1234-5678";
        hp.company = "샘성";

        System.out.printf("%s %s %s\n", hp.name, hp.phoneNumber, hp.company);

        HandPhone hp2 = new HandPhone();
        hp2.name = "윤길동";
        hp2.phoneNumber = "010-4321-8765";
        hp2.company = "사과";

        System.out.printf("%s %s %s\n", hp2.name, hp2.phoneNumber, hp2.company);

        HandPhone hp3 = new HandPhone();
        hp3.name = "강길동";
        hp3.phoneNumber = "010-6732-3414";
        hp3.company = "모토로라";
        System.out.printf("%s %s %s\n", hp3.name, hp3.phoneNumber, hp3.company);

        HandPhone[] hps = new HandPhone[]{
          hp, hp2, hp3
        };

        for (HandPhone h: hps
             ) {
            System.out.println(
                    "소유주 : " + h.name +
                    ", 전화번호 : " + h.phoneNumber +
                    ", 제조사 : " + h.company
            );
        }
    }
}

class HandPhone{
    String name; // 소유주
    String phoneNumber; // 전화번호
    String company; // 제조사
}
