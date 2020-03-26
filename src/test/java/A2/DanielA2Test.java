package A2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DanielA2Test {

    //countTripleTests:
    @Test
    @DisplayName("countTriple: Should return 1")
    void countTriple() {
        assertEquals(1, DanielA2.countTriple("abcXXXabc"));
    }

    @Test
    @DisplayName("countTriple: Should return 4")
    void countTriple2() {
        assertEquals(4, DanielA2.countTriple("abYYYabXXXXXab"));
    }

    //evenlySpacedTests:
    @Test
    @DisplayName("evenlySpaced: Should return true")
    void evenlySpaced() {
        assertTrue(DanielA2.evenlySpaced(2, 4, 6));
    }

    @Test
    @DisplayName("evenlySpaced: Should return false")
    void evenlySpaced2() {
        assertFalse(DanielA2.evenlySpaced(4, 6, 3));
    }

    //only14Tests:
    @Test
    @DisplayName("only14: Should return false")
    void only14() {
        int[] tab = {1, 4, 1, 2, 4};
        assertFalse(DanielA2.only14(tab));
    }

    @Test
    @DisplayName("only14: Should return true")
    void only14_2() {
        int[] tab = {1, 4, 1, 4};
        assertTrue(DanielA2.only14(tab));
    }

    //tenRunTests:
    @Test
    @DisplayName("tenRun: Should return int[]={2, 10, 10, 10, 20, 20}")
    void tenRun() {
        int[] tab = {2, 10, 3, 4, 20, 5};
        int[] wynik = {2, 10, 10, 10, 20, 20};
        assertArrayEquals(wynik, DanielA2.tenRun(tab));
    }

    @Test
    @DisplayName("tenRun: Should return int[]={2, 10, 10, 10, 20, 20}")
    void tenRun2() {
        int[] tab = {1, 20, 50, 1};
        int[] wynik = {1, 20, 50, 50};
        assertArrayEquals(wynik, DanielA2.tenRun(tab));
    }

    //loneSumTests
    @Test
    @DisplayName("loneSum: Should return 9")
    void loneSum() {
        assertEquals(9, DanielA2.loneSum(9,2,2));
    }

    @Test
    @DisplayName("loneSum: Should return 0")
    void loneSum2() {
        assertEquals(0, DanielA2.loneSum(3,3,3));
    }

}