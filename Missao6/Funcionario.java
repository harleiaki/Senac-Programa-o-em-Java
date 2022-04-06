package Missao6;

public class Funcionario{
	String Nome_Func;
	double Salario_Func;
	String CPF_Func;
	
	public double BonificacaoAnual()
	{
		double Salario_Com_Bonificacao = getSalario_Func() + getSalario_Func()*0.15;
		return Salario_Com_Bonificacao;
	}
	
	
	public String getNome_Func() {
		return Nome_Func;
	}
	public void setNome_Func(String Nome) 
	{
		this.Nome_Func = Nome;
	}
	public double getSalario_Func() {
		return Salario_Func;
	}
	public void setSalario_Func(double valor_salario) {
		this.Salario_Func = valor_salario;
	}
	public String getCPF_Func() {
		return CPF_Func;
	}
	public void setCPF_Func(String CPF) {
		this.CPF_Func = CPF;
	}
}
