package DAO;

import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import DTO.ControleBairroDTO;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ControleBairroDAO {
    
    ResultSet rs;
    Connection conn;
    PreparedStatement pstm;
    ArrayList<ControleBairroDTO> listabairro;

    public ControleBairroDAO() {
        this.listabairro = new ArrayList<>();
    }
    
    public void atualizarBairro(ControleBairroDTO objbairrodto) {
        String sql = "UPDATE bairro SET nome_bairro = ? WHERE id_bairro = ?";
        conn = new ControleConexaoDAO().conectarDados();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objbairrodto.getNomebairro());
            pstm.setString(2, objbairrodto.getIdbairro()); 
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Bairro atualizado ");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    public void cadastrarBairro(ControleBairroDTO objbairrodto){
        String sql = "INSERT INTO bairro(nome_bairro)VALUES(?)";
        conn = new ControleConexaoDAO().conectarDados();
        try{
            pstm=conn.prepareStatement(sql);
            pstm.setString(1, objbairrodto.getNomebairro());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Bairro cadastrado ");
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Bairro não cadastrado "+erro);
        }
    }

    public void excluirBairro(ControleBairroDTO objbairrodto){
        String sql = "DELETE FROM bairro WHERE id_bairro=?";
        conn = new ControleConexaoDAO().conectarDados();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objbairrodto.getIdbairro());
            int rowsDeleted = pstm.executeUpdate();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Bairro excluido ");
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }
    
    public List pesquisarBairro(){
        try{
            conn = new ControleConexaoDAO().conectarDados();
            String sql= "SELECT * FROM bairro";   
            pstm = conn.prepareStatement (sql);
            rs = pstm.executeQuery();

            while(rs.next()){
                ControleBairroDTO objbairrodto = new ControleBairroDTO();
                objbairrodto.setIdbairro(rs.getString("id_bairro"));
                objbairrodto.setNomebairro(rs.getString("nome_bairro"));
                listabairro.add(objbairrodto);
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "BairroDAO Pesquisar: " + erro);
        }
        return listabairro;
    }
}
