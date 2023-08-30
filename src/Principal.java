public class Principal {

  public static void main(String[] args) {
    CalculadoraImc calculadoraImc = new CalculadoraImc();

    Paciente paciente = new Paciente();
     paciente.altura = 1.80;
     paciente.peso = 65;

    IndiceMassaCorporal imc = calculadoraImc.calcular(paciente);

    if (imc.estaAbaixoDoPeso()) {
      System.out.printf("Paciente está com seu imc: %f2.2%n (abaixo do peso)",
          imc.resultado);
    }

    if(imc.estaComPesoIdeal()) {
      System.out.printf("Paciente está com seu imc: %f2.2%n (peso ideal)",
          imc.resultado);
    }

    if(imc.estaComPesoLevementeAcima()) {
      System.out.printf("Paciente está com seu imc: %f2.2%n (levemente acima do peso)",
          imc.resultado);
    }

    if(imc.estaComObesidade()) {
      System.out.printf("Paciente está com seu imc: %f2.2%n (obesidade grau 1)",
          imc.resultado);
    }

    if(imc.estaComObesidadeGrau2()) {
      System.out.printf("Paciente está com seu imc: %f2.2%n (obesidade grau 2)",
          imc.resultado);
    }

    if(imc.estaComObesidadeGrau3()) {
      System.out.printf("Paciente está com seu imc: %f%n (obesidade grau 3)",
          imc.resultado);
    }


    System.out.printf("IMC: %.2f%n", imc.resultado);
  }
}
