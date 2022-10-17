package contasbancarias;

import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {
    
    @Override
    public void consultarConta(){
        Iterator<Double> itr=depositos.iterator();
        while(itr.hasNext()){
            saldoConta+=itr.next();            
            System.out.println(itr.next());
        }
    }
    @Override
    public void depositarConta(){
        valorDeclarado=JOptionPane.showInputDialog("Valor do Deposito ");
        valorDeposito=Double.parseDouble(valorDeclarado);
        depositos.add(saldoConta); 
        saldoConta+=valorDeposito;
    }
    @Override   
    public void arrayDeposito(){
        valorDeclarado=JOptionPane.showInputDialog("Valor do Deposito ");
        valorDeposito=Double.parseDouble(valorDeclarado);
        depositos.add(valorDeposito);
        System.out.println(depositos);
        saldoConta+=valorDeposito;
        }
    @Override  
    public void consultarExtrato(){
        Iterator<Double>itr=depositos.iterator();
        while(itr.hasNext()){
            System.out.println(dataMovimento);
            System.out.println(itr.next());
        }
    }
}