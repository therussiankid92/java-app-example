package com.therussiankid92.javaAppExample;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InputReceiver {

    private final Scanner scanner;
    private final PrintStream out;

    public InputReceiver(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.out = out;
    }

    public int askForInput(String message) {
        out.println(message);
        return scanner.nextInt();
    }
}
