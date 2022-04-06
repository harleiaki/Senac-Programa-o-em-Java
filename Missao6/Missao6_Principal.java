package Missao6;

public class Missao6_Principal {

	public static void main(String[] args) {
		
		
		Funcionario F1 = new Funcionario();
		F1.setNome_Func("LuiZ");
		F1.setCPF_Func("1234");
		F1.setSalario_Func(1000);
		
		Gerente G = new Gerente();		
		G.setNome_Func("Alberto");
		G.setCPF_Func("445588");
		G.setSalario_Func(1252.55);
		G.setSenha_Ger(888);
		G.setArea_Ger("CONTAB");
		
		//apresentando os dados no console
		System.out.println("DADOS DO GERENTE: ");
		System.out.println("Nome: " + G.getNome_Func());
		System.out.println("CPF: " + G.getCPF_Func());
		System.out.println("Salario: R$" + G.Salario_Func);
		System.out.println("Area = " + G.getArea_Ger());	
		
		
		System.out.println("Dados do Funcionario: ");
		System.out.println("Nome: " + F1.getNome_Func());
		System.out.println("CPF: " + F1.CPF_Func);
		System.out.println("Salario: R$" + F1.Salario_Func);
		
		double Bonif_F=F1.BonificacaoAnual();
		double Bonif_G=G.BonificacaoAnual();
	}

}
