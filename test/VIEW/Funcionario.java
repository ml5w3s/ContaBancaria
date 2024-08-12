package VIEW;

import DAO.BairroDAO;
import DTO.BairroDTO;

public class Funcionario {

    public static void main(String[] args) {
        BairroDAO objbairrodao = new BairroDAO();
        BairroDTO objbairrodto = new BairroDTO();
        
        objbairrodto.setId(15);

        objbairrodao.excluirBairro(objbairrodto);

    }
    
}
