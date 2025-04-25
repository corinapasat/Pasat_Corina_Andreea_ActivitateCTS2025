package main;

import clase.IBuilder;
import clase.Rezervare;
import clase.RezervareBuilder;

public class Main {

    public static void main(String[] args) {
        IBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare;
        rezervare = rezervareBuilder.setAsezareGeam(true).setDecorareMasa(true).buildRezervare("Ion");

        System.out.println(rezervare.toString());
    }
}
