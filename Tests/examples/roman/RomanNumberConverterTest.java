package examples.roman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberConverterTest {

    @Test
    @DisplayName(("2500"))
    void convertToRomanNumber() {
        String expecto = "MMD";
        String patronum = RomanNumberConverter.convertToRomanNumber(2500);

        assertEquals(expecto,patronum);
    }

    @Test
    @DisplayName("7")
    void convert7ToRomanNumber() {
        String expecto = "VII";
        String patronum = RomanNumberConverter.convertToRomanNumber(7);

        assertEquals(expecto,patronum);
    }
    @Test
    @DisplayName("666")
    void convert666ToRomanNumber() {
        String expecto = "DCLXVI";
        String patronum = RomanNumberConverter.convertToRomanNumber(666);

        assertEquals(expecto,patronum);
    }
}