import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        String[][] arr = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i][1]);
        }
    }
}


class Solution {
    public String solution(String[] id_pw, String[][] db) {

        for(int i=0; i<db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {
                if(db[i][1].equals(id_pw[1])) {
                    return "login";
                }
                return "wrong pw";

            }
        }
        return "fail";
    }
}