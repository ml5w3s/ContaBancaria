package DAO;

import DTO.BairroDTO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class BairroDAO {
    
    private final Connection conn;
    
    public BairroDAO(){
        conn = new ConexaoDAO().conectarDAO();
    }
    
    public void cadastrarBairro(BairroDTO objbairrodto){
        String sql = "INSERT INTO bairro (nome_bairro) VALUES (?)";
        try (PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1,objbairrodto.getNome());
            pstm.executeUpdate();
            if(pstm != null){
                pstm.close();
            }
        }catch(SQLException e){
                e.printStackTrace();
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    public void atualizarBairro(BairroDTO objbairrodto){
        String sql = "UPDATE bairro SET nome_bairro = ? WHERE id_bairro = ?";
        try (PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1,objbairrodto.getNome());
            pstm.executeUpdate();
            if (pstm != null){
                pstm.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if (conn != null);
                conn.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        
    }

    public void excluirBairro(BairroDTO objbairrodto){
        String sql = "DELET FROM bairro WHERE id_bairro = ?";
        try (PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setInt(1,objbairrodto.getId());
            pstm.executeUpdate();
            if (pstm != null){
                pstm.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if (conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }
}
