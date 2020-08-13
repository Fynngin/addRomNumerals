package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void inputNull() {
        String res = Main.addRom(null, null);
        assertNull(res);
    }

    @Test
    void inputDec() {
        String res = Main.addRom("1", "2");
        assertNull(res);
    }

    @Test
    void numerals1() {
        String res = Main.addRom("I", "I");
        assertEquals(res, "II");
    }

    @Test
    void numerals2() {
        String res = Main.addRom("II", "III");
        assertEquals(res, "V");
    }

    @Test
    void numerals3() {
        String res = Main.addRom("II", "II");
        assertEquals(res, "IV");
    }

    @Test
    void numerals4() {
        String res = Main.addRom("X", "V");
        assertEquals(res, "XV");
    }

    @Test
    void numerals5() {
        String res = Main.addRom("V", "X");
        assertEquals(res, "XV");
    }
}