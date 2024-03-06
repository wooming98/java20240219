package c06.lecture.p6access;

public class C01AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 30; // public
        o1.name = "son"; // package private
        // o1.address = "seoul"; (x) // private

    }
}

// 하나의 파일에
// 하나의 public class만 만들 수 있음
//public class C01My {
//} (x)