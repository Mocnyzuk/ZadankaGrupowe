package A2;

public class AuA2 {
//  Warmup-1 > monkeyTrouble

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        }
        if (aSmile == false && bSmile == false) {
            return true;
        }
        if (aSmile == true || bSmile == false) {
            return false;
        }
        return false;
    }

    // Warmup-1 > parrotTrouble
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }


    public static int bigDiff(int[] nums) {
        int maxValue = nums[0];
        int minValue = nums[0];
        for (int i = 0; i <= nums.length - 1; i++) {
            minValue = Math.min(minValue, nums[i]);
            maxValue = Math.max(maxValue, nums[i]);
        }
        int result = maxValue - minValue;
        return result;
    }


    public static void isEverywhere(int[] nums, int val) {

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (currentNumber == currentNumber++){

            }

        }

    }


}
