
public class Main {
	
	public static void main(String[] args) {
		
		Cliente Jaqueline = new Cliente();
		Jaqueline.setNome("Jaqueline");
		
		Conta cc = new ContaCorrente(Jaqueline);
		Conta poupanca = new ContaPoupanca(Jaqueline);
		Conta inv = new Investimentos(Jaqueline);

		cc.depositar(1000);
		cc.transferir(200, poupanca);
		
		double valor = 1000;
		double percentual = 15.0 / 100;
		double valor_final = valor + (percentual * valor);
		
		inv.investir(valor_final);
		
		/*double valor = 200;
		double percentual = 15.0 / 100;
		double valor_final = valor + (percentual * valor);
		
		System.out.println("Valor Investido é: " + valor_final);
		
		System.exit(0);*/
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		inv.imprimirExtrato();
	}
}
