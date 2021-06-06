/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */
package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        App app = new App();
        Scanner sc = new Scanner(System.in);

        String input;
        int stringLength;

        input = app.getInput(sc);
        stringLength = app.getStringLength(input);
        app.printResults(stringLength,input);

    }

    private  void printResults(int length, String input) {
        System.out.printf("%s  has %d characters.", input, length);
    }

    private  int getStringLength(String s) {
        return s.length();
    }

    private  String getInput(Scanner sc) {
        System.out.println("What is the input string?");
        String input = sc.nextLine();
        return input;
    }
}
