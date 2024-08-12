package DAO;

import DTO.BairroDTO;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class BairroDAO {
    
    Connection conn;
    ArrayList<BairroDTO> listabairro;
    
    public BairroDAO() {
        this.listabairro = new ArrayList<>();
    }
    
    public void atualizarBairro(BairroDTO objbairrodto){
        conn = new ConexaoDAO().conectarDadosDAO();
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
        conn = new ConexaoDAO().conectarDadosDAO();
        String sql = "SELECT * FROM bairro";

        try (PreparedStatement pstm = conn.prepareStatement(sql)) {
            rs = pstm.executeQuery();

            while (rs.next()) {
                BairroDTO objbairrodto = new BairroDTO(); // Criação do novo objeto dentro do loop
                objbairrodto.setId(rs.getInt("id_bairro"));
                objbairrodto.setNome(rs.getString("nome_bairro"));
                listabairro.add(objbairrodto);
                System.out.println("Bairro adicionado: " + objbairrodto.getNome()); // Depuração
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "BairroDAO Pesquisar: " + erro.getMessage());
        } finally {
            // Fecha a conexão após o uso
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
