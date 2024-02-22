package c02.sec03;

import java.math.BigDecimal;

public class Example06 {
    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b);

        // 해결책1. BigDecimal 객체 사용
        BigDecimal c = BigDecimal.valueOf(a);
        BigDecimal d = BigDecimal.valueOf(b);
        BigDecimal e = c.add(d);
        System.out.println(e);

        // 해결책2. 정수로 바꿔서 연산
        double f = ((int)(a*10) + (int)(b*10))/10.0;
        System.out.println(f);
    }
}
