package ch04;

public class p138 {
    public static void main(String[] args) {

        // 확인 문제 2번
        String grade = "B";
        int score1 = 0;
        switch (grade) {
            case "A" -> {score1 = 100; break;}
            case "B" -> {int result = 100 - 20; score1 = result; break;}
            default -> {score1 = 60;}
        }
        System.out.println(score1);

        // 확인 문제 3번
        int sum = 0;
        for(int i=3; i<=100; i+=3) {
            sum += i;
        }
        System.out.println(sum);

        // 확인 문제 5번
        for(int x=1; x<=10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
