package ch04;

import java.util.Random;

public class C05Random {
    public static void main(String[] args) {
        
        // Math.random을 이용한 방법
        int dice1 = (int)(Math.random()*6) + 1;
        int dice2 = (int)(Math.random()*6) + 1;
        int dice3 = (int)(Math.random()*6) + 1;

        System.out.println("dice1 = " + dice1);
        System.out.println("dice2 = " + dice2);
        System.out.println("dice3 = " + dice3);
        
        // Random 클래스를 이용한 방법
        Random random = new Random();
        int dice4 = random.nextInt(1, 7);
        int dice5 = random.nextInt(1, 7);
        int dice6 = random.nextInt(1, 7);

        System.out.println("dice4 = " + dice4);
        System.out.println("dice5 = " + dice5);
        System.out.println("dice6 = " + dice6);
    }
}
