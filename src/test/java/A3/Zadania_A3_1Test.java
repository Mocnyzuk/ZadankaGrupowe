package A3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadania_A3_1Test {


    @Test
    void sleepIn()
    {
        //given
        boolean weekday = false;
        boolean vacations = true;
        //when
        Zadania_A3_1.sleepIn(weekday, vacations);
        //then
        assertTrue(Zadania_A3_1.sleepIn(weekday, vacations));
    }

    @Test
    void mixStart()
    {
        //given
        var str = "mix";
        //when
        Zadania_A3_1.mixStart(str);
        //then
        assertTrue(Zadania_A3_1.mixStart(str));
    }

    @Test
    void close10()
    {
        //given
        var a = 8;
        var b = 13;
        //when
        Zadania_A3_1.close10(a,b);
        //then
        assertEquals(8,Zadania_A3_1.close10(a,b));
    }


}