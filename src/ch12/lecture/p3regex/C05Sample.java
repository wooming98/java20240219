package ch12.lecture.p3regex;

public class C05Sample {
    public static void main(String[] args) {
        // _, $, 영문대소문자, 숫자 조합
        // 단 숫자로 시작하면 안됨

        String pattern = "[^0-9][$\\w]*";
        System.out.println("num".matches(pattern)); // true
        System.out.println("var7".matches(pattern)); // true
        System.out.println("class".matches(pattern)); // true
        System.out.println("PI".matches(pattern)); // true
        System.out.println("MAX_VALUE".matches(pattern)); // true
        System.out.println("ab2_$3$_".matches(pattern)); // true
        System.out.println("7num".matches(pattern)); // false

    }
}
