package c02.lecture.p02type;

public class C21Conversion {
    public static void main(String[] args) {

        long a = 234;
        int b = (int)a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        short c = 50;
        byte d = (byte)c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        short e = 128;
        byte f = (byte)e;

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        double i =3.14;
        int j = (int)i;
        System.out.println("j = " + j);
    }
}
