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
}