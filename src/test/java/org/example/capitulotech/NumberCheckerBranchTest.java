package org.example.capitulotech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Teste de cobertura de ramificação para o método {@link NumberChecker#checkNumber(Integer)}.
 * <p>
 * Este conjunto de testes verifica que cada ponto de decisão (if/else) é avaliado
 * para os resultados verdadeiro e falso, cobrindo todos os caminhos lógicos do método.
 */
public class NumberCheckerBranchTest {

  private final NumberChecker numberChecker = new NumberChecker();

  /**
   * Testa o caminho de decisão para um número positivo.
   */
  @Test
  @DisplayName("Testa caminho para número positivo")
  public void testPositiveNumber() {
    assertEquals("Positivo", numberChecker.checkNumber(10));  // number > 0
  }

  /**
   * Testa o caminho de decisão para o valor zero.
   */
  @Test
  @DisplayName("Testa caminho para o valor zero")
  public void testZero() {
    assertEquals("Zero", numberChecker.checkNumber(0));  // number == 0
  }

  /**
   * Testa o caminho de decisão para um número negativo.
   */
  @Test
  @DisplayName("Testa caminho para número negativo dentro do limite")
  public void testNegativeNumber() {
    assertEquals("Negativo", numberChecker.checkNumber(-10));  // number < 0 e > LOW_LIMIT
  }

  /**
   * Testa o caminho de decisão para o valor nulo.
   */
  @Test
  @DisplayName("Testa caminho para valor nulo")
  public void testNullInput() {
    assertEquals("Entrada inválida: número nulo", numberChecker.checkNumber(null));  // number == null
  }

  /**
   * Testa o caminho de exceção para um número acima do limite permitido.
   */
  @Test
  @DisplayName("Testa exceção para número acima do limite")
  public void testAboveHighLimit() {
    assertThrows(IllegalArgumentException.class, () -> numberChecker.checkNumber(150),
      "Deve lançar exceção para número acima do limite");
  }

  /**
   * Testa o caminho de exceção para um número abaixo do limite permitido.
   */
  @Test
  @DisplayName("Testa exceção para número abaixo do limite")
  public void testBelowLowLimit() {
    assertThrows(IllegalArgumentException.class, () -> numberChecker.checkNumber(-150),
      "Deve lançar exceção para número abaixo do limite");
  }
}
