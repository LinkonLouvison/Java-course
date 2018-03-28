package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

public class TestedaConta {

	public static void main(String[] args){

	    // instancio um objeto c1 do tipo conta
	    Conta c1 = new Conta("Hugo", "04/06/2015");

	    //c1.setTitular("Hugo");
	    c1.setAgencia("45678-9");
	    c1.setSaldo(50.0);
	    c1.setNumeroConta(123456);
	  //  c1.setDataAbertura("04/06/2015");
	    c1.deposita(100.0);
	    System.out.println("saldo	antes do rendimento:"	+	c1.getSaldo());
	    System.out.println("rendimento	mensal:"	+	c1.calculaRendimento());

	    System.out.println("todas as informações da conta:\n" +c1.recuperarDadosparaImpressao());


	//Comparando duas contas com os mesmos atributos
	Conta	c2	=	new	Conta("Danilo");
	        c2.setSaldo(100);
	        Conta	c3	=	new	Conta();
	        c3.setTitular("Danilo");
	        c3.setSaldo(100);
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

	// mostrando o numero da instancia de cada objeto
	        System.out.println("numero da conta c1:\n" +c1.identificador);
	        System.out.println("numero da conta c2:\n" +c2.identificador);


	}

	  }
