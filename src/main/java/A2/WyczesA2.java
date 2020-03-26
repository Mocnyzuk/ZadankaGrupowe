package A2;

import java.util.Arrays;

public class WyczesA2 {
    /*
    if 'x' is on first and / or last place in the given string, method should return it without those xs.

     */
    public static String withoutX(String str) {
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'x') {
                if (i == 0 || i == chars.length - 1) continue;
            } result.append(chars[i]);
        }
        return result.toString();
    }
    /*

    Given an array of ints, return true if the array contains two 7's next to each other,
    or there are two 7's separated by one element, such as with {7, 1, 7}.


    has77([1, 7, 7]) → true
    has77([1, 7, 1, 7]) → true
    has77([1, 7, 1, 1, 7]) → false
     */

    public static boolean has77(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 7 && nums[i+1] == 7 )  return true;
            if(i < nums.length - 2) { if (nums[i] == 7 && nums[i+2] == 7) return true;}

        }
        return false;
    }

    /*

    We'll say that an element in an array is "alone" if there are values before and after it,
    and those values are different from it. Return a version of the given array where every instance of the given value which is
    alone is replaced by whichever value to its left or right is larger.


    notAlone([1, 2, 3], 2) → [1, 3, 3]
    notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
    notAlone([3, 4], 3) → [3, 4]
     */

    public static int[] notAlone(int[] nums, int val) {
        int[] result = new int[nums.length];

        if(nums.length >= 1) {
            result[0] = nums[0];
            result[result.length - 1] = nums[nums.length - 1];
        }

        for (int i = 1; i < nums.length - 1; i++){
            if(nums[i] == val && nums[i] != nums[i-1] && nums[i] != nums[i + 1]){
                    result[i] = Math.max(nums[i-1], nums[i+1]);
                } else result[i] = nums[i];

        }
        return result;
    }

}
