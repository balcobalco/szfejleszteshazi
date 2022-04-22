package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    Dice underTest;

    @BeforeEach
    void setUp() {
        underTest = new Dice();
    }

    @Test
    void testnagyobbmint1() throws IOException {
        assertEquals(true,  underTest.DiceRoll().getAktualis() >= 1);
    }

    @Test
    void testkisebbmint6() throws IOException {
        assertEquals(true,  underTest.DiceRoll().getAktualis() <= 6);
    }

    @Test
    void testatlagnemnegativ() throws IOException {
        assertEquals(true,  underTest.DiceRoll().getAtlag() >= 0);
    }

    @Test
    void testdobasokszamanemnegativ() throws IOException {
        assertEquals(true,  underTest.DiceRoll().getDobasokszama() >= 0);
    }

}