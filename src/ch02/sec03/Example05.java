package ch02.sec03;

public class Example05 {
    public static void main(String[] args) {

        int x = -100;
        x = -x;
        System.out.println(x);

        byte y = 100;
        // y = -y; (x)
        y = (byte)-y;
        System.out.println(y);
    }
}
