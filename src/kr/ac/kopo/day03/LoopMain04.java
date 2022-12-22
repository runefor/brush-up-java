package kr.ac.kopo.day03;

public class LoopMain04 {
    public static void main(String[] args) {
//        for (int i = 0; i < 6; i++){
//            for(int j = 1; j <= 5; j++){
//                System.out.printf("%d", j);
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < i + 1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // 약간 실패작~~
//        for (int i = 5; i >= 0; i--){
//            for (int k = i - 1; k > 0; k--){
//                System.out.print(' ');
//            }
//            for (int j = 5; j > i - j; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i<=5; i++){
//            for (int j = 1; j <= 5 - i; j++){
//                System.out.print(' ');
//            }
//            for(int k = 1; k <= i; k++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

//        for(int i = 1; i <= 5; i++){
//            for (int j = 1; j <= 5; j++) {
//                if (j < 6 -i){
//                    System.out.print(' ');
//                }else {
//                    System.out.print('*');
//                }
//            }
//            System.out.println();
//        }


//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < i + 1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 9; i++) {
//            if (i <= 5) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//            } else {
//                for (int k = 1; k <= 10 -i; k++){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

//        int nStar = 1;
//        for (int i = 0; i <= 9; i++) {
//
//            for (int j = 1; j <= nStar; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//
//            if (i < 4) {
//                ++nStar;
//            } else {
//                --nStar;
//            }
//
//        }


//        for (int i = 0; i < 10; i++) {
//
//            if(i <= 5){
//                for(int j = 1; j <= 5 - i; j++){
//                    System.out.print('-');
//                }
//                for(int j = 1; j <= i * 2 + 1; j++){
//                    System.out.print('*');
//                }
//
//            }else {
//                for(int j = 1; j <= -5 + i; j++){
//                    System.out.print('-');
//                }
//                for(int j = 1; j <= (9 - i) * 2 + 1; j++){
//                    System.out.print('*');
//                }
//
//            }
//            System.out.println();
//        }


        for (int i = 1; i <= 9; i++) {

            if(i <= 5){
                for(int j = 1; j <= 5 - i; j++){
                    System.out.print('-');
                }
                for(int j = 1; j <= (i - 1) * 2 + 1; j++){
                    System.out.print('*');
                }

            }else {
                for(int j = 1; j <= -5 + i; j++){
                    System.out.print('-');
                }
                for(int j = 1; j <= (9 - i) * 2 + 1; j++){
                    System.out.print('*');
                }

            }
            System.out.println();
        }


    }
}
