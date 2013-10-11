package org.onlinejudge.uva.v107;

import java.util.Scanner;

/**
 *
 * @author muhit
 */
public class UVa_10783 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, sum;
        int cases = 0;
        int t = s.nextInt();

        while (t-- > 0) {
            a = s.nextInt();
            b = s.nextInt();

            if (a % 2 == 0) {
                a++;
            }

            sum = 0;

            for (int i = a; i <= b; i += 2) {
                sum += i;
            }
            
            System.out.println("Case " + (++cases) + ": " + sum);
        }
    }
}
