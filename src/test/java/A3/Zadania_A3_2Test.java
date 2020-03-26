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

    @Test
    @DisplayName("noTriples([1, 1, 2, 2, 1]) → true")
    void noTriples() {
        // Given
        int array1[] = {1, 1, 2, 2, 1};
        int array2[] = {1, 1, 2, 2, 2, 1};
        // When
        // Then
        assertTrue(Zadania_A3_2.noTriples(array1));
        assertFalse(Zadania_A3_2.noTriples(array2));
    }

    @Test
    @DisplayName("firstLast6([1, 2, 6]) → true")
    void firstLast6() {
        // Given
        int array1[] = {1, 1, 2, 2, 1};
        int array2[] = {1, 1, 2, 2, 2, 6};
        // When
        // Then
        assertTrue(Zadania_A3_2.firstLast6(array2));
        assertFalse(Zadania_A3_2.firstLast6(array1));
    }

    @Test
    @DisplayName("commonEnd([1, 2, 3], [7, 3]) → true")
    void commonEnd() {
        // Given
        int array1[] = {1, 1, 2, 2, 1};
        int array2[] = {1, 1, 2, 2, 2, 6};
        int array3[] = {7, 1, 2, 2, 2, 7};
        // When
        // Then
        assertTrue(Zadania_A3_2.commonEnd(array1, array2));
        assertFalse(Zadania_A3_2.commonEnd(array1, array3));
    }

    @Test
    @DisplayName("unlucky1([1, 3, 4, 5]) → true")
    void unlucky1() {
        // Given
        int array1[] = {1, 3, 2, 2, 1};
        int array2[] = {1, 1, 2, 2, 1, 3};
        int array3[] = {7, 1, 2, 2, 2, 7};
        // When
        // Then
        assertTrue(Zadania_A3_2.unlucky1(array1));
        assertTrue(Zadania_A3_2.unlucky1(array2));
        assertFalse(Zadania_A3_2.unlucky1(array3));
    }
}