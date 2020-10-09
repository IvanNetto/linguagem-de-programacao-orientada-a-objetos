
public class OperacaoBancaria {
	 		
	private double valorDeSaque = 200;	

	// Cria um objeto de ContaCorrente. Nesse momento a classe ContaCorrente passa a existir de forma materializada em um objeto. 
	ContaCorrente conta = new ContaCorrente();	
	// Cria uma c�pia de saldo para ser manipulado sob o escopo p�blico nessa classe. Tudo o que alterar essa vari�vel, n�o altera o saldo da classe ContaCorrente
	double saldo = conta.getSaldo();
	
	//M�todo construtor. Toda vez que a classe for instanciada, esse m�todo ser�, por padr�o, executado
	OperacaoBancaria(){
		
		// Quando a leitura sistem�tica computacional executar a linha 15, o fluxo ser� direcionado para o m�todo permitirSaque()
		if (!permitirSaque(valorDeSaque)) {
			System.out.println("Saque negado!");
			return;
		}
		// Quando a leitura sistem�tica computacional executar a linha 19, o fluxo ser� direcionado para o m�todo descontarSaqueDoSaldo()
		descontarSaqueDoSaldo(valorDeSaque);
		System.out.println("Saque de " + valorDeSaque + " realizado com sucesso! Valor do saldo: " + saldo);
		
	}	
		
	// Retorna false se n�o permitir o saque e true se o saque for permitido
	private Boolean permitirSaque(double valorDeSaque) {		
		
		if (valorDeSaque > saldo) {		
			return false;		
		}
		
		return true;
		
	}
	
	// Manipula a c�pia local do saldo e altera o valor original do saldo de ContaCorrente  
	private double descontarSaqueDoSaldo(double valorDeSaque) {
							
		this.saldo = this.saldo - valorDeSaque;  
		conta.setSaldo(this.saldo);		
		return this.saldo;
			
	}
	
	// Permite que o atributo privado, valorDeSaque, de OperacaoBancaria seja acessado fora da classe
	public double getValorDeSaque() {
		return valorDeSaque;
	}

    // Permite que o atributo privado, valorDeSaque, de OperacaoBancaria seja alterado fora da classe
	public void setValorDeSaque(double valorDeSaque) {
		this.valorDeSaque = valorDeSaque;
	}
	
}
