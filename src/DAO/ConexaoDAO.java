package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    private static final String HOST = "localhost";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public Connection conectarDAO(){
        
        Connection conn = null;
        
        try{
            String url = "jdbc:mysql://"+HOST+":3306/db_banco_versatil";
            conn = DriverManager.getConnection(url,USER, PASSWORD);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"e.getMenssage()");
        }
        return conn;
    }
}
