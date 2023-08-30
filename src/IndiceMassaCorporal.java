public class IndiceMassaCorporal {

  double resultado;
  double peso;
  double altura;

  boolean estaAbaixoDoPeso() {
    return resultado < 18.5;
  }

  boolean estaComPesoIdeal() {
    return resultado >= 18.6 && resultado <= 24.9;
  }

  boolean estaComPesoLevementeAcima() {
    return resultado >= 25 && resultado <= 29.9;
  }

  boolean estaComObesidade() {
    return resultado >= 30 && resultado <= 34.9;
  }

  boolean estaComObesidadeGrau2() {
    return resultado >= 30 && resultado <= 34.9;
  }

  boolean estaComObesidadeGrau3() {
    return resultado > 40;
  }

}
