/** %java ShuffleKnuth.java input.txt
 L A T O E E X M P R S  ili luboe drugoe
 */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ShuffleKnuth {

    public static  void shuffle(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i<n; i++) {
            int r = (int) (Math.random() * (i + 1));
            Comparable swap = a[i];
            a[i] = a[r];
            a[r] = swap;

        }
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        String[] a = in.readAllStrings();
        shuffle(a);
        for (String s: a)
            StdOut.print(" " +s);

    }
}
