package DTO;

import BEANS.ClienteConta;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.DateFormat;
import java.time.LocalDate;

public class ContaBancaria extends ClienteConta {
    List<Double> relacaoDepositos = new ArrayList<>();   
    String dataMovimento = DateFormat.getDateInstance().format(new Date());

    /*public ContaBancaria() {
        saldoConta = 1000;
        relacaoDepositos.add(saldoConta);
    }*/    
}
