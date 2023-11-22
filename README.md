# ChispasSL
Proyecto para clase de digitalización de la empresa ChispasSL

## La empresa ‘Electricidad Chispas’ desea digitalizar su empresa para ser más competitiva frente a la competencia y maximizar los ingresos. Contrata nuestros servicios.

Nos reunimos con ellos y nos dan información sobre su empresa:<br>
● Toda la gestión de la empresa está realizada con un libro de cálculo en Excel.<br>
● El libro excel que maneja los clientes, tiene las siguientes hojas:<br>
○ Autónomos: personas que trabajan por su cuenta.
○ Sociedades: empresas con varios trabajadores.
○ Productos: productos físicos que venden, por ejemplo, bombillas, interruptores, cable,
etc.
○ Servicios: servicios que realizan a sus clientes, por ejemplo, reparación de una
lámpara, cambio de un diferencial, etc.
○ Facturas: facturas que hacen a sus clientes.
○ Impresión factura.<br>

● En la hoja de autónomos están las siguientes columnas:<br>
○ Código Cliente: número único que identifica al cliente (Tanto para autónomos como
para sociedades).
○ Nombre: nombre del autónomo.
○ Apellidos: apellidos del autónomo.
○ Dni.
○ Dirección Postal.
○ Población.
○ Provincia.
○ Email.
○ Teléfono.<br>

● En la hoja de sociedades están las siguientes columnas:<br>
○ Código Cliente: número único que identifica al cliente (tanto para autónomos como
para sociedades).
○ Razón Social: nombre de la empresa.
○ CIF: Es como el DNI de las empresas.
○ Dirección Postal.
○ Población.
○ Provincia.
○ Email.
○ Teléfono.<br>

● En la hoja de productos están las siguientes columnas:<br>
○ Código Producto: número único que identifica al producto.
○ Nombre.
○ Marca.
○ Modelo.
○ Precio. (10€)
○ Tipo IVA. (21%)<br>

● En la hoja de servicios están las siguientes columnas:<br>
○ Código Servicio: número único que identifica al producto.
Electricidad Chispas
Entorno de Desarrollo. 2º DAM
○ Nombre.
○ Precio.
○ Tipo IVA.<br>

● En la hoja de Facturas están las siguientes columnas:<br>
○ Código de factura: único por cada factura.
○ Fecha de factura.
○ Cliente (sólo se permite un cliente por factura).
○ Productos (puede contener de 0 a N productos. No pueden estar repetidos).
○ Servicios (puede contener de 0 a N servicios. No pueden estar repetidos).
○ Base Imponible. El total de los productos más el total de servicios SIN IVA.
○ Total. El total de los productos más el IVA. Recuerda que cada producto o servicio
lleva un IVA asociado.<br>

● Tienen otra hoja llamada Impresión Facturas que sirve para crear una plantilla de impresión
de la factura para los clientes. En esta hoja están los siguientes datos:<br>
○ Código de Factura. | Fecha de Factura.
○ Cif/Nif del cliente
○ Nombre del cliente.
○ Dirección del cliente.
○ Población del cliente.
○ Provincia del cliente.<br>

○ Además tiene entre 1 a N líneas de ventas (productos y servicios) con esta información:<br>
■ Código
■ Nombre
■ Precio (10€)
■ Tipo IVA (21%)
■ Total con IVA (precio + IVA) (12,1€)
○ Base Imponible
○ Total Factura<br>


## Se pide lo siguiente:

Diseño Diagrama de Clases en UML que recoja todo lo expuesto en el libro Excel de la empresa y nuevas entidades que necesitemos para digitalizar el producto.
Creación de las Clases en Java obtenidas del Diagrama de Clases.
Repositorio con GIT para recoger todo el código.
Es necesario al menos tener una rama master y otras subramas. 
La fusión de las subramas a master se hará a través de Pull Requests.

Para probar que las clases creadas recogen toda la lógica necesaria para la realización de la
aplicación, tendremos una Clase Main que me permita introducir la siguiente información a
través de Scanner:

Un cliente autónomo.
Un cliente sociedad.
Dos productos.
Dos servicios.

Una factura con:
Autónomo.
Un producto.
Un servicio.

Una factura con:
Sociedad.
Un producto.
Un servicio.

Crearemos una clase llamada InvoicePrinter (Impresora de Factura) que emule la hoja del
cliente que tenía para imprimir las facturas. Esta clase sirve para imprimir facturas. La
estructura será la siguiente:

![image](https://github.com/paucare/ElectricidadChispas/assets/146753377/8d515f90-6f08-4bcd-ae10-310bc1cb6887)
