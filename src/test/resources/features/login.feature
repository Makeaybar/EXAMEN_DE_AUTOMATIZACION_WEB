#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Saucedemo
    Cuando inicio sesión con las credenciales usuario: "maycol.yovany29@gmail" y contraseña: "Michael123456789#"
    Entonces valido que debería aparecer el título de "Products"
    #Y también valido que al menos exista un item
