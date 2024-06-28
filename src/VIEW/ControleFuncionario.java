package VIEW;

import DAO.ControleBairroDAO;
import DTO.ControleBairroDTO;

public class ControleFuncionario {

    public static void main(String[] args) {
        ControleBairroDAO objbairrodao = new ControleBairroDAO();
        ControleBairroDTO objbairrodto = new ControleBairroDTO();
        
        objbairrodto.setId(15);

        objbairrodao.excluirBairro(objbairrodto);

    }
    
}
