package VIEW;

import DAO.ControleBairroDAO;
import DTO.ControleBairroDTO;

public class ControleFuncionario {

    public static void main(String[] args) {
        ControleBairroDAO objbairrodao = new ControleBairroDAO();
        ControleBairroDTO objbairrodto = new ControleBairroDTO();
        
        objbairrodto.setIdbairro("13");

        objbairrodao.excluirBairro(objbairrodto);

    }
    
}
