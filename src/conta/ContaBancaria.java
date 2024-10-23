package conta;

public abstract class ContaBancaria {//classe mãe, só com saldo
    protected double saldo;


    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    //abstratos
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void consultarSaldo();
}