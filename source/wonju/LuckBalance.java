import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int L, T;
        int luck = 0;
        List<Integer> lucks = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            L = in.nextInt();
            T = in.nextInt();

            if (T == 0) {
                luck += L;
            } else {
                lucks.add(L);
            }
        }

        Collections.sort(lucks);
        int lucks_size = lucks.size();

        for (int i = 0; i < lucks_size; ++i) {
            if (i < lucks_size - K) {
                luck -= lucks.get(i);
            } else {
                luck += lucks.get(i);
            }
        }

        System.out.println(luck);
    }
}
