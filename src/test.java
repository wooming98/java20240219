import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";

        int size = t.length() - p.length() + 1;
        String[] arr = new String[size];
        for(int i=0; i<size; i++) {
            arr[i] = t.substring(i, p.length() + i);
            System.out.println(Arrays.toString(arr));
        }
        int n = 0;
        for(String s : arr) {
            if(Integer.parseInt(s) >= Integer.parseInt(p)) {
                n++;
            }
        }
    }
}
