package CTRL;

import BEANS.ClienteConta;
import java.time.LocalDate;

public class MovimentoConta extends ClienteConta{
        private double saldoConta, valorDeposito, valorSaque, valorRentabilidade;

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public double getValorRentabilidade() {
        return valorRentabilidade;
    }

    public void setValorRentabilidade(double valorRentabilidade) {
        this.valorRentabilidade = valorRentabilidade;
    }
}
