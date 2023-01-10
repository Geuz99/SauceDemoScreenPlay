Feature: Login

  @lLoginSuccessful
  Scenario Outline: Ingresar a la aplicacion sauce demo
    Given El cliente ingresa a la pagina web
    When El cliente ingresa las credenciales <usuario> y <contrasenia>
    Then validamos que estemos en la pagina principal <validtexto>
    Examples:
      |usuario|contrasenia|validtexto|
      |standard_user|secret_sauce|PRODUCTS|

  @addFilter
  Scenario: Filtrar los precios de los productos de menor a mayor
    Given El cliente tiene que dar click en el boton de filtracion de menor a mayor
    Then Validamos que los precios esten ordenados segun su precio "PRICE (LOW TO HIGH)"

  @addToCart
  Scenario: Agregar un producto al carrito
    Given El cliente selecciona un item al carrito de compras
    When El cliente ingresa al carrito de compras
    And Validamos que el producto se encuentre en el carrito "Test.allTheThings() T-Shirt (Red)"

  @CheckItems
  Scenario: Realizar el check de los items cargados al carrito de compras
    When El cliente de click al boton de check
    Then Validamos estar en la pagina del checkout "CHECKOUT: YOUR INFORMATION"

  @CheckoutInformation
  Scenario: Ingreso de informacion personal para la facturacion
    Given El cliente ingresa informacion "Anderson" "Zuleta" "1135"
    And El cliente valida la pagina del checkout "CHECKOUT: OVERVIEW"
    Then Validamos la pagina de completacion "CHECKOUT: COMPLETE!"