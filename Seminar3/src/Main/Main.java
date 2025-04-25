package Main;

import Clase.AutoritatePescuitEager;
import Clase.AutoritatePescuitLazy;

public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager.concediaza(2);
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.setDenumire("ANpPA");
        autoritatePescuitEager.setWebsite("ANpPa.ro");
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.emiteAutorizare("Gigi");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager autoritatePescuitEager1 = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager1.emiteAutorizare("Aly");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitLazy autoritatePescuitLazy = AutoritatePescuitLazy.getInstance("anpa.ro", "anpa", 10,5);
        AutoritatePescuitLazy autoritatePescuitLazy2 = AutoritatePescuitLazy.getInstance("aspa.ro", "asda",12,9);

        autoritatePescuitLazy.setDenumire("ASDASD");
        System.out.println(autoritatePescuitLazy.toString());





    }
}
