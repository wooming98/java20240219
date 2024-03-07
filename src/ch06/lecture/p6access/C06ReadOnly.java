package ch06.lecture.p6access;

public class C06ReadOnly {
    public static void main(String[] args) {
        C06MyClass o1 = new C06MyClass("son", 27);
        System.out.println("o1.getName() = " + o1.getName());
        System.out.println("o1.getAge() = " + o1.getAge());
        System.out.println();

        C06MyClass2 o2 = new C06MyClass2("lee", 25);
        System.out.println("o2.name() = " + o2.name());
        System.out.println("o2.age() = " + o2.age());
    }
}

// record
record C06MyClass2 (
        String name,
        int age
) {

}

class C06MyClass {
    private String name;
    private int age;

    public C06MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
