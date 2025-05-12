package main;

import clase.IRezervare;
import clase.ProxyNumarPersoane;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Gigel",5,12);

        IRezervare rezervareProxy = new ProxyNumarPersoane(rezervare);
        rezervareProxy.rezerva("Gigel",5,12);

    }
}
