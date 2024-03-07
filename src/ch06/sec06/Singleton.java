package ch06.sec06;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        // 같은 객체만 리턴 되도록 코드 작성
        return singleton;
    }
}