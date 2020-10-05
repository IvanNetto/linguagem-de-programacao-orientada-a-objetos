
public class OperacaoBancaria {
	 		
	private double valorDeSaque = 200;	

	// Cria um objeto de ContaCorrente. Nesse momento a classe ContaCorrente passa a existir de forma materializada em um objeto. 
	ContaCorrente conta = new ContaCorrente();	
	// Cria uma cópia de saldo para ser manipulado sob o escopo público nessa classe. Tudo o que alterar essa variável, não altera o saldo da classe ContaCorrente
	double saldo = conta.getSaldo();
	
	//Método construtor. Toda vez que a classe for instanciada, esse método será, por padrão, executado
	OperacaoBancaria(){
		
		// Quando a leitura sistemática computacional executar a linha 15, o fluxo será direcionado para o método permitirSaque()
		if (!permitirSaque(valorDeSaque)) {
			System.out.println("Saque negado!");
			return;
		}
		// Quando a leitura sistemática computacional executar a linha 19, o fluxo será direcionado para o método descontarSaqueDoSaldo()
		descontarSaqueDoSaldo(valorDeSaque);
		System.out.println("Saque de " + valorDeSaque + " realizado com sucesso! Valor do saldo: " + saldo);
		
	}	
		
	// Retorna false se não permitir o saque e true se o saque for permitido
	private Boolean permitirSaque(double valorDeSaque) {		
		
		if (valorDeSaque > saldo) {		
			return false;		
		}
		
		return true;
		
	}
	
	// Manipula a cópia local do saldo e altera o valor original do saldo de ContaCorrente  
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
