package org.example.capitulotech;

public class NumberChecker {

  private static final int HIGH_LIMIT = 100;
  private static final int LOW_LIMIT = -100;

  /**
   * Verifica a classificação de um número dentro de certos limites.
   *
   * @param number o número a ser verificado.
   * @return uma descrição textual da classificação do número.
   * @throws IllegalArgumentException se o número estiver fora do intervalo permitido.
   */
  public String checkNumber(Integer number) {
    if (number == null) {
      return "Entrada inválida: número nulo";
    }
    if (number > HIGH_LIMIT) {
      throw new IllegalArgumentException("Número acima do limite permitido");
    } else if (number >= 0) {
      return (number > 0) ? "Positivo" : "Zero";
    } else if (number < LOW_LIMIT) {
      throw new IllegalArgumentException("Número abaixo do limite permitido");
    } else {
      return "Negativo";
    }
  }
}
