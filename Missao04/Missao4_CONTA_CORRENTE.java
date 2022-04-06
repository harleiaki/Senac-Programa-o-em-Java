package Missao04;

public class Missao4_CONTA_CORRENTE {
	
	//Lista
	private String Nome_Cliente;
	private String Num_Conta_CC;
	private double Saldo_Conta_CC;
	private double Limite_Conta_CC;

	//metodo
	void sacar(double valor)
	{
		if ( valor > this.Saldo_Conta_CC + this.Limite_Conta_CC)
		{
			System.out.println("O valor do saque excede o valor disponivel na conta");
		}
		else
		{
			this.Saldo_Conta_CC = this.Saldo_Conta_CC - valor;
			System.out.println("Um Saque foi realizado no valor de R$" + valor);
		}
	}
	void depositar (double valor)
	{
		this.Saldo_Conta_CC = this.Saldo_Conta_CC + valor;
		System.out.println("Um deposito foi realizado no valor de R$: " + valor);
		//aqui vai o código que realiza o deposito na conta corrente
	}
}
