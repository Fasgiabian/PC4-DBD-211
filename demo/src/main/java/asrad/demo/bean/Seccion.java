package asrad.demo.bean;

public class Seccion {
    private int idSec;
    private String sec;

    public Seccion(int idSec, String sec) {
        this.idSec = idSec;
        this.sec = sec;
    }

    public int getIdSec() {
        return idSec;
    }

    public void setIdSec(int idSec) {
        this.idSec = idSec;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }
}
