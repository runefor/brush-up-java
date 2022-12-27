package kr.ac.kopo.day06;

public class StringMain04 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        String str = "";

//        for(int i = 0; i < 100000; i++){
//            str = str + i;
//        }

        StringBuffer str = new StringBuffer();

        for(int i = 0; i < 1000000; i++){
            str.append(i);
        }

//        StringBuilder str = new StringBuilder();
//
//        for(int i = 0; i < 100000; i++){
//            str.append(i);
//        }


        long end = System.currentTimeMillis();

        System.out.println((end - start) / 1000.0);
    }
}
