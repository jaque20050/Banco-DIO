
public class Main {
	
	public static void main(String[] args) {
		
		Cliente Jaqueline = new Cliente();
		Jaqueline.setNome("Jaqueline");
		
		Conta cc = new ContaCorrente(Jaqueline);
		Conta poupanca = new ContaPoupanca(Jaqueline);
		Conta inv = new Investimentos(Jaqueline);

		cc.depositar(1000);
		cc.transferir(200, poupanca);
		inv.investir(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		inv.imprimirExtrato();
	}
}
