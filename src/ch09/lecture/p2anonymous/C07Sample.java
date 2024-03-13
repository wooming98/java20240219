package ch09.lecture.p2anonymous;

import java.util.*;

public class C07Sample {
    public static void main(String[] args) {
        // TODO : null 대신 익명클래스 객체 코드 작성
        
        Game rpsGame = new Game() {
            @Override
            public void play() {
                int n = (int)(Math.random() * 3);
                if(n == 0) {
                    System.out.println("주먹");
                } else if(n == 1) {
                    System.out.println("가위");
                } else {
                    System.out.println("보");
                }
            }
        };
        rpsGame.play(); // "가위", "바위", "보" 중 하나 출력

        Game lottoGame = new Game() {
            @Override
            public void play() {
                Set<Integer> set = new HashSet<>();
                while(set.size() < 6) {
                    int n = (int)(Math.random() * 45) + 1;
                    set.add(n);
                }
                for(Integer k : set) {
                    System.out.print(k + "\t");
                }
            }
        };
        // 초보자 : 1~45 값 중 한개 출력
        // 중급자 : 1~45 값 중 6개 중복없이 출력
        lottoGame.play();
    }
}

interface Game {
    void play();
}
