package ch06.lecture.p5fanal;

public class C03Final {
    public static void main(String[] args) {
        C03MyClass o = new C03MyClass();
        System.out.println(o.i);
        o.i = 3;
        System.out.println(o.i);
        o.i = 5;
        System.out.println(o.i);

        System.out.println(o.j); // 10
        // o.j = 20; (x)
        System.out.println(o.k); // 200
        // o.k = 400; (x)


    }
}

class C03MyClass {
    int i;
    // final 인스턴스 필드
    final int j = 10;
    final int k;

    C03MyClass() {
        // 생성자에서 인스턴스 필드 초기화
        k = 200;
    }
}
