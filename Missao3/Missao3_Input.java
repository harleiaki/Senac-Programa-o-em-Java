package Missao3;
/*
 * Harlei Akira Ohta
 * Data: 05/04/2022
 */

import java.util.Scanner; //import class Scanner

public class Missao3_Input {
	
	
	public static void main(String[] args) {//inicio do princi
		
		Scanner entrada = new Scanner(System.in); // criando o obj entrada class Scanner
		
		System.out.println("Digite uma frase: "); // mostra a mensage 1
		String Texto = entrada.nextLine();  // lendo um frase
		
		System.out.println("Digite um num inteiro"); // mostra mensag 2
		int N_int = entrada.nextInt(); // lendo num int
		
		System.out.println("Digite um num real: "); // mostra mensag 3
		double N_double = entrada.nextDouble();  // lendo um num letra ou palavra
		
		System.out.println("Digite uma Letra ou palavra: "); // mostra mensag 4
		String Palavra = entrada.next(); //Lendo letra ou palavra
		
		//mostrando os resultados
		System.out.println("A frase digitada foi: " + Texto);
		System.out.println("O num inteiro digitado foi: " + N_int);
		System.out.println("O num real foi: " + N_double);
		System.out.println("A letra ou palavra digitada foi: " + Palavra);
		
		//fechando o obj entrada
		entrada.close();
	}//fim metodo princi

} // fim da class
