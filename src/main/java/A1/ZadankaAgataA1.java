package A1;

public class ZadankaAgataA1 {

    /**
     * Given two int values, return their sum. Unless the two values are the same, then return double their sum.*/
    public static int sumDouble(int a, int b) {
        int sum = a+b ;
        if(a!=b) return sum;
        else return sum*2;
    }
    /**
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.*/
    public static boolean makes10(int a, int b) {
        return a + b == 10 || a == 10 || b == 10;
    }

    /**
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     * Note: use .equals() to compare 2 strings.*/

    public static String notString(String str) {
        if(str.startsWith("not")) return str;
        else return "not "+str;
    }

    /**
     * Given a string, we'll say that the front is the first 3 chars of the string.
     * If the string length is less than 3, the front is whatever is there.
     * Return a new string which is 3 copies of the front.*/
    public static String front3(String str) {
        if(str.length()>=3)
        {
            String threeLetters = str.substring(0,3);
            return threeLetters+threeLetters+threeLetters;
        }
        else return str+str+str;
    }

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is allowed,
     * so "xxx" contains 2 "xx".*/
    public static int countXX(String str) {
        int countOfXX= 0;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i, i+2).equals("xx")){
                countOfXX++;
            }
        }
        return countOfXX;
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.*/
    public static boolean arrayFront9(int[] nums) {
        int arrayLength = nums.length;
        if (arrayLength > 4) {
            arrayLength = 4;
        }
        for (int i = 0; i < arrayLength; i++) {
            if(nums[i]==9) return true;
        }
        return false;
    }

    /**
     * Given an array of ints, return the number of times
     * that two 6's are next to each other in the array.
     * Also count instances where the second "6" is actually a 7.*/
    public static int array667(int[] nums) {
        int numOfTimes = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7)){
                numOfTimes++;
            }
        }
        return numOfTimes;
    }

    /**
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
     * Given tag and word strings, create the HTML string with tags around the word,
     * e.g. "<i>Yay</i>".*/
    public static String makeTags(String tag, String word) {
        String openTag="<"+tag+">";
        String closeTag="</"+tag+">";
        return openTag+word+closeTag;
    }

    /**
     * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
     * The string length will be at least 2.*/
    public static String right2(String str) {
        if(str.length()>=2){
            String lastTwo = str.substring(str.length()-2);
            String result = lastTwo+str;
            return result.substring(0, str.length());
        }
        else return str;
    }

    /**Given a string, if one or both of the first 2 chars is 'x',
     * return the string without those 'x' chars, and otherwise return the string unchanged.
     * This is a little harder than it looks.*/
    public static String withoutX2(String str) {
        String tempStr = str;
        String rest="";
        int flag=0;
        if(str.length()>2) {
            tempStr = str.substring(0, 2);
            rest=str.substring(2);

            flag =1;
        }
        tempStr = tempStr.replace("x","");
        if(flag==0)
        {
            return tempStr;
        }
        else{
            if(tempStr.length()>0)
            {
                return tempStr+rest;
            }
            else{
                return rest;
            }
        }
    }
}

