package ch06.exercise.p18;

public class ShopServiceExample {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstence();
        ShopService obj2 = ShopService.getInstence();

        if(obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("같은 ShopService 객체입니다.");
        }
    }
}
