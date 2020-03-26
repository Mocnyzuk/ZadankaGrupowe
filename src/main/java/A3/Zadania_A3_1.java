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
        StringBuilder r = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            r.append(str);
        }
        return r.toString();
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

    //String-1 > middleThree
    public static String middleThree(String str) {
        int half = str.length()/2;
        return str.substring(half-1,half+2);
    }

    //String-1 > lastChars
    public static String lastChars(String a, String b) {
        if (!a.isEmpty() && b.length() > 1) {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        }
        if (a.isEmpty() && b.length()>1)
        {
            return "@"+ b.substring(b.length() - 1);

        }
        if(!a.isEmpty())
        {
            return a.substring(0, 1)+"@";
        }
        else
            return "@@";
    }

    //Array-1 > no23
    public static boolean no23(int[] nums) {
        if(nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3)
        {
            return true;
        }
        return false;
    }

    //Array-1 > fix23
    public static int[] fix23(int[] nums) {
        if(nums[0] == 2 && nums[1] == 3)
        {
            nums[1] = 0;
        }
        if(nums[1] == 2 && nums[2] == 3)
        {
            nums[2] = 0;
        }
return nums;
    }


}
