Feature: El usuario ingresa a la pagina
  de bancolombia y podra descargar el informe
  del sector petroleo

  Scenario: Usuario descargar el informe del sector petroleo en la pagina de bancolombia
    Given el usuario ingresa a la pagina de bancolombia
    When el usuario descargar el informe del sector petroleo
    Then el usuario visualiza el pdf del informe del sector petroleo