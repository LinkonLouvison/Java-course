/*
Imprima	a	seguinte	tabela,	usando		for	s	encadeados:
1
2	4
3	6	9
4	8	12	16
n	n*2	n*3	....	n*n

*/
import java.util.Scanner;

public class exer8{

  public static void main(String[] args){

    Scanner dados = new Scanner(System.in);
    System.out.println("digite o x");
    int x= dados.nextInt();

    for(int j=1;j<=x;j++){
      System.out.println("");
      for(int i=1;i<=j;i++){
        System.out.print(i*j);
        System.out.print("  ");
      }
    }

  }
}
