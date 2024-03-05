package c06;

import java.util.Arrays;

public class C01Field {
    public static void main(String[] args) {

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        System.out.println(arr1.length);
        System.out.println(arr2.length);

        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
        System.out.println(Arrays.hashCode(arr1));

    }
}
