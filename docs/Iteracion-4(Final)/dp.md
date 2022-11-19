# Trabajo en equipo
El lider de la cuarta iteracion sera: Emiliano Blazco

La division de las Historias de Usuario sera la siguiente:

- Dar de baja un usuario (baja lógica)
    - **Encargados**: Marcela Stigelmeier y Matias Fernandez
  
- Agregar un alquiler a Favoritos
    - **Encargados**: Marcela Stigelmeier, Matias Fernandez, Emiliano Blazco, Ariel Cristaldo, Guillermo Quintana, Marcelo Kachuk
  
- Eliminar un alquiler de Favoritos
    - **Encargados**: Emiliano Blazco y Ariel Cristaldo
  
- Modificar propiedad(Implementacion de la funcionalidad faltante de la Iteracion 1)
    - **Encargados**: Guillermo Quintana, Marcelo Kachuk

# Diseño OO

![](link-a-imagen)

# Wireframe y caso de uso

## Wireframe Dar de baja un usuario (baja lógica)

![](link-a-imagen)  

<br><br>
**Caso de uso**: Dar de baja un usuario <br>
**Descripción**: El usuario ingresa a su perfil y busca la opción para dar de baja su usuario, presiona sobre el botón "Dar de baja" y su usuario se desactiva <br>
**Precondición**:  Que el usuario se encuentre con la sesión iniciada <br>
**Postcondición**:  Que el usuario se haya dado de baja<br> 

**Flujo Típico de eventos**:
<table>
  <tr>
    <th>Actor</th>
    <th>Sistema</th>
  </tr>
  <tr>
    <td><b>1</b>.  Este caso de uso comienza cuando el usuario una vez <br>en su perfil, hace click en el boton “Dar de baja” <br>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td><b>2</b>. El sistema despliega el mensaje “Una vez confirmada <br> esta acción no tiene retroceso” y un formulario <br> con los siguientes campos:<br>
    - Campo 1: E-Mail<br>
    - Campo 2: Contraseña<br>
  </tr>
  <tr>
    <td><b>3</b>. El usuario selecciona el campo con la etiqueta <br>“E-Mail” y lo completa<br>
    <td></td>
  </tr>
  <tr>
    <td><b>4</b>. El usuario selecciona el campo con la etiqueta <br>“Contraseña” y lo completa<br>
    <td></td>
  </tr>
  <tr>
    <td><b>5</b>. Una vez completos los campos el usuario selecciona <br> el botón “Dar de baja”
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td><b>6</b>. El sistema valida los campos cargados y muestra el <br>mensaje “Este usuario fue dado de baja correctamente”
 </tr>
</table>

<u>**Flujo Alternativo de Eventos**.</u>  

**Paso 6**:  El sistema detecta que un campo no fue cargado correctamente e indica cuál es el campo que no cumple con lo requerido.

## Wireframe Agregar un alquiler a Favoritos

![](link-a-imagen)  

<br><br>
**Caso de uso**: Agregar un alquiler a Favoritos<br>
**Descripción**: El inquilino dentro de un alquiler seleccionado se dirige a la opción de agregar a favoritos y el sistema agrega a la lista de favoritos el alquiler seleccionado<br>
**Precondición**:El usuario debe encontrarse dentro de una publicación<br>
**Postcondición**:  Se agregó un alquiler a favoritos<br>

**Flujo Típico de eventos**:
<table>
  <tr>
    <th>Actor</th>
    <th>Sistema</th>
  </tr>
  <tr>
    <td><b>1</b>. Este caso de uso comienza cuando el inquilino  <br>se encuentra dentro de la publicación elegida.<br>
    <td></td>
  </tr>
  <tr>
    <td><b>2</b>. El inquilino selecciona la opción de agregar a favoritos <br> con un icono de corazón asociado<br>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td><b>6</b>. El sistema cambia el estado de la publicación a favoritos <br>y guarda la publicación en la lista de favoritos.<br>
 </tr>
</table>


<u>**Flujo Alternativo de Eventos**.</u>  

**Paso**: El sistema no puede agregar a favoritos la publicación. Pide que se vuelva a cargar la publicación

<br><br>

## Wireframe Eliminar un alquiler de Favoritos

![](link-a-imagen)

<br><br>
**Caso de uso**:   
**Descripción**: 
**Precondición**:
**Postcondición**:

**Flujo Típico de eventos**:
<table>
  <tr>
    <th>Actor</th>
    <th>Sistema</th>
  </tr>
  <tr>
    <td><b>1</b></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td><b>2</b></td>
  </tr>
  <tr>
    <td><b>3</b></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td><b>4</b></td>
  <tr>
    <td><b>5</b></td>
    <td></td>
  </tr>
  <tr>
    <td><b>6</b></td>
    <td></td>
 </tr>
 <tr>
    <td><b>7</b></td>
    <td></td>
 </tr>
 <tr>
    <td><b>8</b></td>
    <td></td>
 </tr>
 <tr>
    <td><b>9</b></td>
    <td></td>
 </tr>
 <tr>
    <td></td>
    <td><b>10</b></td>
 </tr>
</table>

<u>**Flujo Alternativo de Eventos**.</u>  

**Paso**:

<br></br>

# Backlog de iteraciones
**Iteracion 4**
- Dar de baja un usuario (baja lógica)
- Agregar un alquiler a Favoritos
- Eliminar un alquiler de Favoritos
- Modificar propiedad

# Tareas

<br><br>

## **Tareas para Dar de baja un usuario (baja lógica)**

**Como**  Usuario <br>
**Quiero** dar de baja un usuario  <br>
**Para** eliminar una cuenta registrada <br>

<u>Criterios de aceptación</u>

- El Usuario debe ingresar al sistema con su usuario.<br>
- El usuario debe completar los campos requeridos correctamente.<br>


<u>Las siguientes tareas comprenderán el desarrollo de la Historia de Usuario:</u>

- Creación de wireframe
    - Creación del formulario donde contendrán los siguientes elementos
        - Incorporación de botón con la funcionalidad de dar de baja y la etiqueta “Dar de baja
- Descripción del Uso del wireframe (Caso de Uso real)
- Creación del modelo de datos(Entidad/es de Base de datos)
- Validación de campos con sus respectivas alertas


## **Tareas para Agregar un alquiler a Favoritos**

**Como**  Inquilino <br>
**Quiero**  agregar un alqu8iler a favorito <br>
**Para** poder saber cuales son los alquileres que más me interesaron <br>

<u>Criterios de aceptación</u>

- Se debe poder ver una lista con las publicaciones favoritas de un inquilino

<u>Las siguientes tareas comprenderán el desarrollo de la Historia de Usuario:</u>

- Creación de wireframe
    - Creación del formulario donde contendrán los siguientes elementos
        - Agregar un botón con un icono de un corazón para agregar a favoritos


- Descripción del Uso del wireframe (Caso de Uso real)
- Creación del modelo de datos(Entidad/es de Base de datos)
- Validación de campos con sus respectivas alertas

<br><br>

## **Tareas para Eliminar un alquiler de Favoritos**

**Como**  
**Quiero**  
**Para**

<u>Criterios de aceptación</u>

-

<u>Las siguientes tareas comprenderán el desarrollo de la Historia de Usuario:</u>

- Creación de wireframe
    - Creación del formulario donde contendrán los siguientes elementos
        - (Colocar aca el desarrollo del wireframe)


- Descripción del Uso del wireframe (Caso de Uso real)
- Creación del modelo de datos(Entidad/es de Base de datos)
- Validación de campos con sus respectivas alertas

<br><br>

# Retrospectiva de la Iteracion 3

Teniendo en cuenta lo realizado en la release 3 podemos decir que hubo un gran aporte por parte de todos los integrantes del grupo
cada uno cumpliendo con sus tareas asignadas y trabajando de manera correcta con el repositorio de github.
Por otra parte se realizaron de manera completa las 3 actividades (Consultar ubicación, Modificar datos de usuario, Consultar usuario) planteadas para la iteracion. 
Cumpliendo con su documentacion, desarrollo de wireframes e implemntacion de funcionalidades
Ademas de esto se mantuvo la forma de trabajo de a pares, siguiendo con esta metodologia para las siguientes iteraciones.