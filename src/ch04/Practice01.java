package ch04;

public class Practice01 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        do {
            a = (int) (Math.random() * 6) + 1;
            b = (int) (Math.random() * 6) + 1;
            System.out.println(a + b + "이(가) 나왔습니다.");
        } while (a + b != 5);
    }
}
