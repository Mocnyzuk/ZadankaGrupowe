package A1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZadankaJJTest {

    @Test
    void arrayFront9assertTrue() {
        assertTrue(ZadankaJJ.arrayFront9(new int[]{1, 2, 9, 3, 4}));
    }
    @Test
    void arrayFront9assertFalse() {
        assertFalse(ZadankaJJ.arrayFront9(new int[]{1, 2, 3, 4, 9}));
    }

    @Test
    void stringX() {
        assertEquals("xHix", ZadankaJJ.stringX("xxHxix"));
    }
    @Test
    void stringXDwa() {
        assertEquals("abcd", ZadankaJJ.stringX("abxxxcd"));
    }

    @Test
    void stringSplosion() {
        assertEquals("CCoCodCode", ZadankaJJ.stringSplosion("Code"));
    }
    @Test
    void stringSplosionDwa() {
            assertEquals("aababc", ZadankaJJ.stringSplosion("abc"));
        }

    @Test
    void less20() {
        assertTrue(ZadankaJJ.less20(18));
    }
    @Test
    void less20d() {
        assertFalse(ZadankaJJ.less20(20));
    }

    @Test
    void fizzString2() {
        assertEquals("1!", ZadankaJJ.fizzString2(1));
    }
    @Test
    void fizzString22() {
        assertEquals("Fizz!", ZadankaJJ.fizzString2(3));
    }

    @Test
    void luckySum() {
        assertEquals(6, ZadankaJJ.luckySum(1, 2, 3));
    }
    @Test
    void luckySum2() {
        assertEquals(3, ZadankaJJ.luckySum(1, 2, 13));
    }

    @Test
    void closeFar() {
        assertTrue(ZadankaJJ.closeFar(1, 2,10));
    }
    @Test
    void closeFa2r() {
        assertFalse(ZadankaJJ.closeFar(1, 2,3));
    }

    @Test
    void makeChocolate() {
        assertEquals(4, ZadankaJJ.makeChocolate(4, 1, 9));
    }

    @Test
    void makeChocolat2e() {
        assertEquals(-1, ZadankaJJ.makeChocolate(4, 1, 10));
    }

    @Test
    void has23() {
        assertTrue(ZadankaJJ.has23(new int[] {2, 5}));
    }
    @Test
    void has223() {
        assertFalse(ZadankaJJ.has23(new int[]{4, 5}));
    }

    @Test
    void biggetTwso() {
        int[] a = new int[]{1,2};
        int[]b = new int[]{3, 4};
        assertEquals(b, ZadankaJJ.biggetTwo(a,b ));
    }
    @Test
    void biggetTwo() {
        int[] a = new int[]{1,1};
        int[]b = new int[]{1,2};
        assertEquals(b, ZadankaJJ.biggetTwo(a, b));
    }

    @Test
    void frontPiece() {
        int[] nums = {1, 2, 3};
        int endIndex = 2;
        assertArrayEquals(Arrays.copyOfRange(nums, 0, endIndex), ZadankaJJ.frontPiece(nums));

    }
    @Test
    void frontPiesce() {
        int[] nums = {1};
        int endIndex = 1;
        assertArrayEquals(Arrays.copyOfRange(nums, 0, endIndex), ZadankaJJ.frontPiece(nums));
    }

    @Test
    void swapEnds() {
        assertArrayEquals(new int[]{4,2,3,1}, ZadankaJJ.swapEnds(new int[]{1, 2, 3, 4}));
    }
    @Test
    void swapE2nds() {
        assertArrayEquals(new int[]{3, 2, 1}, ZadankaJJ.swapEnds(new int[]{1, 2, 3}));
    }
}

