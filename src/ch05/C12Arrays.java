package ch05;

import java.util.Arrays;

public class C12Arrays {
    public static void main(String[] args) {
        // java.util.Array; : 유틸리티 클래스
        System.out.println("toString : 배열을 보기 좋게 String으로 변환");
        int[] arr1 = {4, 2 , 3, 5, 1};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println();

        System.out.println("배열을 오름차순으로 정렬");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println();

        System.out.println("fill : 특정값으로 배열 채우기");
        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2, 27);
        System.out.println(Arrays.toString(arr2));

        System.out.println();

        int[] arr3 = {9, 3, 0, 4, 2};
        int[] arr4 = arr3; // 같은 배열(같은 주소를 참조)
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println("하나의 배열만 바꿔도 둘 다 값이 바뀌어짐");
        arr3[0] = 10;
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println();
        int[] arr5 = {5, 6, 7, 1, 2};
        int[] arr6 = Arrays.copyOf(arr5, arr5.length);
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
        System.out.println("copyOf 사용 시 새로운 것을 만듦");
        arr5[0] = 10;
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
    }
}