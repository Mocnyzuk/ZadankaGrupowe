package A3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadania_A3_3Test {

    @Test
    void diff21() {
        //given
        int expectedValue = 1;
        int number = 20;
        //when
        int returnedValue = Zadania_A3_3.diff21(number);
        //then
        assertEquals(expectedValue, returnedValue);
    }

    @Test
    void nearHundred() {
        //given
        boolean expectedValue = false;
        int number = 89;
        //when
        boolean returnedValue = Zadania_A3_3.nearHundred(number);
        //then
        assertEquals(expectedValue, returnedValue);
    }
}