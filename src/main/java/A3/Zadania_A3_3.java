package A3;

public class Zadania_A3_3 {

    public static int n;
    public static String str;


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
        return ((Math.abs(100 - n) <= 10)
                ||
                (Math.abs(200 - n) <= 10));
    }

    //Warmup-2 > last2
    public static int last2(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {
                count++;
            }
        }

        return count;
    }

    //Warmup-2 > array123
    public static boolean array123(int[] nums) {

        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1)
                if (nums[i + 1] == 2)
                    if (nums[i + 2] == 3)
                        return true;
        }
        return false;
    }

    //String-1 > startWord
    public static String startWord(String str, String word) {
        if (word.length() > 1)
            if(str.length() >= word.length() &&
                    str.substring(1, word.length()).equals(word.substring(1)))
                return str.substring(0, word.length());
        return "";
    }
    //Array-1 > reverse3
    public static int[] reverse3(int[] nums) {
        int[] reversed = {nums[2], nums[1], nums[0]};
        return reversed;

    }
    //Array-1 > middleWay
    public static int[] middleWay(int[] a, int[] b) {
int[] middleWay = {a[1],b[1]};
return middleWay;
    }

    //Array-1 > makeMiddle
    //Array-1 > midThree
}