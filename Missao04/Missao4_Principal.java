package Missao04;

import java.util.Scanner;

/*
 * Harlei Akira Ohta
 * Data: 05/04/2022
 */

public class Missao4_Principal {
	public static void main(String[] args) {

		
		
		String Nome_Autor;
		String Data_Codigo;
		Nome_Autor = "Harlei Akira Ohta";
		Data_Codigo = "05/04/2022";
		String Msg_inicial = "In�cio da Miss�o4";
		System.out.println(Msg_inicial);
		String frase = "Este c�digo foi desenvolvido por: " + Nome_Autor + " em " + Data_Codigo + ".";
		System.out.println(frase);
		//FIM DA OP��O EXTRA
		//Etapa 1 a
		System.out.println("Harlei");
		System.out.println("verificando o comprimento da String");
		//b
		String Nome="Harlei";
		int tamanho = Nome.length();
		System.out.println("O tamanho da variavel Nome � " + tamanho);
		//c fim.
		//Etapa 2 a
		System.out.println("");
		System.out.println("Verificando se duas String s�o iguais(maneira1)");
		//b
		Scanner entrada = new Scanner (System.in) ;
		//c
		String Nome_Cadastrado="Harlei";
		String Nome_Digitado;
		System.out.println("Digite seu Nome: ");
		Nome_Digitado = entrada.next();
		if(Nome_Cadastrado.equals(Nome_Digitado))
			System.out.println("Os nomes s�o iguais");
		else
			System.out.println("Os nomes s�o diferentes");
		//Etapa 3 a
		System.out.println();
		System.out.println("Verificando se duas String s�o iguais(maneira2");
		//b
		System.out.println("Harlei");
		String Nome_Cadastrado1="Hao";
		String Nome_Cadastrado2="HAO";
		if(Nome_Cadastrado1.equalsIgnoreCase(Nome_Cadastrado2))
			System.out.println("Os nomes s�o iguais!");
		else
			System.out.println("Os nomes s�o diferentes!");
		//c fim
		//Etapa 4 a
		System.out.println("");
		System.out.println("Identificando um caracter nume determinada posi��o");
		//b
		System.out.println("");
		Nome = "Harlei";
		System.out.println("A primeira letra do nome �: " + Nome.charAt(0));
		for (int i = 0 ; i < Nome.length(); i++)
		{
			System.out.println(Nome.charAt(i));
		}
		
		
		
		
	entrada.close();//fim
	
}
	
}
