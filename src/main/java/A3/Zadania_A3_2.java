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

    //Warmup-2 > altPairs
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

    //Warmup-2 > noTriples
    public static boolean noTriples(int[] nums){
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] == nums[i] && nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //Array-1 > firstLast6
    public static boolean firstLast6(int[] nums){
        if (nums[0] == 6 || nums[nums.length - 1] == 6){
            return true;
        }
        return false;
    }

    //Array-1 > commonEnd
    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]){
            return true;
        }
        return false;
    }

    //Array-1 > unlucky1
    public static boolean unlucky1(int[] nums) {
        if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)){
            return true;
        }
        return false;
    }



}
