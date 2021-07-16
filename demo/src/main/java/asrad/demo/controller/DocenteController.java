package asrad.demo.controller;

import asrad.demo.bean.Docente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
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
}
