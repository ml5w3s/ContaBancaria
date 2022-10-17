package contasbancarias;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Conta {

    String clienteConta, valorDeclarado, numConta;
    double saldoConta, valorDeposito;
    List<Double> depositos = new ArrayList<>();   
    String dataMovimento = DateFormat.getDateInstance().format(new Date());

    public Conta() {
        saldoConta = 1000;
        depositos.add(saldoConta);
    }
    public void identificaCliente() {
        clienteConta = JOptionPane.showInputDialog("Nome do cliente ");
        numConta = JOptionPane.showInputDialog("Numero da conta ");
    }
    public void consultarConta() {
        Iterator<Double> itr = depositos.iterator();
        while (itr.hasNext()) {
            saldoConta+=itr.next();
            System.out.println(saldoConta);
        }
    }
    public void depositarConta() {
        valorDeclarado = JOptionPane.showInputDialog("Valor do Deposito ");
        valorDeposito = Double.parseDouble(valorDeclarado);
        depositos.add(valorDeposito);
        saldoConta += valorDeposito;
    }
    public void investimentoConta() {
        valorDeclarado = JOptionPane.showInputDialog("Valor do Deposito ");
        valorDeposito = Double.parseDouble(valorDeclarado);
        depositos.add(valorDeposito);
        saldoConta += valorDeposito + (valorDeposito * 0.10);
    }
    public void arrayDeposito() {
        valorDeclarado = JOptionPane.showInputDialog("Valor do Deposito ");
        valorDeposito = Double.parseDouble(valorDeclarado);
        depositos.add(valorDeposito);
        System.out.println(depositos);
        saldoConta += valorDeposito;
    }
    public void consultarExtrato() {
        Iterator<Double> itr = depositos.iterator();
        while (itr.hasNext()) {
            System.out.println(dataMovimento);            
            System.out.println(itr.next());
        }
    }
}
