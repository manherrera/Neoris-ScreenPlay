Feature: Autenticar
  Yo como usuario de BBV Aquiero autenticarme para porder hacer uso de las diferentes funcionalidades de la plataforma

  Scenario: Autenticar usuario Cliente en "Clemente"
    Given Cliente quiere autenticarse
    When Cliente se autentica
    Then Cliente debe ver la pagina de inicio