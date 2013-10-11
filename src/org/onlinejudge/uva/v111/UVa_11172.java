package org.onlinejudge.uva.v111;

import java.util.Scanner;

/**
 *
 * @author muhit
 */
public class UVa_11172 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        int b;
        int t = s.nextInt();

        while (t-- > 0) {
            a = s.nextInt();
            b = s.nextInt();

            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else if (a == b) {
                System.out.println("=");
            }
        }
    }
}
