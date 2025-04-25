package SingletonRegistry;

public class Autorizatie {
    private String detinator;
    private int nrAutorizatiei;
    private String data;

     Autorizatie(String detinator, int nrAutorizatiei, String data) {
        this.detinator = detinator;
        this.nrAutorizatiei = nrAutorizatiei;
        this.data = data;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autorizatie{");
        sb.append("detinator='").append(detinator).append('\'');
        sb.append(", nrAutorizatiei=").append(nrAutorizatiei);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

