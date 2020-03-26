package A3;

public class Zadania_A3_2 {
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1, str.length());
    }
}
