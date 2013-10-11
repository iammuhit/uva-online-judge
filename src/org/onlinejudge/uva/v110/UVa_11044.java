package org.onlinejudge.uva.v110;

import java.util.Scanner;

/**
 *
 * @author muhit
 */
public class UVa_11044 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, m;
        int t = s.nextInt();

        while (t-- > 0) {
            n = s.nextInt();
            m = s.nextInt();

            System.out.println((n / 3) * (m / 3));
        }
    }
}
