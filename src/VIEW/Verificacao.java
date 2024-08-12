package VIEW;

import DAO.BairroDAO;
import DTO.BairroDTO;
import java.util.Map;
import java.util.List;
import java.util.HashMap;


public class Verificacao {

    public static void main(String[] args) {
        BairroDAO objbairrodao = new BairroDAO();
        BairroDTO objbairrodto = new BairroDTO();
        Map<String, String> mapaidpornome = new HashMap<>();
        List<BairroDTO> lista = objbairrodao.pesquisarBairro();
        System.out.println("Bairros: "+lista.getFirst());
    }
    
}
