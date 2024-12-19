#language: es
@testfeature1
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Saucedemo
    Y inicio sesión con las credenciales usuario: "maycol.yovany29@gmail.com" y contraseña: "Michael123456789#"
    Cuando navego a la categoria "Clothes" y subcategoria "Men"
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido que debería aparecer el título de "Producto añadido correctamente a su carrito de compra"
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito "CARRITO"
    Y vuelvo a validar el calculo de precios en el carrito "S/ 38.24"

  @test1
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Saucedemo
    Y inicio sesión con las credenciales usuario: "maycol.yovany330@gmail.com" y contraseña: "123456789#"
    Cuando navego a la categoria "Clothes" y subcategoria "Men"
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido que debería aparecer el título de "Producto añadido correctamente a su carrito de compra"
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito "CARRITO"
    Y vuelvo a validar el calculo de precios en el carrito "S/ 38.24"

  @test3
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Saucedemo
    Y inicio sesión con las credenciales usuario: "maycol.yovany29@gmail.com" y contraseña: "Michael123456789#"
    Cuando navego a la categoria "auto" y subcategoria "Men"
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido que debería aparecer el título de "Producto añadido correctamente a su carrito de compra"
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito "CARRITO"
    Y vuelvo a validar el calculo de precios en el carrito "S/ 38.24"
