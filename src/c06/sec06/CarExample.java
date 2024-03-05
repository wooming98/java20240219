package c06.sec06;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // 필드에 값을 넣지 않으면 0, false, null;
        // Car 객체의 필드값 읽기
        System.out.println("myCar.model : " + myCar.model);
        System.out.println("myCar.start : " + myCar.start);
        System.out.println("myCar.speed : " + myCar.speed);
    }
}
