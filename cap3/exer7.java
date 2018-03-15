/*
Escreva	 um	 programa	 que,	 dada	 uma	 variável	 	x		 com	 algum	 valor	 inteiro,	 temos	 um
novo		x		de	acordo	com	a	seguinte	regra:
se		x		é	par,		x	=	x	/	2
se		x		é	impar,		x	=	3	*	x	+	1
imprime		x
*/


import java.util.Scanner;

public class exer7{

  public static void main(String[] args){
    Scanner dados = new Scanner(System.in);
    System.out.println("digite a entrada");
    int entrada= dados.nextInt();
    System.out.print(entrada);

    while(entrada>1){
      if(entrada%2==0){
        entrada = entrada/2;
        System.out.print(" -> "+ entrada);
      }
      else{
        entrada = entrada*3 + 1;
        System.out.print(" -> "+ entrada);
      }
    }

  }
}
