Feature: Autenticar
  Yo como usuario de Cooperación Seguros quiero autenticarme para porder hacer uso de las diferentes funcionalidades de la plataforma

  Scenario: Autenticar usuario con en SAP-Fiori
    Given Productor quiere autenticarse
    When Productor se autentica
    Then Productor debe ver la pagina de inicio