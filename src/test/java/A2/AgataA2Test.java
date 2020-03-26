package A2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgataA2Test {

    @Test
    @DisplayName("6 -> true")
    void multipleOf3() {
        //given
        int numToCheck = 6;
        //when 6 is a multiple of 3 and not 5
        //then
        assertTrue(AgataA2.old35(numToCheck));
    }
    @Test
    @DisplayName("10 -> true")
    void multipleOf5() {
        //given
        int numToCheck = 10;
        //when 10 is a multiple of 5 and not 3
        //then
        assertTrue(AgataA2.old35(numToCheck));
    }
    @Test
    @DisplayName("15 -> false")
    void multipleOf35() {
        //given
        int numToCheck = 15;
        //when 15 is a multiple of 3 and 5
        //then
        assertFalse(AgataA2.old35(numToCheck));
    }
    @Test
    @DisplayName("1 -> false")
    void multipleOfNone() {
        //given
        int numToCheck = 1;
        //when 15 is a multiple of 3 and 5
        //then
        assertFalse(AgataA2.old35(numToCheck));
    }
    @Test
    @DisplayName("-3 -> false")
    void old32NegativeNum() {
        //given
        int numToCheck = -3;
        //when 15 is a multiple of 3 and 5
        //then
        assertFalse(AgataA2.old35(numToCheck));
    }


    @Test
    @DisplayName("5 between 1-10 -> true")
    void check5in1To10() {
        //given
        int checkedNum = 5;
        boolean outsideMode = false;
        //when
        //then
        assertTrue(AgataA2.in1To10(checkedNum, outsideMode));
    }
    @Test
    @DisplayName("11 between 1-10 -> false")
    void check11in1To10() {
        //given
        int checkedNum = 11;
        boolean outsideMode = false;
        //when
        //then
        assertFalse(AgataA2.in1To10(checkedNum, outsideMode));
    }
    @Test
    @DisplayName("11 outside 1-10 -> true")
    void check11out1To10() {
        //given
        int checkedNum = 11;
        boolean outsideMode = true;
        //when
        //then
        assertTrue(AgataA2.in1To10(checkedNum, outsideMode));
    }
    @Test
    @DisplayName("5 outside 1-10 -> false")
    void check5out1To10() {
        //given
        int checkedNum = 5;
        boolean outsideMode = true;
        //when
        //then
        assertFalse(AgataA2.in1To10(checkedNum, outsideMode));
    }

    @Test
    @DisplayName("is test → is not test")
    void replaceIsTest() {
        //given
        String toModify = "is test";
        String expected = "is not test";
        //when
        String returned = AgataA2.notReplace(toModify);
        //then
        assertEquals(expected, returned);
    }
    @Test
    @DisplayName("is-is → is not-is not")
    void replaceIsIs() {
        //given
        String toModify = "is-is";
        String expected = "is not-is not";
        //when
        String returned = AgataA2.notReplace(toModify);
        //then
        assertEquals(expected, returned);
    }
    @Test
    @DisplayName("AAAis is -> AAAis is not")
    void replaceAAA() {
        //given
        String toModify = "AAAis is";
        String expected = "AAAis is not";
        //when
        String returned = AgataA2.notReplace(toModify);
        //then
        assertEquals(expected, returned);
    }

    @Test
    @DisplayName("(3, 4) → 7")
    void teenSumBothSmall() {
        //given
        int a = 3;
        int b= 4;
        int expected = 7;
        //when
        int returned = AgataA2.teenSum(a,b);
        //then
        assertEquals(expected,returned);
    }
    @Test
    @DisplayName("(10, 13) → 19")
    void teenSumOneTeen() {
        //given
        int a = 10;
        int b= 13;
        int expected = 19;
        //when
        int returned = AgataA2.teenSum(a,b);
        //then
        assertEquals(expected,returned);
    }

    @Test
    @DisplayName("(3, 4) → 7")
    void sortaSumSmaller() {
        //given
        int a = 3;
        int b= 4;
        int expected = 7;
        //when
        int returned = AgataA2.sortaSum(a,b);
        //then
        assertEquals(expected,returned);
    }
    @Test
    @DisplayName("(9, 4) → 20")
    void sortaSumForbidden() {
        //given
        int a = 9;
        int b= 4;
        int expected = 20;
        //when
        int returned = AgataA2.sortaSum(a,b);
        //then
        assertEquals(expected,returned);
    }
    @Test
    @DisplayName("(10, 11) → 21")
    void sortaSumBigger() {
        //given
        int a = 10;
        int b= 11;
        int expected = 21;
        //when
        int returned = AgataA2.sortaSum(a,b);
        //then
        assertEquals(expected,returned);
    }
}