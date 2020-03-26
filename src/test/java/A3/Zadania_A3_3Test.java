package A3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadania_A3_3Test {

    @Test
    void testDiff21() {
        //given
        int expectedValue = 1;
        int number = 20;
        //when
        int returnedValue = Zadania_A3_3.diff21(number);
        //then
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    void testNearHundred() {
        //given
        boolean expectedValue = false;
        int number = 89;
        //when
        boolean returnedValue = Zadania_A3_3.nearHundred(number);
        //then
        assertEquals(expectedValue, returnedValue);
    }


    @Test
    void last2() {
        //given
        int expectedValue = 2;
        String text = "axxxaaxx";
        //when
        int returnedValue = Zadania_A3_3.last2(text);
        //then
        assertEquals(expectedValue, returnedValue);
    }



   @Test
    void array123() {
       //given
       boolean expectedValue = true;
       int[] nums= {1,2,3,1,2,3};
       //when
       boolean returnedValue = Zadania_A3_3.array123(nums);
       //then
       assertEquals(expectedValue, returnedValue);
    }
}