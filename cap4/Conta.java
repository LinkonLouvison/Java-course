public class Conta{
  //Atributos visiveis para todos da classe
  String titular;
  int numero_conta;
  String agencia;
  double saldo;
  String dataDeAbertura;


  //Metodos da classe Conta

  void saca( double valor){
    this.saldo = saldo -valor;
  }

  void deposita(double valor){
    this.saldo +=valor;

      }


  double calculaRendimento(){
    saldo *= 1.1;

    return saldo;
  }

  String recuperarDadosparaImpressao(){
    String dados;
    dados = "titular da conta: ".concat(titular +"\n");
    dados = dados.concat("Agencia: "+ agencia + "\n");
    dados = dados.concat("Numero da Conta: "+ numero_conta + "\n");
    dados = dados.concat("Data Abertura: "+ dataDeAbertura + "\n");
    dados = dados.concat("Saldo: "+ saldo + "\n");

    return dados;

  }





}
