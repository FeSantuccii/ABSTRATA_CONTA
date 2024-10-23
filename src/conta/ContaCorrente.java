package conta;

public class ContaCorrente extends ContaBancaria { //herança com os respectivos rivates
    private double limite;
    private static final double TAXA_SAQUE = 2.00;
    private static final double TAXA_DEPOSITO = 1.00;
    private static final double TAXA_CONSULTA = 0.50;//privates fixos

    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {//taxa de saque
        double valorComTaxa = valor + TAXA_SAQUE;
        if (saldo + limite >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque realizado com sucesso. Taxa: " + TAXA_SAQUE + ". Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente e limite excedido.");
        }
    }

    @Override
    public void depositar(double valor) {//calculo com taxa de deposito
        saldo += (valor - TAXA_DEPOSITO);
        System.out.println("Depósito realizado com sucesso. Taxa: " + TAXA_DEPOSITO + ". Novo saldo: " + saldo);
    }

    @Override
    public void consultarSaldo() {//calculo com taxa de consulta
        saldo -= TAXA_CONSULTA;
        System.out.println("Saldo atual: " + saldo + ". Taxa de consulta: " + TAXA_CONSULTA);
    }
}