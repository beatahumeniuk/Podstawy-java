package com.company;

//Stwórz dwa obiekty i przetestuj zgodność zawartego kodu.

public class Main {

    public static void main(String[] args) {

        Hooman h1 = new Hooman("Maria", "Warszawa", 30);

        System.out.println(h1.greeting());

        Calculator c1 = new Calculator(7, 2);

        System.out.println(c1.sum());
        System.out.println(c1.subtraction());
        System.out.println(c1.multiplication());
        System.out.println(c1.division());
    }
}
