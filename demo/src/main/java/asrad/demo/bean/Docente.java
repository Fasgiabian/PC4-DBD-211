package asrad.demo.bean;

public class Docente {
    private String coddocente;
    private String nombre;

    public Docente(String coddocente, String nombre) {
        this.coddocente = coddocente;
        this.nombre = nombre;
    }

    public String getCoddocente() {
        return coddocente;
    }

    public void setCoddocente(String coddocente) {
        this.coddocente = coddocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
