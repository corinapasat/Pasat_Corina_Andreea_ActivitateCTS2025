package Clase;

public class AutoritatePescuitLazy {

    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatii;

    private static AutoritatePescuitLazy instance;

    private AutoritatePescuitLazy(String denumire, String website, int nrAngajati, int nrAutorizatii) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatii = nrAutorizatii;
    }

    public static synchronized AutoritatePescuitLazy getInstance(String website,String denumire, int nrAngajati, int nrAutorizatii){
        if(instance == null)
            instance = new AutoritatePescuitLazy(denumire,website,nrAngajati,nrAutorizatii);
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void  cresteAngajati(int numarAngajati){
        nrAngajati+= numarAngajati;
    }

    public void concediaza(int numarAngajati){
        nrAngajati-=numarAngajati;
    }

    public void emiteAutorizare(String nume){
        System.out.println("A fost emisa autorizarea pentru:" + nume);
        this.nrAutorizatii++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritatePescuitEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatii=").append(nrAutorizatii);
        sb.append('}');
        return sb.toString();
    }

}
