package VIEW;

import DAO.ConexaoDAO;

public class VerificacaoConexao {

    public static void main(String[] args) {
        ConexaoDAO objconn = new ConexaoDAO();
        System.out.println(objconn.conectarDAO());
    }
    
}
