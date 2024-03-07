package ch07.lecture;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        // 자동 타입 변환
        Parent parent = child;

        parent.method1();
        parent.method2();
        //
        // parent.method3(); (x)
    }
}