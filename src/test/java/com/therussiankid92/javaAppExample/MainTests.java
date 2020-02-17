package com.therussiankid92.javaAppExample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static com.therussiankid92.javaAppExample.Main.getInputFromUser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTests {
    @Test
    @DisplayName("Valid Input (Integer)")
    public void validInput() {
        InputReceiver inputReceiver = mock(InputReceiver.class);
        when(inputReceiver.askForInput(anyString())).thenReturn(3);
        assertEquals(getInputFromUser(inputReceiver), "Result: III");
    }

    @Test
    @DisplayName("Invalid Input")
    public void invalidInput() {
        InputReceiver inputReceiver = mock(InputReceiver.class);
        when(inputReceiver.askForInput(anyString())).thenThrow(new InputMismatchException());
        assertEquals(getInputFromUser(inputReceiver), "Invalid input.");
    }

}
