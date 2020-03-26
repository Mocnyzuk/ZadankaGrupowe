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

    @Test
    void stringTimes()
    {
        //given
        var str = "Hi";
        var n = 2;
        //when
        Zadania_A3_1.stringTimes(str,n);
        //then
        assertEquals("HiHi", Zadania_A3_1.stringTimes(str,n));

    }

    @Test
    void doubleX()
    {
        //given
        var str = "axx";
        //when
        Zadania_A3_1.doubleX(str);
        //then
        assertTrue(Zadania_A3_1.doubleX(str));

    }

    @Test
    void firstHalf()
    {
        //given
        var str ="WooHoo";
        //when
        Zadania_A3_1.firstHalf(str);
        //then
        assertEquals("Woo", Zadania_A3_1.firstHalf(str));
    }

    @Test
    void nonStart()
    {
        //given
        var a = "Hello";
        var b = "There";
        //when
        Zadania_A3_1.nonStart(a,b);
        //then
        assertEquals("ellohere",Zadania_A3_1.nonStart(a,b));
    }


}