package conta;

public class ContaPoupanca extends ContaBancaria { //Herança da Conta bancaria, com os privates
    private static final double TAXA_SAQUE = 1.50;
    private static final double TAXA_DEPOSITO = 0.50;
    private static final double TAXA_CONSULTA = 0.25; //ja definidos, porque taxas são fixas


    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override //override para evitar erros no polimorfismo
    public void sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque realizado com sucesso. Taxa: " + TAXA_SAQUE + ". Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    @Override
    public void depositar(double valor) { //deposito com taxa
        saldo += (valor - TAXA_DEPOSITO);
        System.out.println("Depósito realizado com sucesso. Taxa: " + TAXA_DEPOSITO + ". Novo saldo: " + saldo);
    }

    @Override
    public void consultarSaldo() { //taxa consulta
        saldo -= TAXA_CONSULTA;
        System.out.println("Saldo atual: " + saldo + ". Taxa de consulta: " + TAXA_CONSULTA);
    }
}
