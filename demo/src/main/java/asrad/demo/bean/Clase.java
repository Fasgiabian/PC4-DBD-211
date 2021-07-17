package asrad.demo.bean;

public class Clase {
    private String codclase;
    private int horaini;
    private int horafin;

    public Clase(String codclase, int horaini, int horafin) {
        this.codclase = codclase;
        this.horaini = horaini;
        this.horafin = horafin;
    }

    public String getCodclase() {
        return codclase;
    }

    public void setCodclase(String codclase) {
        this.codclase = codclase;
    }

    public int getHoraini() {
        return horaini;
    }

    public void setHoraini(int horaini) {
        this.horaini = horaini;
    }

    public int getHorafin() {
        return horafin;
    }

    public void setHorafin(int horafin) {
        this.horafin = horafin;
    }
}
