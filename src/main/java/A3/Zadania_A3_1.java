package A3;

public class Zadania_A3_1 {

    //Warmup-1 > sleepIn

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;

    }
    //Warmup-1 > mixStart
    public static boolean mixStart(String str) {
        String str1;
        if(str.length()>2)
        {
            str1 = str.substring(1,3);
            return str1.equals("ix");
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

    //Warmup-2 > stringTimes
    public static String stringTimes(String str, int n) {
        String r = "";
        for(int i=0;i<n;i++)
        {
            r = r+str;
        }
        return r;
    }

    //Warmup-2 > doubleX
    public static boolean doubleX(String str) {
        int index = str.indexOf('x');
        if(index == -1 || index+1>=str.length() )
        {
            return false;
        }
        String str1 = str.substring(index+1, index+2);
        return str1.equals("x");
    }
    //String-1 > firstHalf
    public static String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }

    //String-1 > nonStart
    public static String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }



}
