package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

//        int[] copy = arr;
        int[] copy = new int[arr.length];

//        for (int i = 0; i < arr.length; i++) {
//            copy[i] = arr[i];
//        }
        // 요 메서드 이용하면 간단하게 됨.
        System.arraycopy(arr, 0, copy, 0, arr.length);

        copy[0] = 1; // 얕은 복사(Shallow copy)

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));

        // 참조형이라 서로 가리키고 있는 방향의 값이 똑같으니까 어느 한쪽에서
        // 변경하게 되면 똑같이 변경이 되었다.
        // 똑같은 값을 두개의 포인터가 가리키고 있는 것일뿐이니까
    }
}
