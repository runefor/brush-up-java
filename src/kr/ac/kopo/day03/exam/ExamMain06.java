package kr.ac.kopo.day03.exam;

public class ExamMain06 {
    public static void main(String[] args) {
        int space = 4;
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                if(j <= space || j >= 10 - space){
                    System.out.print('-');
                }else {
                    System.out.print('*');
                }
            }
            System.out.println();

            if(i < 5){
                space--;
            }else {
                space++;
            }
        }
    }
}
