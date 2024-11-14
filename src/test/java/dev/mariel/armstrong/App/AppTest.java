package dev.mariel.armstrong.App;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {

    @Test
    void testMain() {
        String simulatedInput = "371";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        assertDoesNotThrow(() -> App.main(new String[0]));

        System.setOut(originalOut);
        System.setIn(System.in);

        String expectedOutput = "Ingrese un número: 371 es un Armstrong";
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }
}
