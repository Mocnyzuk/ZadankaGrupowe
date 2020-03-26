package A1;

public class CodingBatExercises {
    public static void main(String[] args) {
        //Warmup-1>endUp
        changeIntoUpperCase("moj napis");
        //Warmup-2 > array667
        countSix(new int[]{2, 6, 6, 7, 6});
        //String-1 > withoutX2
        checkIfX("xxyz");
        //Array-1 > front11
        firstElements(new int[]{}, new int[]{6, 7, 2});
    }

    //Warmup-1>endUp
    // Given a string, return a new string where the last 3 chars are now in upper case.
    // If the string has less than 3 chars, uppercase whatever is there.
    // Note that str.toUpperCase() returns the uppercase version of a string.
    public static String changeIntoUpperCase(String stringToBeChanged) {
        String frontPart;
        String endPart;
        String changedString;
        if (stringToBeChanged.length() < 3) {
            return stringToBeChanged.toUpperCase();
        } else
            frontPart = stringToBeChanged.substring(0, stringToBeChanged.length() - 3);
        endPart = stringToBeChanged.substring((stringToBeChanged.length() - 3), stringToBeChanged.length()).toUpperCase();
        changedString = frontPart + endPart;
        System.out.println(changedString);
        return changedString;

    }

    //Warmup-2 > array667
    //Given an array of ints, return the number of times
    // that two 6's are next to each other in the array.
    // Also count instances where the second "6" is actually a 7.
    public static int countSix(int[] testedArray) {
        int result = 0;
        for (int i = 0; i < (testedArray.length - 1); i++) {
            if (testedArray[i] == 6) {
                if (testedArray[i + 1] == 6 || testedArray[i + 1] == 7) {
                    result++;
                }
            }
        }
        System.out.println(result);
        return result;
    }

    //String-1 > withoutX2
    //Given a string, if one or both of the first 2 chars is 'x',
    // return the string without those 'x' chars,
    // and otherwise return the string unchanged.
    public static String checkIfX(String testedString) {
        String result = testedString;
        String firstLetter = testedString.substring(0, 1);
        String secondLetter = testedString.substring(1, 2);
        if (firstLetter.equals("x")) {
            if (secondLetter.equals("x")) {
                result = testedString.substring(2, testedString.length() - 1);
            } else {
                result = testedString.substring(1, testedString.length() - 1);
            }
        }
        System.out.println(result);
        return result;
    }

    //Array-1 > front11
    //Given 2 int arrays, a and b, of any length,
    // return a new array with the first element of each array.
    // If either array is length 0, ignore that array.
    public static int[] firstElements(int[] firstArray, int[] secondArray) {
        int[] result = new int[2];
        if (firstArray.length == 0) {
            result[0] = secondArray[0];
        } else if (secondArray.length == 0) {
            result[0] = firstArray[0];
        } else {
            result[0] = firstArray[0];
            result[1] = secondArray[0];
        }
            for (int i : result) {
                System.out.println(i);
            }
        return result;
    }
}
