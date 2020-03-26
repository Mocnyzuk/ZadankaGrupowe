package A3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadania_A3_4Test {

    @Test
    void startHi() {
        //given
        String text = "Hi Adam";
        //when
        boolean isStartHI = Zadania_A3_4.startHi(text);
        //then
        assertTrue(isStartHI);
    }

    @Test
    void hasTeen() {
        //given
        int a = 4;
        int b = 10;
        int c = 15;
        //when
        boolean isHasTeen = Zadania_A3_4.hasTeen(a,b,c);
        //then
        assertTrue(isHasTeen);
    }

    @Test
    void stringE() {
        //given
        String text = "Heelle";
        //when
        boolean result = Zadania_A3_4.stringE(text);
        //then
        assertTrue(result);
    }

    @Test
    void everyNth() {
        //given
        String text = "abcdefg";
        int n = 2;
        //when
        String result = Zadania_A3_4.everyNth(text, n);
        //then
        assertEquals("aceg", result);
    }

    @Test
    void helloName() {
        //given
        String name = "Patryk";
        //when
        String result = Zadania_A3_4.helloName(name);
        //then
        assertEquals("Hello Patryk", result);
    }

    @Test
    void makeOutWord() {
        //given
        String out = "<<>>";
        String text = "WooHoo";
        //when
        String result = Zadania_A3_4.makeOutWord(out, text);
        //then
        assertEquals("<<WooHoo>>", result);
    }

    @Test
    void theEnd() {
        //given
        String text = "Hello";
        //when
        String result = Zadania_A3_4.theEnd(text, false);
        //then
        assertEquals("o", result);
    }

    @Test
    void seeColor() {
        //given
        String text = "blueTimes";
        //when
        String result = Zadania_A3_4.seeColor(text);
        //then
        assertEquals("blue",result);
    }

    @Test
    void extraFront() {
        //given
        String text = "ab";
        //when
        String result = Zadania_A3_4.extraFront(text);
        //then
        assertEquals("ababab", result);
    }

    @Test
    void cigarParty() {
        //given weekend true in method call
        int cigars = 70;
        //when
        boolean result = Zadania_A3_4.cigarParty(cigars, true);
        //then
        assertTrue(result);
    }

    @Test
    void caughtSpeeding() {
        //given birthday false in method call
        int speed = 65;
        //when
        int result = Zadania_A3_4.caughtSpeeding(65,false);
        //then
        assertEquals(1, result);
    }
}