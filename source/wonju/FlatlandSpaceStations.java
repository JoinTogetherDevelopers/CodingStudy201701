import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input fromm STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
                m = in.nextInt();
        if (n == m) {
            System.out.println(0);
            return;
        }

        // get stations as ordered
        SortedSet ss = new TreeSet();
        for (int i = 0; i < m; ++i) {
            ss.add(in.nextInt());
        }
        Iterator ss_it = ss.iterator();

        int max = (int)ss_it.next(), // first position of station is the initial max distance
                prevSs = max,
                currSs = 0,
                currDist = 0;

        for (int i = 1; i < m; ++i) {
            currSs = (int)ss_it.next();
            currDist = (int)Math.ceil((currSs - prevSs) / 2);

            if (currDist > max) {
                max = currDist;
            }

            prevSs = currSs;
        }

        if (m-1 - currSs > max) {
            max = m-1 - currSs;
        }

        System.out.println(max);
    }
}
