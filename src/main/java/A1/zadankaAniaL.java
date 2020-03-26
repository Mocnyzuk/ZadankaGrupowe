package A1;

public class zadankaAniaL {

    public static String addCharsAtBeginingAndEnd(String str) {
        String returnedString = "";
        String twoFirstLetters = twoFirstLetters(str);
        returnedString += twoFirstLetters + str + twoFirstLetters;
        return returnedString;
    }

    public static boolean checkIfAnyOfNumbersIsInRange1020(int number1, int number2) {
        return (number1 >= 10 && number1 <= 20) || (number2 >= 10 && number2 <= 20);
    }

    public static String deleteDel(String str) {
        if (str.length() > 3 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        } else {
            return str;
        }
    }

    public static String removeXFromMiddleOFString(String str) {
        if (str.length() < 1) {
            return "";
        } else if (str.length() < 3) {
            return str;
        }

        String returnedValue = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                returnedValue += str.charAt(i);
            }
        }
        return returnedValue + str.charAt(str.length() - 1);

    }

    private static String twoFirstLetters(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }
}
