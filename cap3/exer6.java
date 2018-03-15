/*
Imprima	 os	 primeiros	 números	 da	 série	 de	 Fibonacci	 até	 passar	 de	 100.	 A	 série	 de
Fibonacci	é	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc...	Para	calculá-la,	o	primeiro	elemento	vale	0,	o
segundo	vale	1,	daí	por	diante,	o	n-ésimo	elemento	vale	o	 (n-1)-ésimo	elemento	somado	ao	 (n-2)-
ésimo	elemento	(ex:	8	=	5	+	3).
*/

public class exer6{

  public static void main(String[] args){

    long e1=0;
    long e2=1;
    // imprimindo os dois primeiros termos
    System.out.println("1  "+ e1);
    System.out.println("2  "+ e2);

    for(long i=3;i<=100; i++){
      long aux = e1;
      System.out.print(i);
      System.out.println("  "+ (e1+e2));

      e1 = e2;
      e2 = aux + e2;
    }
  }

// usando long estamos estourando a memoria antes de chegar no 100 elemento
}
