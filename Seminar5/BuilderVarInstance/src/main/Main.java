package main;

import clase.IBuilder;
import clase.Rezervare;
import clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder builder = new RezervareBuilder("George");
        Rezervare rezervare;
        Rezervare rezervare1;

        rezervare = builder.setDecorareMasa(true).setAsezareGeam(true).buildRezervare();
        rezervare1 = builder.setGenMuzica("Lautareasca").buildRezervare();
        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());
    }
}
