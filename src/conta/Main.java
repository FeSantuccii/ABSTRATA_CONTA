package conta;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaCorrente(1000.0, 500.0);
        ContaBancaria contaPoupanca = new ContaPoupanca(1000.0); //valores das contas

        //Teste contacorrente
        System.out.println("Operações Conta Corrente:");
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(1200.0);
        contaCorrente.depositar(500.0);

        //Testecontapoupanca
        System.out.println("\nOperações Conta Poupança:");
        contaPoupanca.consultarSaldo();
        contaPoupanca.sacar(1100.0);  //Vai falhar, não tem 1100 reais
        contaPoupanca.depositar(300.0);
    }
}