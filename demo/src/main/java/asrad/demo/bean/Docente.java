package asrad.demo.bean;

public class Docente {
    private String gradoinstruccion;
    private int codcargodocente;
    private int codtipodocente;
    private int codtipodedicacion;
    private String coddocente;

    public Docente(String gradoinstruccion, int codcargodocente, int codtipodocente, int codtipodedicacion, String coddocente) {
        this.gradoinstruccion = gradoinstruccion;
        this.codcargodocente = codcargodocente;
        this.codtipodocente = codtipodocente;
        this.codtipodedicacion = codtipodedicacion;
        this.coddocente = coddocente;
    }

    public String getGradoinstruccion() {
        return gradoinstruccion;
    }

    public void setGradoinstruccion(String gradoinstruccion) {
        this.gradoinstruccion = gradoinstruccion;
    }

    public int getCodcargodocente() {
        return codcargodocente;
    }

    public void setCodcargodocente(int codcargodocente) {
        this.codcargodocente = codcargodocente;
    }

    public int getCodtipodocente() {
        return codtipodocente;
    }

    public void setCodtipodocente(int codtipodocente) {
        this.codtipodocente = codtipodocente;
    }

    public int getCodtipodedicacion() {
        return codtipodedicacion;
    }

    public void setCodtipodedicacion(int codtipodedicacion) {
        this.codtipodedicacion = codtipodedicacion;
    }

    public String getCoddocente() {
        return coddocente;
    }

    public void setCoddocente(String coddocente) {
        this.coddocente = coddocente;
    }
}
