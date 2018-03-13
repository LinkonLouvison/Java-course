
// Author: Linkon Louvison

 class BalancoTrimestral{



public static void main(String[] args){

  double gastosJaneiro = 15000;
  double gastosFevereiro = 26000;
  double gastosMarco = 17000;

  double gastosTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
  double mediaMensal = gastosTrimestral/3;

  System.out.println(gastosTrimestral);
  System.out.println("Valor da media mensal = " + mediaMensal);
}

}
