package org.onlinejudge.uva.v115;

import java.util.Scanner;

/**
 *
 * @author muhit
 */
public class UVa_11547 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        int ans = 0;
        int t = s.nextInt();

        while (t-- > 0) {
            n = s.nextInt();
            ans = (((((n * 567) / 9) + 7492) * 235) / 47) - 498;
            ans /= 10;
            ans %= 10;
            System.out.println(Math.abs(ans));
        }
    }
}
