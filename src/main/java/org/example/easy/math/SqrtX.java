package org.example.easy.math;

public class SqrtX {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int c = 1;

        // this can overflow
        while (c * c < x && (c + 1) * (c + 1) <= x && c < x / 2) {
            c++;
        }

        return c;
    }
}
