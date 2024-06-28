package VIEW;

import DAO.ControleBairroDAO;
import DTO.ControleBairroDTO;

public class BancoVersatil {

    public static void main(String[] args) {
        
        ControleBairroDTO objbairrodto = new ControleBairroDTO();
        ControleBairroDAO objbairrodao = new ControleBairroDAO();
        
        objbairrodto.setNome("Sobradinho");
        objbairrodao.cadastrarBairro(objbairrodto);
   
    }
    
}
