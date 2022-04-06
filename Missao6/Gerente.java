package Missao6;

public class Gerente extends Funcionario implements ValidaSenha {

	//atributos exclusivos do gerente
	private int Senha_Ger;
	private String Area_Ger;

	public boolean valida(int senha) {
		if ( this.Senha_Ger == senha)
				return true;
		else 
			return false;
	}
	
	// metodos set (SETTERS)
	
	
	
	public void setSenha_Ger(int Senha)
	{
		this.Senha_Ger = Senha;
	}
	public void setArea_Ger(String Area)
	{
		this.Area_Ger = Area;
	}
	//metodos gets (GETTERS)
	public int getSenha_Ger(String Area)
	{
		return this.Senha_Ger;
	}
	public String getArea_Ger()
	{
			return this.Area_Ger;
		}
	//outros metodos
	public boolean ValidaSenha(int Senha)
	{
		if (this.Senha_Ger == Senha)
			return true;
		else 
			return false;
		
		
		
	}	
}

