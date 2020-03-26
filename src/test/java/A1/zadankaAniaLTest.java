package A1;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class zadankaAniaLTest {

    @Test
    @DisplayName("Warmup-1 > front22 || adding chars to long string")
    public void addCharsAtBeginingAndEndLongString() {
        //given
        String s = "kitten";

        //when
        String returnedValue = zadankaAniaL.addCharsAtBeginingAndEnd(s);

        //then
        assertEquals("kikittenki", returnedValue);
    }


    @Test
    @DisplayName("Warmup-1 > front22 || adding chars to short string")
    public void addCharsAtBeginingAndEndShortString() {
        //given
        String s = "a";

        //when
        String returnedValue = zadankaAniaL.addCharsAtBeginingAndEnd(s);

        //then
        assertEquals("aaa", returnedValue);
    }

    @Test
    @DisplayName("Warmup-1 > in1020 || one of numbers is in range")
    public void checkIfAnyOfNumbersIsInRange1020OneInRange() {
        //given
        int i = 11;
        int j = 23;

        //when
        boolean returnedValue = zadankaAniaL.checkIfAnyOfNumbersIsInRange1020(i, j);

        //then
        assertTrue(returnedValue);
    }

    @Test
    @DisplayName("Warmup-1 > in1020 || none of numbers is in range")
    public void checkIfAnyOfNumbersIsInRange1020NoneInRange() {
        //given
        int i = 34;
        int j = 21;

        //when
        boolean returnedValue = zadankaAniaL.checkIfAnyOfNumbersIsInRange1020(i, j);

        //then
        assertFalse(returnedValue);
    }

    @Test
    @DisplayName("Warmup-1 > in1020 || both numbers is in range")
    public void checkIfAnyOfNumbersIsInRange1020BothInRange() {
        //given
        int i = 10;
        int j = 20;

        //when
        boolean returnedValue = zadankaAniaL.checkIfAnyOfNumbersIsInRange1020(i, j);

        //then
        assertTrue(returnedValue);
    }

    @Test
    @DisplayName("Warmup-1 > delDel || delete subString del in String")
    public void deleteDel() {
        //given
        String s = "adel";

        //when
        String returnedValue = zadankaAniaL.deleteDel(s);

        //then
        assertEquals("a", returnedValue);
    }

    @Test
    @DisplayName("Warmup-1 > delDel || delete subString del in String nothing to delete")
    public void deleteDelNothingToDelete() {
        //given
        String s = "ade";

        //when
        String returnedValue = zadankaAniaL.deleteDel(s);

        //then
        assertEquals("ade", returnedValue);
    }

    @Test
    @DisplayName("Warmup-2 > stringX || remove x's from middle of string")
    public void removeXFromMiddleOFString() {
        //given
        String s = "aniaxmx";

        //when
        String returnedValue = zadankaAniaL.removeXFromMiddleOFString(s);

        //then
        assertEquals("aniamx", returnedValue);
    }
}
