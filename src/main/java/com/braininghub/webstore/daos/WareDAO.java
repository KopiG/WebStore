package com.braininghub.webstore.daos;

import com.braininghub.webstore.dtos.WareDTO;

import java.sql.*;

/**
 * Created by kopig on 2019. 05. 14..
 */
public class WareDAO {
    public static final String DBCONURL = "jdbc:mysql://localhost:3306/BHDB";
    //public static final String DBCONURL = "jdbc:mysql://localhost:3306/BHDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    // Singleton Lazy
    private static WareDAO db = null;

    private WareDAO() {
    }

    public static WareDAO getInstance() {
        if (db == null) {
            db = new WareDAO();
        }

        return db;
    }

    public boolean createWare(WareDTO wareDTO) {

        String sqlString = "INSERT INTO BHDB.ware(codekey,name,description,price) VALUES (?,?,?,?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try (
                Connection conn = DriverManager.getConnection(DBCONURL, USERNAME, PASSWORD);
                PreparedStatement ps = conn.prepareStatement(sqlString)){
            ps.setString(1, wareDTO.getCodeKey());
            ps.setString(2, wareDTO.getName());
            ps.setString(3, wareDTO.getDescription());
            ps.setInt(4, wareDTO.getPrice());
            ps.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return false;

    }

    public static void main(String[] args) {
        WareDAO dao = WareDAO.getInstance();
        System.out.println(dao.createWare(new WareDTO("TEST", "Test",
                "A test", 10)));
    }
}
