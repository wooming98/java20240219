package ch06.lecture.p2method;

public class C08CarArgs {
    public static void main(String[] args) {
        C08MyClass o1 = new C08MyClass();
        o1.method1();
        o1.method1(1);
        o1.method1(1, 2);
        o1.method2(3, 4, 5, 6, 7, 8);
    }

}

class C08MyClass {
    void method1() {
        System.out.println("method1, 파라미터 0개");
    }
    void method1(int a) {
        System.out.println("method1, 파라미터 1개");
    }
    void method1(int a, int b) {
        System.out.println("method1, 파라미터 2개");
    }

    // varargs (가변 인자, 가변길이 매개변수)
    // 메소드 내에서 배열로 사용
    void method2(int... a) {
        System.out.println("method2, 파라미터 0개 이상");
        System.out.println(a.length);
    }
    
    // 다른 파라미터와 함께 사용 시 꼭 마지막에 넣어야 함
    void method3(String s, int ...a) {
        
    }
}