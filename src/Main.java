public class Main {

    public static void main(String[] args) {
        Cliente romario = new Cliente();
        romario.setNome("ROMARIO");
        
        Conta cc = new ContaCorrente(romario);
        Conta poupanca = new ContaPoupanca(romario);

        cc.depositar(250);
        cc.transferir(200, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
