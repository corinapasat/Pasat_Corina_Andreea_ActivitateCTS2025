package Main;

import SingletonRegistry.AutoritatePescuit;
import SingletonRegistry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit = AutoritatePescuit.getInstance();
        Autorizatie autorizatieGeorge = autoritatePescuit.emiteAutorizatie("George");

        System.out.println(autorizatieGeorge.toString());

    }
}
