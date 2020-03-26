package A1;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class zadanka2AniaLTest {

    @Test
    @DisplayName("String-1 > comboString || combine two Strings")
    public void combineStrings() {
        //given
        String s1 = "a";
        String s2 = "ni";

        //when
        String returnedValue = zadanka2AniaL.combineStrings(s1, s2);

        //then
        assertEquals("ania", returnedValue);
    }


    @Test
    @DisplayName("String-1 > minCat || combine two Strings and omits chars from longer String, first String longer")
    public void minCat() {
        //given
        String s1 = "abc";
        String s2 = "x";

        //when
        String returnedValue = zadanka2AniaL.minCat(s1, s2);

        //then
        assertEquals("cx", returnedValue);
    }

    @Test
    @DisplayName("String-1 > minCat || combine two Strings and omits chars from longer String, second String longer")
    public void minCatSecondStringLonger() {
        //given
        String s1 = "x";
        String s2 = "abc";

        //when
        String returnedValue = zadanka2AniaL.minCat(s1, s2);

        //then
        assertEquals("xc", returnedValue);
    }

    @Test
    @DisplayName("Array-1 > rotateLeft3 || move each element in array")
    public void rotateLeft3() {
        //given
        int[] arrayToRotate = {1, 2, 3};

        //when
        int[] returnedValue = zadanka2AniaL.rotateLeft3(arrayToRotate);

        //then
        assertArrayEquals(new int[]{2, 3, 1}, returnedValue);
    }

    @Test
    @DisplayName("Array-1 > double23 || check if array contains 2 twice, or 3 twice")
    public void double2Or3() {
        //given
        int[] array = {2, 3};

        //when
        boolean returnedValue = zadanka2AniaL.double2Or3(array);

        //then
        assertFalse(returnedValue);
    }

    @Test
    @DisplayName("Logic-1 > alarmClock || shows when alarm clock should ring, should return off")
    public void alarmClockVacationsWeekend() {
        //given
        int dayOFTheWeek = 0;

        //when
        String returnedValue = zadanka2AniaL.alarmClock(dayOFTheWeek, true);

        //then
        assertEquals("off", returnedValue);
    }

    @Test
    @DisplayName("Logic-1 > alarmClock || shows when alarm clock should ring, should return 10:00")
    public void alarmClockVacationsWeekDay() {
        //given
        int dayOFTheWeek = 2;

        //when
        String returnedValue = zadanka2AniaL.alarmClock(dayOFTheWeek, true);

        //then
        assertEquals("10:00", returnedValue);
    }

    @Test
    @DisplayName("Logic-1 > alarmClock || shows when alarm clock should ring, should return 7:00")
    public void alarmClockNoVacationsWeekDay() {
        //given
        int dayOFTheWeek = 2;

        //when
        String returnedValue = zadanka2AniaL.alarmClock(dayOFTheWeek, false);

        //then
        assertEquals("7:00", returnedValue);
    }

    @Test
    @DisplayName("Logic-2 > luckySum || Given 3 int values, a b c, return their sum. Not counting next ints if met 13, b=13")
    public void luckySum() {
        //given
        int a = 5;
        int b = 13;
        int c = 7;

        //when
        int returnedValue = zadanka2AniaL.luckySum(a, b, c);

        //then
        assertEquals(5, returnedValue);
    }

    @Test
    @DisplayName("Logic-2 > luckySum || Given 3 int values, a b c, return their sum. Not counting next ints if met 13, a=13")
    public void luckySumAEquals13() {
        //given
        int a = 13;
        int b = 4;
        int c = 7;

        //when
        int returnedValue = zadanka2AniaL.luckySum(a, b, c);

        //then
        assertEquals(0, returnedValue);
    }

    @Test
    @DisplayName("Logic-2 > luckySum || Given 3 int values, a b c, return their sum. Not counting next ints if met 13, c=13")
    public void luckySumCEquals13() {
        //given
        int a = 5;
        int b = 7;
        int c = 13;

        //when
        int returnedValue = zadanka2AniaL.luckySum(a, b, c);

        //then
        assertEquals(12, returnedValue);
    }

    @Test
    @DisplayName("Logic-1 > specialEleven || Return true if the given non-negative number mod 11 equals 1 or 0")
    public void specialEleven() {
        //given
        int n = 11;

        //when
        boolean returnedValue = zadanka2AniaL.specialEleven(n);

        //then
        assertTrue(returnedValue);
    }
}
