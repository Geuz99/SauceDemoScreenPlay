Feature: Login

  @lLoginSuccessful
  Scenario Outline: Ingresar a la aplicacion sauce demo
    Given El cliente ingresa a la pagina web
    When El cliente ingresa las credenciales <usuario> y <contrasenia>
    Then validamos que estemos en la pagina principal <validtexto>
    Examples:
      |usuario|contrasenia|validtexto|
      |standard_user|secret_sauce|PRODUCTS|