package ch02.lecture.p02type;

public class C03Integer {
    public static void main(String[] args) {
        // 정수 표현 방법
        // 10진법
        int a = 32;
        int b = 23_333_333; // _로 끊어서도 가능

        // 2진법 (0, 1)
        int c = 0b01001101;
        // 8진법 (0, 1, 2, 3, 4, 5, 6, 7)
        int d = 027123;
        // 16진법(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)
        int e = 0x82ACE2;

        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xB3;

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
    }
}
