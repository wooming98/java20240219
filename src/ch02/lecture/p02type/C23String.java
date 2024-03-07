package ch02.lecture.p02type;

public class C23String {
    public static void main(String[] args) {
        // 기본타입과 String 간의 변환은 메소드로 가능

        // 1. String -> 기본타입 변환
        String str = "123";
        byte b = Byte.parseByte(str);
        short c = Short.parseShort(str);
//        char d;
        int e = Integer.parseInt(str);
        long f = Long.parseLong(str);
        float g = Float.parseFloat(str);
        double h = Double.parseDouble(str);

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // 2. 기본타입 -> String 변환
        int i = 356;
        double j = 3.14;

        String s1 = String.valueOf(i);
        String s2 = i + "";
        String s3 = String.valueOf(j);
        String s4 = j + "";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
    }
}
