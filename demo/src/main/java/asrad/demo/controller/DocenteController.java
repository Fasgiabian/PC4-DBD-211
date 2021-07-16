package asrad.demo.controller;

import asrad.demo.bean.Docente;
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
    @GetMapping("/DocenteCtr")
    public ArrayList<Docente> getDocente() throws Exception{
        ArrayList<Docente> D = new ArrayList<>();
        Connection con = template.getDataSource().getConnection();
        Statement st = con.createStatement();
        String sql = "select * from docente where codtipodocente = 2";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            D.add(new Docente(rs.getString(1),rs.getInt(2),
                    rs.getInt(3),rs.getInt(4),rs.getString(5)));
        }
        rs.close();
        st.close();
        con.close();
        return D;
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
