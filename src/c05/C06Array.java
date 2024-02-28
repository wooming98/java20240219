package c05;

public class C06Array {
    public static void main(String[] args) {
        // 배열 전체 탐색
        int[] arr = new int[] {7, 2, 10, 8, -1, 2, 0, 44, 72};
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------------");
        for(int i : arr) {
            System.out.println(i);
        }

        int[] array = new int[5];
        for(int i=0; i<array.length; i++) {
            array[i] = i;
        }
        for(int i : array) {
            System.out.println(i);
        }
    }
}
