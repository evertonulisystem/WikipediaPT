Feature: Consulta de precos
  Scenario: Consultar Ovo de Pascoa
    Given que acesso a Wikipedia
    When pesquiso palavra por "Ovo de Páscoa"
    Then exibe a expressao "Ovo de Páscoa" no tiulo da guia