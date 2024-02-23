package c04;

public class S09Switch {
    public static void main(String[] args) {

        String city = "서울";
        switch(city) {
            case "서울":
            case "인천":
                System.out.println("수도권입니다.");
                break;
            case "광주":
            case "전주":
                System.out.println("호남권입니다.");
                break;
            case "대구":
            case "부산":
                System.out.println("영남권입니다.");
        }
    }
}
