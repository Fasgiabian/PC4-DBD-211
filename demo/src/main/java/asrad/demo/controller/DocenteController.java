package asrad.demo.controller;

import asrad.demo.bean.Docente;
import asrad.demo.bean.DocenteClase;
import asrad.demo.bean.TrabajadorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@RestController
public class DocenteController {
    @Autowired
    JdbcTemplate template;
    @GetMapping("/DocenteClase")
    public ArrayList<DocenteClase> getDocenteClase() throws Exception{
        ArrayList<DocenteClase> DC = new ArrayList<>();
        Connection con = template.getDataSource().getConnection();
        Statement st = con.createStatement();
        String sql = "SELECT TR.NOMBTRABAJADOR, TR.AP_PATERNO, TR.AP_MATERNO, \n" +
                "        ASG.IDCLASE, DS.DIA, TU.TURNO, AU.AULA, TP.TIPO, CL.HORAINI, CL.HORAFIN, S.SECCION, CU.CICLO, \n" +
                "        CU.CREDITOS, E.ESCUELA, MA.MALLA, TC.TIPOCURSO FROM TRABAJADOR TR, DOCENTE D, ASIGNA ASG, \n" +
                "        CLASE CL, DIADESEMANA DS, AULA AU, TURNO TU, TIPOCLASE TP, SECCION S, CURSO CU, TIPOCURSO TC,\n" +
                "        ESCUELA E, MALLA MA WHERE TR.CODTRABAJADOR = D.CODDOCENTE\n" +
                "        AND D.CODDOCENTE = ASG.CODDOCENTE AND ASG.IDCLASE = CL.IDCLASE AND CL.CODDIA = DS.CODDIA AND \n" +
                "        CL.CODTURNO = TU.CODTURNO AND CL.CODAULA = AU.CODAULA AND CL.CODTIPOCLASE = TP.CODTIPOCLASE AND \n" +
                "        CL.IDSECCION = S.IDSECCION AND S.CODCURSO = CU.CODCURSO AND CU.CODESCUELA = E.CODESCUELA AND\n" +
                "        CU.CODTIPOCURSO =  TC.CODTIPOCURSO AND CU.CODMALLA = MA.CODMALLA ORDER BY TR.NOMBTRABAJADOR, TR.AP_PATERNO, TR.AP_MATERNO;";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            DC.add(new DocenteClase(rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),
                    rs.getString(8),rs.getInt(9),rs.getInt(10),rs.getString(11),
                    rs.getInt(12),rs.getInt(13),rs.getString(14),rs.getString(15),
                    rs.getString(16)));
        }
        rs.close();
        st.close();
        con.close();
        return DC;
    };
    @PostMapping("/TrabajadorNew")
    public String newTrab(@RequestBody TrabajadorRequest tr) throws Exception{
        Connection con = template.getDataSource().getConnection();
        String sql = "INSERT INTO Trabajador VALUES (?,?,?,?,?,?);";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1,tr.getCodtrabajador());
        st.setString(2,tr.getNombre());
        st.setString(3,tr.getAppat());
        st.setString(4,tr.getApmat());
        st.setString(5,tr.getContraseña());
        st.setInt(6,tr.getCodrol());
        int a = st.executeUpdate();
        st.close();
        con.close();
        return String.valueOf(a);
    };
}
