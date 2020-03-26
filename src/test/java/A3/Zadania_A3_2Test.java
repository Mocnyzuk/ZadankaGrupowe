package A3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadania_A3_2Test {

    @Test
    @DisplayName("missingChar(\"kitten\", 1) → \"ktten\"")
    void missingChar() {
        // Given
        String str = "kitten";
        // When
        // Then
        assertEquals("ktten", Zadania_A3_2.missingChar("kitten",1));
    }

    @Test
    @DisplayName("backAround(\"cat\") → \"tcatt\"")
    void backAround() {
        // Given
        String str = "cat";
        // When
        // Then
        assertEquals("tcatt", Zadania_A3_2.backAround(str));
    }

    @Test
    @DisplayName("altPairs(\"kitten\") → \"kien\"")
    void altPairs() {
        // Given
        String str = "kitten";
        // When
        // Then
        assertEquals("kien", Zadania_A3_2.altPairs(str));
    }
}