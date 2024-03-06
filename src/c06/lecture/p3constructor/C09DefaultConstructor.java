package c06.lecture.p3constructor;

public class C09DefaultConstructor {
    public static void main(String[] args) {
        C09MyClass1 obj1 = new C09MyClass1(33);
        C09MyClass2 obj2 = new C09MyClass2();
        C09MyClass3 obj3 = new C09MyClass3();
        C09MyClass4 obj4 = new C09MyClass4(3);
        C09MyClass4 obj5 = new C09MyClass4();
    }
}
class C09MyClass4 {
    int age;
    public C09MyClass4(int age) {
        this.age = age;
    }

    // 필요하면 만들어서 써야함
    C09MyClass4() {
    }
}

class C09MyClass3 {
    // 필드 x
    // 생성자 x
    // no-args constructor (default constructor)
    // 생성자를 작성하지 않으면
    // 파라미터 없는 생성자 자동 추가
    // 메소드 x
}

class C09MyClass2 {
    C09MyClass2() {

    }
}

class C09MyClass1 {
    int age;
    C09MyClass1(int age) {

    }

}