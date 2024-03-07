package ch06.lecture.p2method;

public class C07Overload {
    public static void main(String[] args) {
        C07Myclass o1 = new C07Myclass();
        // 메소드 호출 시 argument의 타입을 보고 실행시킬 메소드 결정됨
        o1.method1();
        o1.method1(3);
        o1.method1(3.0);
        o1.method1(3.14, 9.8);
        o1.method1(3.14, 9);

    }
}

class C07Myclass {
    void method1() {

    }
    void method1(int a) {

    }
    void method1(double a) {

    }
    void method1(double a, double b) {

    }
    void method1(double a, int b) {

    }
}