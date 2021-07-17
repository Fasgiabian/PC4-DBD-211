package asrad.demo.bean;

public class Asigna {
    private String anio;
    private String codadministrativo;
    private String coddocente;
    private int idclase;

    public Asigna(String anio, String codadministrativo, String coddocente, int idclase) {
        this.anio = anio;
        this.codadministrativo = codadministrativo;
        this.coddocente = coddocente;
        this.idclase = idclase;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCodadministrativo() {
        return codadministrativo;
    }

    public void setCodadministrativo(String codadministrativo) {
        this.codadministrativo = codadministrativo;
    }

    public String getCoddocente() {
        return coddocente;
    }

    public void setCoddocente(String coddocente) {
        this.coddocente = coddocente;
    }

    public int getIdclase() {
        return idclase;
    }

    public void setIdclase(int idclase) {
        this.idclase = idclase;
    }
}

