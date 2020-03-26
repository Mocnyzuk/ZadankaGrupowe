package A3;

public class Zadania_A3_2 {

    //Warmup-1 > missingChar
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1, str.length());
    }

    //Warmup-1 > backAround
    public static String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    //Warmup-2 >
    public static String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }
        return result;
    }
}
