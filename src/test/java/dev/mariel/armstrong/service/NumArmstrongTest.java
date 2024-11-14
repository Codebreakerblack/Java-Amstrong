package dev.mariel.armstrong.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumArmstrongTest {
    @Test
    @DisplayName("Chequea si el numero 371 es Armstrong")
    void testCheckArmstrong1(){
        int num = 371;

        boolean result = NumArmstrong.checkArmstrong(num);
        
        assertTrue(result, num + "es un Armstrong");
    }

    @Test
    @DisplayName("Chequea si el numero 1634 es Armstrong")
    void testCheckArmstrong2() {
        int num = 1634;

        boolean result = NumArmstrong.checkArmstrong(num);

        assertTrue(result, num + "es un Armstrong");
    }

    @Test
    @DisplayName("Chequea si el numero 351 no es Armstrong")
    void testCheckNotArmstrong1() {
        int num = 351;

        boolean result = NumArmstrong.checkArmstrong(num);

        assertFalse(result, num + " no es un Armstrong");
    }

    @Test
    @DisplayName("Chequea si el numero 2015 no es Armstrong")
    void testCheckNotArmstrong2() {
        int num = 2015;

        boolean result = NumArmstrong.checkArmstrong(num);

        assertFalse(result, num + " no es un Armstrong");
    }

}
