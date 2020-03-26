package A1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZadankaAgataA1Test {

    @Test
    @DisplayName("Warmup1 - sumDouble method")
    void sumDouble() {
        //given
        int a=3;
        int b=3;
        //when
        int result = ZadankaAgataA1.sumDouble(a,b);
        //then
        assertEquals(12,result);
    }

    @Test
    @DisplayName("Warmup1 - sumDouble method test2")
    void sumDouble2() {
        //given
        int a=2;
        int b=3;
        //when
        int result = ZadankaAgataA1.sumDouble(a,b);
        //then
        assertEquals(5,result);
    }

    @Test
    @DisplayName("Warmup1 - makes10 method")
    void makes10() {
        //given
        int a=10;
        int b=3;
        //when
        //then
        assertTrue(ZadankaAgataA1.makes10(a,b));
    }

    @Test
    @DisplayName("Warmup1 - makes10 method test2")
    void makes10A() {
        //given
        int a=4;
        int b=3;
        //when
        //then
        assertFalse(ZadankaAgataA1.makes10(a,b));
    }

    @Test
    @DisplayName("Warmup1 - notString method")
    void notString() {
        //given
        String str = "good";
        //when
        String strResult = ZadankaAgataA1.notString(str);
        //then
        assertEquals("not good", strResult);
    }

    @Test
    @DisplayName("Warmup1 - front3")
    void front3() {
        //given
        String str = "target";
        //when
        String strResult = ZadankaAgataA1.front3(str);
        //then
        assertEquals("tartartar", strResult);
    }

    @Test
    @DisplayName("Warmup2 - countXX")
    void countXX() {
        //given
        String str = "abcdgxxxx";
        //when
        int countOfXX = ZadankaAgataA1.countXX(str);
        //then
        assertEquals(3,countOfXX);
    }

    @Test
    @DisplayName("Warmup-2 - arrayFront9")
    void arrayFront9() {
        //given
        int[] array={2,9,0,5,3};
        //when
        //then
        assertTrue(ZadankaAgataA1.arrayFront9(array));
    }

    @Test
    @DisplayName("Warmup-2 - array667")
    void array667() {
        //given
        int[] array={6,4,6,7,2,1,6};
        //when
        int count = ZadankaAgataA1.array667(array);
        //then
        assertEquals(1, count);
    }

    @Test
    @DisplayName("String-1 - makeTags")
    void makeTags() {
        //given
        String tag = "i";
        String word = "test";
        //when
        String strResult = ZadankaAgataA1.makeTags(tag, word);
        //then
        assertEquals("<i>test</i>", strResult);
    }


    @Test
    @DisplayName("String-1 - right2")
    void right2() {
        //given
        String word = "test";
        //when
        String strResult = ZadankaAgataA1.right2(word);
        //then
        assertEquals("stte", strResult);
    }

    @Test
    @DisplayName("String-1 - withoutX2")
    void withoutX2() {
        //given
        String word = "xHi";
        //when
        String strResult = ZadankaAgataA1.withoutX2(word);
        //then
        assertEquals("Hi", strResult);
    }
}
