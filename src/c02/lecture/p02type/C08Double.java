package c02.lecture.p02type;

import java.math.BigDecimal;

public class C08Double {
    public static void main(String[] args) {
        // double(float)는 근사 값으로 저장됨
        // 실수 표현 타입 8byte

        double a = 0.1;
        double b = 0.2;

        // 연산 시 원하지 않은 결과가 나올 수 있음
        double c = a + b;
        System.out.println("c = " + c);

        // BigDecimal 사용해서 문제 해결
        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");

        BigDecimal f = d.add(e);

        System.out.println("f = " + f);
    }
}
