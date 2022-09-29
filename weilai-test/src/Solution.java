// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;
import java.util.stream.IntStream;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public static int solution(int []N) {
        int a = N[0];
        int b = N[1];
        int c = N[2];
        if (c == -1) {
            return subs(a, b);
        }
        else if (c == 0) {
            return divide(a, b);
        }
        else if (c == 1) {
            return  times(a, b);
        }
        return -1;
    }


    public static int subs(int a, int b) {
        return a + negate(b);
    }

    public static int times(int a, int b) {
        if (abs(a) > abs(b)) return times(b, a); //faster
        int result = 0;
        for (int i = 1; i <= abs(a); i++) {
            result += abs(b);
        }
        if (positive(a, b)) return result;
        else return negate(result);
    }

    public static int divide(int a, int b) {
        int count = 0;
        for(int i = abs(a); i >= abs(b); i -= abs(b)) {
            count++;
        }
        int remaining = subs(abs(a), times(abs(b), count));
        if (times(remaining, 2) >= abs(b)) {
            count++;
        }
        if (positive(a, b)) return count;
        else return negate(count);
    }

    public static int abs(int value) {
        if (value >= 0 ) return value;
        else return negate(value);
    }


    public static boolean positive(int a, int b) {
        return (a > 0 && b > 0) || (a < 0 && b < 0);
    }


    public static int negate(int b) {
        int value = (b < 0 ? 1 : -1);
        int negate = 0;
        while (b!= 0) {
            negate += value;
            b += value;
        }
        return negate;
    }

}