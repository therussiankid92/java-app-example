package com.therussiankid92.javaAppExample;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.therussiankid92.javaAppExample.NumberToRomanConverter.convert;

public class Main {
    public static void main(String[] args) {
        getInputFromUser(new InputReceiver(System.in, System.out));
    }

    public static String getInputFromUser(InputReceiver inputReceiver) {
        String response = "";
        try {
            int number = inputReceiver.askForInput("Number to convert to roman:");
            response = "Result: " + convert(number);
        }
        catch (InputMismatchException e) {
            response = "Invalid input.";
        }
        System.out.println(response);
        return response;
    }


}
