package c05;

public class C08Array {
    public static void main(String[] args) {

        int[] scores = {80, 90, 70};

        int sum1 = 0;
        for(int i=0; i<3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        printItem(new int[] {80, 90, 100});
    }
    public static void printItem(int[] scores) {
        for(int i=0; i<3; i++) {
            System.out.println("score[" + i + "] : " + scores[i]);
        }
    }
}
