# REGISTROS DE DOCUMENTOS

Este proyecto se ha realizado con el fin de registrar los librosy y revistas actuales que puede manejar  cualquier persona en su casa. La aplicacion tiene con funcion principal
registrar libros y revistas, por tanto solo tiene la opcion de agregar al resgitrar en archivos .txt.

## Descripcion General del Sistema 🚀

A continuacion usted podra encontrar las clases que coexisten en el sistema:

<img src="https://github.com/Darkritt0101/Proyecto/blob/main/img/Book%20Store.JPG" alt="Diagrama de clases"/>

Ademas, podra ver a continuacion las capturas de pantalla del sistema:

<img src="https://github.com/Darkritt0101/Proyecto/blob/main/img/Sistema.JPG" alt="Diagrama de clases"/>

para la imgen anterior:

Campos
***Paginas y Cantidad; solo aceptan numeros...., para los troso campos son de tipo texto.
***ISBN y ISSN; en caso de que usted quiera guardar datos duplicados de estos campos, el sistema no lo dejara debido a que se consieran que estos campos son unicos.

Botonoes
***Limpiar todo (en amarillo); limpia todos los campos del sistema.
***Guardar Registro (Guarda la informacion que usted ha ingresado al sistema, es importante mencionar:
    ***Si usted elige la opcion Book; los campos ISSN, Responsable, Tematica, Revista#, seran bloqueadas para su edicion.
    ***Si usted elige la opcion Magazine; los campos ISBN, Area, Autor seran bloqueadas para su edicion.


### Pre-requisitos 📋

_Que cosas necesitas para instalar el software y como instalarlas_
1. El usuario final debera de tener instalado en su maquina el jre 14.0.1 o mayor.
2. Windows 10 o mayor.
3. Espacio en disco mayor a 3 MB.

### Instalación 🔧

Debera de guardar el .zip en una carpeta dentro de C (raiz), llamada "bookStore", debera de tener permisos de administrador.
una vez que se haya guardado en la ubicacion correspondiente, el usuario debera de hacer clic sobre el documento llamado "Main", de esta manera
quedara listo para su uso.

El sistemab generara tres archivos llamados: db_TodosLosDocumentos.txt - db_Book.txt - db_Magazine.txt, cada uno de ellos contiene informacion de los libros
yh revisatras registrados en el sistema.

db_TodosLosDocumentos.txt :  se registra tanto los libros como las revistas de manera conjunta.
db_Book.txt :  unicamente se registra los libros.
db_Magazine.txt : se registra unicamente las revistas.

## Ejecutando las pruebas ⚙️

el sistema no posee tareas automaticas, todo depende de lo que ingrese el usuario en cada uno de los campos y en caso que decida guardar los datos, se hara en el momento
qque el usuario lo decida.

### Analice las pruebas end-to-end 🔩

NA

### Y las pruebas de estilo de codificación ⌨️

NA

## Despliegue 📦

Ir al paso de instalacion

## Construido con 🛠️

_Menciona las herramientas que utilizaste para crear tu proyecto_

*IntelliJ IDEA 2021.1.1 (Community Edition)
    Build #IC-211.7142.45, built on April 30, 2021
    Runtime version: 11.0.10+9-b1341.41 amd64
    VM: Dynamic Code Evolution 64-Bit Server VM by JetBrains s.r.o.
    Windows 10 10.0
    GC: G1 Young Generation, G1 Old Generation
    Memory: 2048M
    Cores: 8

    Kotlin: 211-1.4.32-release-IJ7142.27

* JDK 14.0.1

## Contribuyendo 🖇️

NA.

## Wiki 📖

NA

## Versionado 📌

* **Carlos Zapata** - *Trabajo Inicial* - [CarlosZapata](https://github.com/Darkritt0101)

## Autores ✒️

* **Carlos Zapata** - *Trabajo Inicial* - [CarlosZapata](https://github.com/Darkritt0101)

## Licencia 📄

Este proyecto está bajo la Licencia Creative Commons

## Expresiones de Gratitud 🎁

NA



---
⌨️ con ❤️ por [CarlosZapata](https://github.com/Darkritt0101) 😊
