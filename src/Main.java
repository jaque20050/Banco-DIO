
public class Main {
	
	public static void main(String[] args) {
		
		Cliente Jaqueline = new Cliente();
		Jaqueline.setNome("jaqueline");
		
		Conta cc = new ContaCorrente(Jaqueline);
		Conta poupanca = new ContaPoupanca(Jaqueline);

		cc.depositar(1000);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
