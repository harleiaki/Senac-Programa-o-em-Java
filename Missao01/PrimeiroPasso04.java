package Missao01;
public class PrimeiroPasso04 {
		public static void main(String[] args) {
			//apresenta o titulo da miss�o(etapa"a")
			System.out.println("MISS�O 1 - DESAFIO 4 - C�lculo da M�dia Bimestral.");
			System.out.println("Altera��o do Desafio 2");
			//declara as seis vari�veis inteiras ( etapa "b" da atividade)
			int Trab1B, Prova1B, Trab2B, Prova2B, Nota1B, Nota2B;
			double Media_Final;
			//atribui valor as vari�veis(Etapa "c" da atividade)
			//Avalia��es do Primeiro Bimestre
			Trab1B=15;
			Prova1B=51;
			//Avalia��es do Segundo Bimestre
			Trab2B=28;
			Prova2B=63;
			//Realiza o calculo da Nota do Primeiro Bimestre(Etapa"d" da ativ)
			Nota1B= Trab1B + Prova1B;
			//Realiza o calculo da Nota do Segundo Bimestre(Etapa "e" da ativ)
			Nota2B = Trab2B + Prova2B;
			//Calcula a m�dia final (Etapa "f" da ativ)
			Media_Final = (double)(Nota1B + Nota2B)/2;
			//Apresenta o resultado no console(Etapa "g" da ativ)
			System.out.println("M�dia do final do aluno �: " + Media_Final);
			//finaliza a ativ(Etapa "h" da ativ)
			System.out.println("Desafio 4 Concluido! = M�dia Calculada com cast!");
			System.out.println("Altera��o do Desafio 2");
		}
	}

