
/*
 Faça	o	exercício	da	série	de	Fibonacci	usando	apenas	duas	variáveis
*/


public class exer9{

  public static void main(String[] args){
    int e1=0;
    int e2=1;
    int n =20;
    System.out.println(e1);
    System.out.println(e2);

    while(n>=1){
      System.out.println(e1+e2);
      e2 = e1+e2;
      e1 = e2 -e1;
      n--;
    }

  }
}
