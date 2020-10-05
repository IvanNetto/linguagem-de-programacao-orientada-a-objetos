public class ContaCorrente {
	
	// Valor de saldo sendo definido. Somente ContaCorrente pode manipular seu próprio valor de saldo, por isso deve ser declarado o atributo como private
	private double saldo = 500.00;		
	
	// Permite que o atributo privado, saldo, de ContaCorrente seja acessado fora da class
	public double getSaldo() {
		return saldo;
	}

	// Permite que o atributo privado, saldo, de ContaCorrente seja alterado fora da classe
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
}



