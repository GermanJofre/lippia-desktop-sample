@Calculadora
Feature: Operaciones aritmeticas con la calculadora de windows

  @Operaciones
  Scenario Outline: Operaciones con la calculadora de windows
    Given Calculadora iniciada
    When Primer numero <n1> operacion <operacion> segundo numero <n2>
    Then El resultado es <resultado>

    Examples:
      | n1  | operacion | n2 | resultado |
      | 50  | plus      | 75 | 125       |
      | 25  | minus     | 20 | 5         |
      | 2   | multiply  | 2  | 4         |
      | 100 | divide    | 2  | 50        |