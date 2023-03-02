# language: en

Feature: Inicio de sesion de usuario
  ##Como usuario quiero iniciar sesion en startsharp
  @Case1
  Scenario: Iniciar sesion satisfactoriamente

    Given Que voy a la pagina de inicio de sesion de startsharp
    When Ingreso mi usuario
    When Ingreso mi clave
    When Selecciono el boton de iniciar sesion
    Then Valido el inicio de sesion correcto