package DAO;

//import DTO.AgenciaDTO;
//import java.util.List;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.sql.Connection;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//import java.sql.PreparedStatement;

public class AgenciaDAO {
//    
//    Connection conn;
//    ArrayList<AgenciaDTO> listaagencia;
//    
//    public AgenciaDAO() {
//        this.listaagencia = new ArrayList<>();
//    }
//    
//    public void atualizarAgencia(AgenciaDTO objagenciadto){
//        conn = new ConexaoDAO().conectarDadosDAO();
//        String sql = "UPDATE agencia SET nome_agencia = ? WHERE id_agencia = ?";
//        
//        try (PreparedStatement pstm = conn.prepareStatement(sql)){
//            pstm.setString(1,objagenciadto.getNome());
//            pstm.executeUpdate();
//            if (pstm != null){
//                pstm.close();
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }finally{
//            try{
//                if (conn != null);
//                conn.close();
//            }catch(SQLException e){
//                JOptionPane.showMessageDialog(null,e.getMessage());
//            }
//        }
//        
//    }
//
//    public void cadastrarAgencia(AgenciaDTO objagenciadto){
//        conn = new ConexaoDAO().conectarDadosDAO();
//        String sql = "INSERT INTO agencia (nome_agencia) VALUES (?)";
//        
//        try (PreparedStatement pstm = conn.prepareStatement(sql)){
//            pstm.setString(1,objagenciadto.getNome());
//            pstm.executeUpdate();
//            if(pstm != null){
//                pstm.close();
//            }
//        }catch(SQLException e){
//                e.printStackTrace();
//        }finally{
//            try{
//                if(conn != null){
//                    conn.close();
//                }
//            }catch(SQLException e){
//                JOptionPane.showMessageDialog(null, e.getMessage());
//            }
//        }
//    }    
//    
//    public void excluirAgencia(AgenciaDTO objagenciadto){
//        conn = new ConexaoDAO().conectarDadosDAO();
//        String sql = "DELET FROM agencia WHERE id_agencia = ?";
//        
//        try (PreparedStatement pstm = conn.prepareStatement(sql)){
//            pstm.setInt(1,objagenciadto.getId());
//            pstm.executeUpdate();
//            if (pstm != null){
//                pstm.close();
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }finally{
//            try{
//                if (conn != null){
//                    conn.close();
//                }
//            }catch(SQLException e){
//                JOptionPane.showMessageDialog(null,e.getMessage());
//            }
//        }
//    }
//    
//    public List<AgenciaDTO> pesquisarAgencia() {
//        ResultSet rs;
//        conn = new ConexaoDAO().conectarDadosDAO();
//        String sql = "SELECT * FROM agencia";
//
//        try (PreparedStatement pstm = conn.prepareStatement(sql)) {
//            rs = pstm.executeQuery();
//
//            while (rs.next()) {
//                AgenciaDTO objagenciadto = new AgenciaDTO(); // Criação do novo objeto dentro do loop
//                objagenciadto.setId(rs.getInt("id_agencia"));
//                objagenciadto.setNome(rs.getString("nome_agencia"));
//                listaagencia.add(objagenciadto);
//                System.out.println("Agencia adicionado: " + objagenciadto.getNome()); // Depuração
//            }
//        } catch (SQLException erro) {
//            JOptionPane.showMessageDialog(null, "AgenciaDAO Pesquisar: " + erro.getMessage());
//        } finally {
//            // Fecha a conexão após o uso
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
//            }
//        }
//        return listaagencia;
//    }
}
