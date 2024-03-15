package ch12.lecture.p3regex;

public class C06BeginEnd {
    public static void main(String[] args) {
        // ^ (caret) : 시작
        // $ : 끝

        String s = ",,abc,def,,,xyz,,,";
        String s1 = s.replaceAll(",+", "");
        System.out.println(s);

        String s2 = s.replaceAll("^", "hi");
        System.out.println(s2);

        String s3 = s.replaceAll("^,", "");
        System.out.println(s3);

        String s4 = s.replaceAll("$", "hello");
        System.out.println(s4);

        String s5 = s.replaceAll(",+$", "");
        System.out.println(s5);
    }
}
