package Missao3;
/*
 * Harlei Akira Ohta
 * Data 06/04/2022
 */
import java.util.Scanner;
public class Calcular {
   public static void main(String[] args) {
      double num1;
      double num2;
      double resultado;
      char  operacao;
      Scanner num = new Scanner(System.in);
      System.out.print("Envie dois numeros: ");
      num1 = num.nextDouble();
      num2 = num.nextDouble();
      System.out.print("\nOpera��o a realizar (+, -, *, /): ");
      operacao = num.next().charAt(0);
      switch(operacao) {
         case '+': resultado = num1 + num2;
            break;
         case '-': resultado = num1 - num2;
            break;
         case '*': resultado = num1 * num2;
            break;
         case '/': resultado = num1 / num2;
            break;
      default: System.out.printf("Erro opera��o n�o foi possivel!");
         return;
      }
      System.out.print("\nO resultado � :\n");
      System.out.printf(num1 + " " +  operacao + " " + num2 + " = " + resultado);
   }}