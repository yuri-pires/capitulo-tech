package org.example.capitulotech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Teste de cobertura de instrução mínima para o método {@link NumberChecker#checkNumber(Integer)}.
 * Este teste cobre todas as linhas de código em uma única execução, visando cobrir o fluxo básico.
 */
public class NumberCheckerMinimalInstructionTest {

  private final NumberChecker numberChecker = new NumberChecker();

  /**
   * Testa a execução básica de todas as instruções no método checkNumber.
   * Utiliza um número negativo para passar por todas as linhas de instrução.
   */
  @Test
  @DisplayName("Cobertura de Instrução Mínima: Fluxo de execução completo com número negativo")
  public void testCheckNumberMinimalInstructionCoverage() {
    assertEquals("Negativo", numberChecker.checkNumber(-10));  // Testa instrução para número negativo
  }
}
