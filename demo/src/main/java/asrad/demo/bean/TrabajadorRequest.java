package asrad.demo.bean;

public class TrabajadorRequest {
    private String codtrabajador;
    private String nombre;
    private String appat;
    private String apmat;
    private String contraseña;
    private int codrol;

    public TrabajadorRequest(String codtrabajador, String nombre, String appat, String apmat, String contraseña, int codrol) {
        this.codtrabajador = codtrabajador;
        this.nombre = nombre;
        this.appat = appat;
        this.apmat = apmat;
        this.contraseña = contraseña;
        this.codrol = codrol;
    }

    public String getCodtrabajador() {
        return codtrabajador;
    }

    public void setCodtrabajador(String codtrabajador) {
        this.codtrabajador = codtrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getCodrol() {
        return codrol;
    }

    public void setCodrol(int codrol) {
        this.codrol = codrol;
    }
}
