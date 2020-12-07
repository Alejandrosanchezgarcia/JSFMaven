# JSFMaven

Subido por Alejandro Sánchez García, alumno de 2º de DAW del IES Polígono Sur de Sevilla.

# 1- ¿En que consiste el proyecto?.
Se trata de una aplicación en la que introduces los datos de un usuario y el programa los guarda y les da persistencia.

# 2- Tecnologías usadas.
Redis -> Hemos usado redis para darle persistencia a los datos introducidos por el usuario. Cada persona introducida al programa se guardará en el servidor Redis.

JSF -> La tecnología JavaServer Faces es un framework de interfaz de componentes de usuarios del lado del servidor para las aplicaciones web basadas en la tecnología Java.

¿Por qué hemos usado JSF?
JSF proporciona:
a) Una clara separación entre vista y modelo.
b) Desarrollo basado en componente, no en peticiones.
c) Las acciones del usuario se ligan muy fácilmente al código en el servidor.
d) Creación de familias de componentes visuales para acelerar el desarrollo.
e) Ofrece múltiples posibilidades de elección entre distintos desarrollos.

PrameFaces -> PrimeFaces es una biblioteca de componentes para JavaServer Faces (JSF) de código abierto que cuenta con un conjunto de componentes enriquecidos que facilitan la creación de las aplicaciones web.

Maven -> Hemos usado maven para que nos ayude a la hora de empaquetar el proyecto y que nos simplifique a la hora de la compilación y a la hora de desplegar nuestra aplicación en el servidor TomEE.

# 3- Requisitos para poder probar la aplicación.

Se necesita tener instalado en nuestro sistema las siguientes herramientas:

- Maven.
- Redis.
- Servidor TomEE o TomCat.

# 4- ¿Cómo arrancar la aplicación?

Primero nos colocaremos en el directorio donde se encuentra el pom.xml, ahí haremos mvn package, esto hará que se compile nuestro proyecto y que se genere una carpeta target en el mismo directorio donde nos encontramos.
Acto seguido entraremos en el directorio target y copiaremos el archivo JSFMaven.war a la carpeta webapps de nuestro apache tomee.
Antes de ir a probar la aplicación debemos de arrancar el servidor tomee, esto se hace yendo a la carpeta bin de apache tomee y ejecutando el script startup.sh .
También debemos de arrancar Redis para poder visualizar como se introducen los usarios cuando se hace click en add en la aplicación. Arrancar redis es tan fácil como ejecutar la siguiente línea de código en el terminal (se recomienda usar ubuntu), redis-cli , una vez abierto el servidor redis debemos escribir monitor, con esto haremos el seguimiento de los datos introducidos.
Ya solo queda hacer la siguiente busqueda en nuestro navegador, localhost:8080/JSFMaven .
Con estos pasos nuestra apliación correrá perfectamente.


