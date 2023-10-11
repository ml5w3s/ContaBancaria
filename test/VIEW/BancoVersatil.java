package VIEW;

import DAO.BairroDAO;
import DTO.BairroDTO;

public class BancoVersatil {

    public static void main(String[] args) {
        
        BairroDTO objbairrodto = new BairroDTO();
        BairroDAO objbairrodao = new BairroDAO();
        
        objbairrodto.setNome("Sobradinho");
        objbairrodao.cadastrarBairro(objbairrodto);
   
    }
    
}
