# language: es
# Autor: MaGs
Característica: Cambiar apodo en GeForce NOW

  Escenario: Usuario inicia sesión y actualiza su apodo
    Dado que estoy en la página de GeForce NOW
    Cuando inicio sesión con:
      | usuario                | contrasena        |
      | hoboxor421@daxiake.com         | MAgsconra2345@ |
    Y cambio mi apodo a "henry"
    Entonces debería ver mi apodo actualizado
