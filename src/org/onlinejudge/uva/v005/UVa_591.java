package org.onlinejudge.uva.v005;

import java.util.Scanner;

/**
 *
 * @author muhit
 */
public class UVa_591 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, h[], totalBricks, avgBricks, moves, sets = 0;

        while (true) {
            n = s.nextInt();

            if (n == 0) {
                break;
            }

            h = new int[n];
            totalBricks = avgBricks = moves = 0;

            for (int i = 0; i < n; i++) {
                h[i] = s.nextInt();
                totalBricks += h[i];
            }

            avgBricks = totalBricks / n;

            for (int i = 0; i < n; i++) {
                if (h[i] > avgBricks) {
                    moves += (h[i] - avgBricks);
                }
            }

            System.out.println("Set #" + (++sets));
            System.out.println("The minimum number of moves is " + moves + ".\n");
        }
    }
}
