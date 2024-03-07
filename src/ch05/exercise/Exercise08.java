package ch05.exercise;

import java.util.Arrays;

public class Exercise08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        // for
        int sum1 = 0;
        double count1 = 0;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                sum1 += array[i][j];
                count1++;
            }
        }
        System.out.println("sum = " + sum1);
        System.out.println("avg = " + (sum1/count1));

        int sum2 = 0;
        double count2 = 0;
        //forEach
        for(int[] row : array) {
            for(int i : row) {
                sum2 += i;
                count2++;
            }
        }
        System.out.println("sum2 = " + sum2);
        System.out.println("avg = " + (sum1/count2));

        int sum = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .sum();

        double avg = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .average()
                .getAsDouble();

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
