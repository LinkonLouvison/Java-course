/**
 * Classe responsavel por moldar as contas do banco
 * 
 * 
 * @author Linkon Louvison
 */

package br.com.caelum.contas.modelo;


public class Conta{
	  //Atributos visiveis para todos da classe
	   private String titular;
	   private int numero_conta;
	   private String agencia;
	   private double saldo;
	   private String dataDeAbertura;
	   private static int  numContas=0;
	   public int identificador=0;


	// criando alguns  construtores

	public Conta(){

	this.numContas +=1;
	identificador = numContas;
	}

	public Conta(String titular){
	  this.titular = titular;

	  this.numContas +=1;
	  identificador = numContas;
	}

	public Conta(String titular, String dataDeAbertura){
	  this(titular); // chama o construtor que foi declarado acima
	  this.dataDeAbertura = dataDeAbertura;

	}

	  // Getters and Setters


	  public String getTitular(){
	    return this.titular;
	  }

	  public String getAgencia(){
	    return this.agencia;
	  }

	  public int getNumeroConta(){
	    return this.numero_conta;
	  }

	  public double getSaldo(){
	    return this.saldo;
	  }

	  public String getDataAbertura(){
	    return this.dataDeAbertura;
	  }


	  public void setTitular(String titular){
	    this.titular = titular;
	  }

	  public void setAgencia(String agencia){
	    this.agencia = agencia;
	  }


	  public void setNumeroConta(int numero_conta){
	    this.numero_conta = numero_conta;
	  }

	  public void setSaldo(double saldo){
	    this.saldo = saldo;
	  }

	  public void setDataAbertura(String dataDeAbertura){
	    this.dataDeAbertura = dataDeAbertura;
	  }






	  //Metodos da classe Conta

	public  void saca( double valor){
	    this.saldo = saldo -valor;
	  }

	  public void deposita(double valor){
	    this.saldo +=valor;

	      }


	public   double calculaRendimento(){
	    saldo *= 1.1;

	    return saldo;
	  }

	public  String recuperarDadosparaImpressao(){
	    String dados;
	    dados = "titular da conta: ".concat(titular +"\n");
	    dados = dados.concat("Agencia: "+ agencia + "\n");
	    dados = dados.concat("Numero da Conta: "+ numero_conta + "\n");
	    dados = dados.concat("Data Abertura: "+ dataDeAbertura + "\n");
	    dados = dados.concat("Saldo: "+ saldo + "\n");

	    return dados;

	  }





	}
