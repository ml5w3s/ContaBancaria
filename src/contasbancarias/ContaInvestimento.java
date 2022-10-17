package contasbancarias;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ContaInvestimento extends Conta {
    
    @Override
     public void consultarConta(){
        Iterator<Double>itr=depositos.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    @Override
    public void investimentoConta(){
        valorDeclarado=JOptionPane.showInputDialog("Valor do Deposito ");
        valorDeposito=Double.parseDouble(valorDeclarado);
        saldoConta+=valorDeposito+(valorDeposito*0.10);
    }
}
