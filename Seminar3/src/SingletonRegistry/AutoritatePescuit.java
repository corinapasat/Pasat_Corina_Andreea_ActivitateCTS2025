package SingletonRegistry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuit {

    private String nume;
    private String website;
    private int nrAngajati;

    private static AutoritatePescuit instance;

    private static Map<String,Autorizatie> registry = new HashMap<>();



    private AutoritatePescuit(String nume, String website, int nrAngajati) {
        this.nume = nume;
        this.website = website;
        this.nrAngajati = nrAngajati;
    }

    public static AutoritatePescuit getInstance(){
        if(instance==null)
            instance = new AutoritatePescuit("Autoritate", "au.ro", 15);

        return instance;
    }

    public  Autorizatie  emiteAutorizatie(String nume){
        if(!registry.containsKey(nume)){
            registry.put(nume, new Autorizatie(nume,registry.size()+1,new Date().toString()));
        }
        return registry.get(nume);
    }
}
