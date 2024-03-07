package ch04;

import java.util.HashSet;
import java.util.Set;

public class C04Ramdom {
    public static void main(String[] args) {

        double random = Math.random();// 0.0 <= 리턴값 < 1.0
        System.out.println("random = " + random);

        int dice = (int)(random * 6) + 1;
        System.out.println("dice = " + dice);

        System.out.println("");


//        Set<Integer> lotto = new HashSet<>();
//        Set<Integer> num = new HashSet<>();
//
//        int i = 0;
//        while(i<6) {
//            if(lotto.size() == num.size()) {
//                lotto.add((int)(Math.random()*45)+1);
//                num.add((int)(Math.random()*45)+1);
//            } else if(lotto.size() > num.size()) {
//                num.add((int)(Math.random()*45)+1);
//            } else {
//                lotto.add((int)(Math.random()*45)+1);
//            }
//            i++;
//        }
//        if(lotto.equals(num)) {
//            System.out.println("당첨쓰");
//        } else {
//            System.out.println("노당첨쓰");
//        }

        Set<Integer> lotto = new HashSet<>();
        Set<Integer> num = new HashSet<>();

        while (lotto.size() < 6) {
            int randomNumber = (int) (Math.random() * 45) + 1;
            lotto.add(randomNumber);
        }

        while (num.size() < 6) {
            int userNumber = (int) (Math.random() * 45) + 1;
            num.add(userNumber);
        }

        // 결과 확인
        if (lotto.containsAll(num)) {
            System.out.println("당첨!");
        } else {
            System.out.println("노당첨!");
        }
    }
}
