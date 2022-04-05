package Missao01;
/*
 * Autor: Harlei Akira Ohta
 * DATA: 05/04/2022
 */
public class PrimeiroPasso02 {
	public static void main(String[] args) {	
		//apresenta o titulo da missão
		System.out.println("inicio da Missão 1");
		System.out.println("Autor: Harlei Akira Ohta");
		System.out.println("DATA: 05/04/2022");
		System.out.println("Nota do bimestre: ");
		//declara as variaveis
		int Nota_Trabalho;
		int Nota_Prova;
		int Note_Bimestre;
		//atribui valor as variáveis
		Nota_Trabalho = 22;
		Nota_Prova = 58;
		//Realiza a soma passo 3 da atividade.
		Note_Bimestre = Nota_Trabalho + Nota_Prova;
		//Apresenta o resultado da nota bimestral no console passo 4 da atividade.
		System.out.println("A nota Bimestre é :" + Note_Bimestre);
	}

}
