package DAO;

import DTO.BairroDTO;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class BairroDAOTest {
    
    Connection conn;
    ArrayList<BairroDTO> listabairro;
    
    public BairroDAOTest() {
        this.listabairro = new ArrayList<>();
    }
    
    public void atualizarBairro(BairroDTO objbairrodto){
        String sql = "UPDATE bairro SET nome_bairro = ? WHERE id_bairro = ?";
        conn = new ConexaoDAO().conectarDadosDAO();
        
        try (PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1, objbairrodto.getNome());
            pstm.setInt(2, objbairrodto.getId());
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

    public void cadastrarBairro(BairroDTO objbairrodto){
        conn = new ConexaoDAO().conectarDadosDAO();
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
    
    public void excluirBairro(BairroDTO objbairrodto){
        conn = new ConexaoDAO().conectarDadosDAO();
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
    
    public List<BairroDTO> pesquisarBairro() {
        ResultSet rs;
        String sql = "SELECT * FROM bairro";
        conn = new ConexaoDAO().conectarDadosDAO();

        try (PreparedStatement pstm = conn.prepareStatement(sql)) {
            rs = pstm.executeQuery();

            while (rs.next()) {
                BairroDTO objbairrodto = new BairroDTO();
                objbairrodto.setId(rs.getInt("id_bairro"));
                objbairrodto.setNome(rs.getString("nome_bairro"));
                listabairro.add(objbairrodto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "BairroDAO Pesquisar: " + erro.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }
        return listabairro;
    }
}
