package A3;

public class Zadania_A3_1 {

    //Warmup-1 > sleepIn

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;

    }
    //Warmup-1 > mixStart
    public static boolean mixStart(String str) {
        String str1="";
        if(str.length()>2)
        {
            str1 = str.substring(1,3);
            if(str1.equals("ix"))
            {
                return true;
            }
        }
        return false;
}
    //Warmup-1 > close10
    public static int close10(int a, int b) {
        int aToTen = Math.abs(a-10);
        int bToTen = Math.abs(b-10);

        if(aToTen>bToTen)
        {
            return b;
        }
        if(bToTen>aToTen)
        {
            return a;
        }
        return 0;
    }

}
