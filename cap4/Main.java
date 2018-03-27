class Main{

  public static void main(String[] args){

    // instancio um objeto c1 do tipo conta
    Conta c1 = new Conta();

    c1.titular	=	"Hugo";
    c1.agencia	=	"45678-9";
    c1.saldo	=	50.0;
    c1.numero_conta = 123456;
    c1.dataDeAbertura	=	"04/06/2015";
    c1.deposita(100.0);
    System.out.println("saldo	antes do rendimento:"	+	c1.saldo);
    System.out.println("rendimento	mensal:"	+	c1.calculaRendimento());

    System.out.println("todas as informações da conta:\n" +c1.recuperarDadosparaImpressao());



//Comparando duas contas com os mesmos atributos
Conta	c2	=	new	Conta();
        c2.titular	=	"Danilo";
        c2.saldo	=	100;
        Conta	c3	=	new	Conta();
        c3.titular	=	"Danilo";
        c3.saldo	=	100;
        if	(c2	==	c3)	{
                System.out.println("iguais");
        }	else	{
                System.out.println("diferentes");
        }


// agora o exemplo de baixo mostra quando as contas apontam para o mesmo lugar 

      Conta  c4 = c3;

        if(c4 == c3){
          System.out.println("iguais");
        } else {
          System.out.println("diferentes");
        }
}

  }
