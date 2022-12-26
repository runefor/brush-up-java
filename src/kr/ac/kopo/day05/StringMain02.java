package kr.ac.kopo.day05;

public class StringMain02 {
    public static void main(String[] args) {
        String s = new String("Hello");
        String s1 = new String("Hello");

        System.out.println("s의 길이 : " + s.length());

        System.out.println("3번째에 위치한 문자 : " + s.charAt(3));
        System.out.println("5번째에 위치한 문자 : " + s.charAt(4));

//        String s2 = "Hello";
//        String s3 = "Hello";
        // 같은 주소를 가지고 있어서 ture가 나올 수 있다.
//        if (s2 == s3){
//            System.out.println("둘이 같아!");
//        }else {
//            System.out.println("둘이 달라!");
//        }

        // new 키워드로 했을 때
        // s2 == s3를 하게 되면 주소값을 비교해서 false로 나오게 된다.
        String s2 = new String("Hello");
        String s3 = new String("Hello");

        if (s2.equals(s3)){
            System.out.println("둘이 같아!");
        }else {
            System.out.println("둘이 달라!");
        }

        System.out.println("Hello, hello 비교 : " + "Hello".equals("hello"));
        System.out.println("Hello, hello 비교 : " + "Hello".equalsIgnoreCase("hello"));


    }
}
