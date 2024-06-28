package DAO;

import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import DTO.ControleBairroDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ControleBairroDAO {
    
    Connection conn;
    ArrayList<ControleBairroDTO> listabairro;
    
    public ControleBairroDAO() {
        this.listabairro = new ArrayList<>();
    }
    
    public void atualizarBairro(ControleBairroDTO objbairrodto){
        conn = new ControleConexaoDAO().conectarDadosDAO();
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

    public void cadastrarBairro(ControleBairroDTO objbairrodto){
        conn = new ControleConexaoDAO().conectarDadosDAO();
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
    
    public void excluirBairro(ControleBairroDTO objbairrodto){
        conn = new ControleConexaoDAO().conectarDadosDAO();
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
    
    public List pesquisarBairro(){
        ResultSet rs;
        conn = new ControleConexaoDAO().conectarDadosDAO();
        String sql= "SELECT * FROM bairro";
        
        try(PreparedStatement pstm = conn.prepareStatement(sql)){
            rs = pstm.executeQuery();

            while(rs.next()){
                ControleBairroDTO objbairrodto = new ControleBairroDTO();
                objbairrodto.setId(rs.getInt("id_bairro"));
                objbairrodto.setNome(rs.getString("nome_bairro"));
                listabairro.add(objbairrodto);
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "BairroDAO Pesquisar" + erro.getMessage());
        }
        return listabairro;
    }
}
