package c05;

public class C01ReferenceType {
    public static void main(String[] args) {
        // 기본타입 8개 외에는 모두 참조 타입

        // 배열 : 여러 값을 갖는 타입
        int[] arr1;
        arr1 = new int[] {3, 4, 5};

        int[] arr2;
        arr2 = new int[] {3, 4, 5};

        System.out.println(arr1 == arr2);
    }
}
