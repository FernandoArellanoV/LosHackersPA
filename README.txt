Instrucciones de uso "proyectosupermercado" del grupo "Los Hackers"

1. Ejecutar el archivo "ProyectoSupermercado.java" ya que este es el main.

2. Se desplegará 3 opciones:

	- Inciar sesión: Permite iniciar el programa con una cuenta ya guardada.
	- Registrarse: Permite crearse una nueva cuenta "Cliente".
	- Salir: Se sale del programa.

3. En el caso de haber seleccionado "Iniciar sesión" se solicita ingresar un correo electrónico y una contraseña: Esta información se encuentra en el archivo "Usuarios.txt" en el formato "Nombre - Contraseña - Correo electrónico - dígito de verificación".

Si se desea iniciar sesión como un "Cliente" se debe ingresar cualquier usuario con el dígito verificador = 0, por el caso contrario, si se desea ocupar a un "Administrador" se debe iniciar sesión con un usuario con el dígito verificador > 0.

En caso de iniciar sesión como "Cliente" las opciones son:

	1. Mostrar productos
	2. Buscar producto por nombre    
	3. Buscar producto por código    
	4. Comprar un producto
	5. Mostrar producto más barato   
	6. Buscar por un rango de precios
	7. Cerrar sesión

En caso de iniciar sesión como "Administrador" las opciones son:

	1. Agregar productos
	2. Mostrar productos
	3. Mostrar usuarios
	4. Buscar usuario por correo
	5. Buscar producto por nombre
	6. Buscar producto por código
	7. Modificar producto
	8. Modificar usuario
	9. Eliminar producto
	10. Eliminar Usuario
	11. Cerrar sesión
	12. Reporte

4. Si se realizó una compra mediante un usuario-cliente la boleta resultante de la compra se habrá creado en un archivo "nombre.txt" siendo la palabra nombre sustituida por el nombre personal del usuario con el cual se realizó la compra. 
