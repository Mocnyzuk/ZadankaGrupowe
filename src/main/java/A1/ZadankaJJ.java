package A1;

import java.util.Arrays;

public class ZadankaJJ {

    public static int makeChocolate(int small, int big, int goal) {
        int counter = 0;
        while (goal >= 5 && big >= 1) {
            goal = goal - 5;
            big -= 1;
        }
        while (goal >= 1 && small >= 1) {
            goal -= 1;
            small -= 1;
            counter++;
        }
        if (goal > 0) {
            return -1;
        }
        return counter;
    }

    public static boolean closeFar(int a, int b, int c) {
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        if (((b - 1) == a || (b + 1) == a || b == a) && ((a >= (c + 2) || a <= (c - 2)) && (b >= (c + 2) || b <= (c - 2)))) {
            return true;
        } else if (((c - 1) == a || (c + 1) == a || c == a) && ((a >= (b + 2) || a <= (b - 2)) && (b >= (c + 2) || b <= (c - 2)))) {
            return true;
        }
        return false;

    }


    public static boolean arrayFront9(int[] nums) {
        if (nums.length < 4) {
            for (int num : nums) {
                if (num == 9) {
                    return true;
                }


            }
            return false;
        } else {
            for (int i = 0; i < 4; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }

        }
        return false;

    }

    public static String stringX(String str) {
        if (str.length() <= 1) {
            return str;

        } else {
            char start = str.charAt(0);
            char end = str.charAt(str.length() - 1);
            return start + str.substring(1, str.length() - 1).replaceAll("x", "") + end;
        }
    }

    public static String stringSplosion(String str) {
        char[] znaki = str.toCharArray();
        String solution = "";
        for (int i = 0; i < znaki.length; i++) {
            for (int y = 0; y <= i; y++) {
                solution += znaki[y];
            }
        }
        return solution;
    }

    public static boolean less20(int n) {
        if (n % 20 == 0) {
            return false;
        } else if ((n + 2) % 20 == 0 || (n + 1) % 20 == 0) {
            return true;
        }
        return false;
    }

    public static String fizzString2(int n) {
        String result = n + "!";
        if (n % 3 == 0) {
            result = "Fizz!";
        } else if (n % 5 == 0) {
            result = "Buzz!";
        }
        if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz!";
        }
        return result;

    }

    public static int luckySum(int a, int b, int c) {
        if (a != 13 && b != 13 && c != 13) {
            return a + b + c;
        } else if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        }
        return 0;
    }

    public static boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }

    public static int[] biggetTwo(int[] a, int[] b) {
        int sumaa = 0;
        int sumab = 0;
        for (int i = 0; i < 2; i++) {
            sumaa += a[i];
            sumab += b[i];
        }
        if (sumaa > sumab) {
            return a;
        } else if (sumaa < sumab) {
            return b;
        } else return a;
    }

    public static int[] frontPiece(int[] nums) {
        int endIndex = nums.length ;
        if (endIndex >= 2) {
            endIndex = 2;
        }
        return Arrays.copyOfRange(nums, 0, endIndex);
    }

    public static int[] swapEnds(int[] nums){
        int lastNum = nums[nums.length-1];
        int firstNum = nums[0];
        nums[0] = lastNum;
        nums[nums.length-1]=firstNum;
        return nums;
    }
}
