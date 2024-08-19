package VIEW;

import DAO.BairroDAO;

public class VerificacaoViews {

    public static void main(String[] args) {
        BairroDAO objbairrodao = new BairroDAO();

        objbairrodao.pesquisarBairroId("Cruzeiro");

    }
    
}
