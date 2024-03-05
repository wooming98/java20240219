package c06.lecture.p3constructor;

public class C04Constructor {
    public static void main(String[] args) {
        C04MyClass obj1 = new C04MyClass("우", 27);
        C04MyClass obj2 = new C04MyClass("보", 35);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj2.name);
        System.out.println(obj2.age);
    }
}

class C04MyClass {
    String name;
    int age;

    C04MyClass(String initialName, int initalAge) {
        name = initialName;
        age = initalAge;
    }
}