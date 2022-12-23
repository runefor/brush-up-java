package kr.ac.kopo.day04;

public class ArrayMain03 {
    public static void main(String[] args) {
        /*
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (i + 1) * 10;
        }

         */

        //  new 라는 키워드로 중간에 바꿀 수 있다.
        int[] arr = new int[]{
                10, 20, 30, 40, 50
        };
        arr = new int[]{
                100, 200, 300
        };
        // 초기화를 선언과 동시에만 할 수 있다.
        // 이 배열 초기화는 arr2 = { 100, 200, 300,} 이런거 안됨.
        int[] arr2 = {
                60, 70, 80, 90, 100
        };

        for(int i : arr){
            System.out.println(i);
        }

        // 가비지 컬렉터가 내가 원할 때 작동하지는 않음.
        // 다만 알아서 메모리 관리해주니까 많이 신경쓸 필요는 없음.
    }
}
