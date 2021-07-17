package asrad.demo.bean;

public class DocenteClase {
    private String nombtrabajador;
    private String ap_paterno;
    private String ap_materno;
    private int idclase;
    private String dia;
    private String turno;
    private String aula;
    private String tipo;
    private int horaini;
    private int horafin;
    private String seccion;
    private int ciclo;
    private int creditos;
    private String escuela;
    private String malla;
    private String tipocurso;

    public DocenteClase(String nombtrabajador, String ap_paterno, String ap_materno, int idclase, String dia, String turno, String aula, String tipo, int horaini, int horafin, String seccion, int ciclo, int creditos, String escuela, String malla, String tipocurso) {
        this.nombtrabajador = nombtrabajador;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.idclase = idclase;
        this.dia = dia;
        this.turno = turno;
        this.aula = aula;
        this.tipo = tipo;
        this.horaini = horaini;
        this.horafin = horafin;
        this.seccion = seccion;
        this.ciclo = ciclo;
        this.creditos = creditos;
        this.escuela = escuela;
        this.malla = malla;
        this.tipocurso = tipocurso;
    }

    public String getNombtrabajador() {
        return nombtrabajador;
    }

    public void setNombtrabajador(String nombtrabajador) {
        this.nombtrabajador = nombtrabajador;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public int getIdclase() {
        return idclase;
    }

    public void setIdclase(int idclase) {
        this.idclase = idclase;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getMalla() {
        return malla;
    }

    public void setMalla(String malla) {
        this.malla = malla;
    }

    public String getTipocurso() {
        return tipocurso;
    }

    public void setTipocurso(String tipocurso) {
        this.tipocurso = tipocurso;
    }
}
