package com.example;
public class UC4 {
    public static void main(String[] args) {
        String message = "World";

        if (args.length > 0) {
            message = String.join(", ", args);
        }

        System.out.println("Hello, " + message + "!");
    }
}