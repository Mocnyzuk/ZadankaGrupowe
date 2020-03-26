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
}