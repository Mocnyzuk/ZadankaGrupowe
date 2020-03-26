package A2;

import java.util.Arrays;

public class DanielA2 {
    public static int countTriple(String given) {
        int counter = 0;

        for (int i = 0; i <= given.length() - 3; i++) {
            if (given.charAt(i) == given.charAt(i + 1) && given.charAt(i) == given.charAt(i + 2))
                counter++;
        }

        return counter;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int[] tab = {a, b, c};
        Arrays.sort(tab);

        return tab[1] - tab[0] == tab[2] - tab[1];
    }

    public static boolean only14(int[] nums) {
        for (int element : nums) {
            if (element != 1 && element != 4) {
                return false;
            }
        }

        return true;
    }

    public static int[] tenRun(int[] nums) {
        int last = 0;
        boolean multOf10 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                last = nums[i];
                multOf10 = true;
            } else {
                if (nums[i] % 10 != 0 && multOf10) {
                    nums[i] = last;
                }
            }
        }
        return nums;
    }

    public static int loneSum(int a, int b, int c) {
        int result = a + b + c;

        if (a == b && a == c)
            return 0;

        if (a == b)
            result -= b * 2;

        if (a == c)
            result -= c * 2;

        if (b == c)
            result -= c * 2;

        return result;
    }

}
