package A1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZadankaJJTest {

    @Test
    void arrayFront9assertTrue() {
        assertTrue(ZadankaJJ.arrayFront9(new int[]{1, 2, 9, 3, 4}));
    }
    @Test
    void arrayFront9assertFalse() {
        assertFalse(ZadankaJJ.arrayFront9(new int[]{1, 2, 3, 4, 9}));
    }
}