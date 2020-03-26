package A2;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AuA2Test {

    @Test
    @DisplayName("monkeyTrouble(true, true) → true")
    void monkeyTroubleCase1() {
        //given
        boolean aSmile = true;
        boolean bSmile = true;
        //when
        boolean result = AuA2.monkeyTrouble(aSmile, bSmile);
        //then
        assertTrue(result);
    }


    @Test
    @DisplayName("monkeyTrouble(false, false) → true")
    void monkeyTroubleCase2() {
        //given
        boolean aSmile = false;
        boolean bSmile = false;
        //when
        boolean result = AuA2.monkeyTrouble(aSmile, bSmile);
        //then
        assertTrue(result);
    }

    @Test
    @DisplayName(" monkeyTrouble(true,false) → false")
    void monkeyTroubleCase3() {
        //given
        boolean aSmile = true;
        boolean bSmile = false;
        //when
        boolean result = AuA2.monkeyTrouble(aSmile, bSmile);
        //then
        assertFalse(result);
    }
//......................................................................................................................
    @Test
    @DisplayName("parrotTrouble(true, 6) → true")
    void parrotTroubleCase1() {
        //given
        boolean isTalking = true;
        int hour = 6;
        //when
        boolean result = AuA2.parrotTrouble(isTalking, hour);
        //then
        assertTrue(result);
    }

    @Test
    @DisplayName("parrotTrouble(true, 7) → false")
    void parrotTroubleCase2() {
        //given
        boolean isTalking = true;
        int hour = 7;
        //when
        boolean result = AuA2.parrotTrouble(isTalking, hour);
        //then
        assertFalse(result);
    }


    @Test
    @DisplayName("parrotTrouble(false, 6) → false")
    void parrotTroubleCase3() {
        //given
        boolean isTalking = false;
        int hour = 6;
        //when
        boolean result = AuA2.parrotTrouble(isTalking, hour);
        //then
        assertFalse(result);
    }


    @Test
    @DisplayName("parrotTrouble(true, 21) -> true")
    void parrotTroubleCase4() {
        //given
        boolean isTalking = true;
        int hour = 21;
        //when
        boolean result = AuA2.parrotTrouble(isTalking, hour);
        //then
        assertTrue(result);
    }


    @Test
    @DisplayName("parrotTrouble(false, 21) → false")
    void parrotTroubleCase5() {
        //given
        boolean isTalking = false;
        int hour = 21;
        //when
        boolean result = AuA2.parrotTrouble(isTalking, hour);
        //then
        assertFalse(result);
    }

    @Test
    @DisplayName("parrotTrouble(false, 20) → false")
    void parrotTroubleCase6() {
        //given
        boolean isTalking = false;
        int hour = 20;
        //when
        boolean result = AuA2.parrotTrouble(isTalking, hour);
        //then
        assertFalse(result);
    }


    @Test
    @DisplayName("parrotTrouble(true, 23) → true")
    void parrotTroubleCase7() {
        //given
        boolean isTalking = true;
        int hour = 23;
        //when
        boolean result = AuA2.parrotTrouble(isTalking, hour);
        //then
        assertTrue(result);
    }


    @Test
    @DisplayName("parrotTrouble(false, 23) → false")
    void parrotTroubleCase8() {
        //given
        boolean isTalking = false;
        int hour = 23;
        //when
        boolean result = AuA2.parrotTrouble(isTalking, hour);
        //then
        assertFalse(result);
    }

    @Test
    @DisplayName("parrotTrouble(true, 20) → false")
    void parrotTroubleCase9() {
        //given
        boolean isTalking = true;
        int hour = 20;
        //when
        boolean result = AuA2.parrotTrouble(isTalking, hour);
        //then
        assertFalse(result);
    }

    @Test
    @DisplayName("parrotTrouble(false, 12) → false")
    void parrotTroubleCase10() {
        //given
        boolean isTalking = false;
        int hour = 12;
        //when
        boolean result = AuA2.parrotTrouble(isTalking, hour);
        //then
        assertFalse(result);
    }
//......................................................................................................................
    @Test
    @DisplayName("bigDiff([10, 3, 5, 6]) → 7")
    void bigDiffCase1() {
        //given
        int[] tab = {10, 3, 5, 6};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(7, result);
    }


    @Test
    @DisplayName("bigDiff([7, 2, 10, 9]) → 8")
    void bigDiffCase2() {
        //given
        int[] tab = {7, 2, 10, 9};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(8, result);
    }
    @Test
    @DisplayName("bigDiff([2, 10, 7, 2]) → 8")
    void bigDiffCase3() {
        //given
        int[] tab = {2, 10, 7, 2};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(8, result);
    }

    @Test
    @DisplayName("bigDiff([2, 10]) → 8")
    void bigDiffCase4() {
        //given
        int[] tab = {2, 10};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(8, result);
    }

    @Test
    @DisplayName("bigDiff([10, 2]) → 8")
    void bigDiffCase5() {
        //given
        int[] tab = {10, 2};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(8, result);
    }

    @Test
    @DisplayName("bigDiff([10, 0]) → 10")
    void bigDiffCase6() {
        //given
        int[] tab = {10, 0};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(10, result);
    }

    @Test
    @DisplayName("bigDiff([2, 3]) → 1")
    void bigDiffCase7() {
        //given
        int[] tab = {2, 3};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(1, result);
    }

    @Test
    @DisplayName("bigDiff([2, 2]) → 0")
    void bigDiffCase8() {
        //given
        int[] tab = {2, 2};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(0, result);
    }

    @Test
    @DisplayName(" bigDiff([2]) → 0")
    void bigDiffCase9() {
        //given
        int[] tab = {2};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(0, result);
    }


    @Test
    @DisplayName("bigDiff([5, 1, 6, 1, 9, 9]) → 8")
    void bigDiffCase10() {
        //given
        int[] tab = {5, 1, 6, 1, 9, 9};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(8, result);
    }


    @Test
    @DisplayName("bigDiff([7, 6, 8, 5]) → 3")
    void bigDiffCase11() {
        //given
        int[] tab = {7, 6, 8, 5};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(3, result);
    }

    @Test
    @DisplayName("bigDiff([7, 7, 6, 8, 5, 5, 6]) → 3")
    void bigDiffCase12() {
        //given
        int[] tab = {7, 7, 6, 8, 5, 5, 6};
        //when
        int result = AuA2.bigDiff(tab);
        //then
        assertEquals(3, result);
    }

    @Test
    void isEverywhere() {
        fail();
    }
//......................................................................................................................
}