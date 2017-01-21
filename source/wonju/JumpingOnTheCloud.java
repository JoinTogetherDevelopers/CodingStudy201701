import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int E = 100;
        int idx = 0;

        while (true) {
            idx += k;
            if (idx == n) {
                idx = 0;
            }

            if (c[idx] != 0) {
                E -= 3;
            } else {
                E -= 1;
            }

            if (idx == 0) {
                break;
            }
        }

        System.out.println(E);
    }
}
