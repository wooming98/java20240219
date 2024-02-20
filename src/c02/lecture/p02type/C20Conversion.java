package c02.lecture.p02type;

public class C20Conversion {
    public static void main(String[] args) {

        byte a = 23;
        int b = a;
        short c = a;
        long d = a;

        short e = 1241;
        int f = e;
        long g = e;
//        byte h = e; (x)

        int i = 300;
        long j = i;
//        short k = i; (x)

        float l = 3.14F;
        double m = l;

        double n = 3.14;
//        float o = n; (x)

        // 정수형을 실수형에 할당 가능
        long p = 1234;
        float q = p;
        double r = p;


    }
}
