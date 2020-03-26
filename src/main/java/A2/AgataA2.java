package A2;

public class AgataA2 {
    public static boolean old35(int numberToCheck) {
        if (numberToCheck > 0) {
            if (numberToCheck % 3 == 0 || numberToCheck % 5 == 0) {
                return !(numberToCheck % 3 == 0 && numberToCheck % 5 == 0);
            }
        }
        return false;
    }

    public static boolean in1To10(int n, boolean outsideMode) {

        if (outsideMode)
            return 1 >= n || n >= 10;
        else
            return 1 <= n && n <= 10;
    }

    public static String notReplace(String str) {
        final String REGEX = "\\bis\\b";
        return str.replaceAll(REGEX, "is not");
    }

    public static int teenSum(int a, int b) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) ? 19 : (a + b);
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;

        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

}
