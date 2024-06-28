package VIEW;

import DAO.ControleConexaoDAO;

public class VerificacaoClasses {

    public static void main(String[] args) {
        ControleConexaoDAO objconn = new ControleConexaoDAO();
        System.out.println(objconn.conectarDadosDAO());
    }
    
}
