package A2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WyczesA2Test {

    @Test
    public void shouldReturnEmptyString(){
        //given
        String s = "xx";
        //when
        String result = WyczesA2.withoutX(s);
        //then
        assertEquals("", result);
    }
    @Test
    public void shouldReturnHi(){
        //given
        String s = "xHix";
        //when
        String result = WyczesA2.withoutX(s);
        //then
        assertEquals("Hi", result);
    }
    @Test
    public void shouldReturnWordWithXinTheMiddle(){
        //given
        String s = "xHxxxix";
        //when
        String result = WyczesA2.withoutX(s);
        //then
        assertEquals("Hxxxi", result);
    }

    @Test
    @DisplayName("given array with two 7 next to each other")
    public void shouldReturnTrue77(){
        //given
       int[] i = {1,7,7};
        //when

        //then
        assertTrue(WyczesA2.has77(i));
    }

    @Test
    @DisplayName("given array with two 7 separated with another number")
    public void shouldReturnTrue717(){
        //given
        int[] i = {1,7, 1,7};
        //when

        //then
        assertTrue(WyczesA2.has77(i));
    }

    @Test
    @DisplayName("given array with no 7 at all")
    public void shouldReturnFalseNo7AtAll(){
        //given
        int[] i = {0,0,0,0};
        //when

        //then
        assertFalse(WyczesA2.has77(i));
    }

    @Test
    @DisplayName("given array with 7 separated by more than one number")
    public void shouldReturnFalseCauseTooWideGap(){
        //given
        int[] i = {1,2,3,7,8,8,7};
        //when

        //then
        assertFalse(WyczesA2.has77(i));
    }

    @Test
    @DisplayName("should return [1, 3, 3]")
    public void notAloneTest1(){
        //given
        int[] i = {1,2,3};
        int val = 2;
        int[] exp = {1,3,3};
        //when
        int[] result = WyczesA2.notAlone(i, val);
        //then
        assertArrayEquals(exp, result);
    }
    @Test
    @DisplayName("should return same array")
    public void notAloneTest2(){
        //given
        int[] i = {1,1,1,2};
        int val = 2;
        int[] exp = {1,1,1,2};
        //when
        int[] result = WyczesA2.notAlone(i, val);
        //then
        assertArrayEquals(exp, result);
    }
}