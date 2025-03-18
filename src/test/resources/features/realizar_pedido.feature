# language: es

Característica: Login en StartSharp
  Como usuario
  Quiero iniciar sesion
  para acceder a las funcionalidades de StartSharp

  Antecedentes: Abrir sitio web
    Dado que el usuario se ha logueado en la pagina StartSharp con credenciales validas
    Y se ha creado un cliente aleatorio
    Y se ha creado un producto aleatorio

  Escenario: Crear un nuevo pedido
    Cuando el usuario selecciona la opcion Nuevo Pedido
    Y selecciona el cliente aleatorio
    Y selecciona el producto aleatorio
    Y selecciona la opcion Guardar
    Entonces vera la pagina de pedidos