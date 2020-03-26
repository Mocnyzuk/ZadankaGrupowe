package A1;

public class zadanka2AniaL {

    public static String combineStrings(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return s1 + s2 + s1;
        } else {
            return s2 + s1 + s2;
        }
    }

    public static String minCat(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return s1.substring(s1.length() - s2.length()) + s2;
        } else {
            return s1 + s2.substring(s2.length() - s1.length());
        }
    }

    public static int[] rotateLeft3(int[] arrayToRotate) {
        int[] array = new int[3];
        for (int i = 0; i < arrayToRotate.length; i++) {
            array[i] = arrayToRotate[(i + 1) % 3];
        }
        return array;
    }

    public static boolean double2Or3(int[] array) {
        if (array.length < 2) {
            return false;
        }
        return (array[0] == array[1] && array[0] == 2) || (array[0] == array[1] && array[0] == 3);
    }

    public static String alarmClock(int dayOfWeek, boolean areWeOnVacations) {
        if (dayOfWeek >= 1 && dayOfWeek < 6 && areWeOnVacations) {
            return "10:00";
        } else if (dayOfWeek >= 1 && dayOfWeek < 6) {
            return "7:00";
        } else if ((dayOfWeek == 0 || dayOfWeek == 6) && !areWeOnVacations) {
            return "10:00";
        } else {
            return "off";
        }
    }

    public static int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }

    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

}
