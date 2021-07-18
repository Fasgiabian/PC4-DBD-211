package asrad.demo.controller;

import asrad.demo.bean.Asigna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Controller
public class AsignaController {
    @Autowired
    JdbcTemplate template;
    @RequestMapping("/agregarDocenteClase")
    public String agregarDocenteClase(@RequestParam String anio, @RequestParam String Codadministrativo,
                                      @RequestParam String Coddocente, @RequestParam int Idclase) throws Exception {
        Connection con = template.getDataSource().getConnection();
        String sql = "INSERT INTO ASIGNA VALUES (?,?,?,?);";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, anio);
        st.setString(2, Codadministrativo);
        st.setString(3, Coddocente);
        st.setInt(4, Idclase);
        st.executeUpdate();
        return "Reporte.html";
    };
}

