package A3;

public class Zadania_A3_3 {

    public static int n = 5;
    //Warmup-1 > diff21


    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    //Warmup-1 > nearHundred
    public static boolean nearHundred(int n) {
        return ((Math.abs(100-n) <= 10)
                ||
                (Math.abs(200-n) <= 10));
    }
}