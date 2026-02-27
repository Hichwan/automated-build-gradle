package com.example.app;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Automated Build Demo (Gradle + GitHub Actions)");
        System.out.println("7 + 5 = " + calc.add(7, 5));
    }
}
