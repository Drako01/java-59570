# RestTemplate

### ¿Qué hace el método `restTemplate()`?

Este método es muy especial en Spring, y vamos a desglosarlo paso a paso.

1. **Definición del método**:  
   ```java
   RestTemplate restTemplate() {
       return new RestTemplate();
   }
   ```
   Aquí estamos creando un método llamado `restTemplate()`. Este método devuelve un **nuevo objeto de tipo `RestTemplate`**, que es la herramienta que nos ayuda a hacer solicitudes HTTP a otros servicios.

2. **Anotación `@Bean`**:
   ```java
   @Bean
   ```
   Esta anotación le dice a Spring: **“Quiero que este objeto esté disponible para que otros lugares de mi aplicación puedan usarlo”**. Esto es como si declaráramos el objeto `RestTemplate` como una herramienta o recurso común para toda la aplicación. Spring se encarga de crear una única instancia de `RestTemplate` y compartirla donde se necesite, sin necesidad de crearla cada vez.

3. **¿Para qué sirve?**  
   Al definir `RestTemplate` como un `@Bean`, logramos que esté disponible para inyectarlo en cualquier clase que lo necesite, sin tener que crear una nueva instancia. Esto ayuda a simplificar el código y hace que nuestra aplicación sea más eficiente y organizada.

### Ejemplo de uso
Imagina que tienes otra clase en tu aplicación donde necesitas `RestTemplate` para hacer una solicitud. Al tener el método `@Bean`, puedes simplemente "pedírselo" a Spring en esa otra clase sin necesidad de volver a crear `RestTemplate`. Spring ya lo tiene preparado y te lo da cuando lo necesites.

---

En resumen:
- El método `restTemplate()` crea un objeto `RestTemplate`.
- La anotación `@Bean` le indica a Spring que ese objeto `RestTemplate` estará disponible para toda la aplicación.
- Gracias a esto, podemos usar `RestTemplate` en otras partes de nuestra aplicación de forma fácil y sin necesidad de instanciarlo repetidamente.


**¿Qué es `RestTemplate` y para qué sirve?**

Imaginemos que nuestra aplicación es como una persona que quiere hablar con otros programas o servicios en Internet. Para que esto ocurra, necesitamos una "herramienta de comunicación" que le permita enviar y recibir información de esos servicios. En Java, una de las herramientas más comunes para hacer esto se llama **`RestTemplate`**.

### ¿Qué hace `RestTemplate`?
`RestTemplate` es una clase en Java (específicamente en Spring) que nos ayuda a:
1. **Enviar solicitudes (requests)** a otras aplicaciones o servicios web.
2. **Recibir respuestas (responses)** de esos servicios.

Podemos pensar en `RestTemplate` como una especie de "teléfono" que nuestra aplicación usa para comunicarse con otros sistemas. Cuando queremos obtener datos, crear información nueva, actualizar o borrar datos en otro sistema, usamos `RestTemplate` para hacer esa solicitud.

### ¿Para qué sirve?
Cuando nuestra aplicación necesita interactuar con un servicio web, `RestTemplate` permite enviar distintos tipos de solicitudes HTTP, como:
- **GET**: Para pedir información (como pedirle a Google los resultados de una búsqueda).
- **POST**: Para enviar información (como cuando enviamos un formulario).
- **PUT**: Para actualizar información en ese servicio.
- **DELETE**: Para eliminar algo en el servicio.

### Ejemplo sencillo
Supongamos que nuestra aplicación necesita una lista de "usuarios" que están en otro servicio. Usando `RestTemplate`, podemos enviar una solicitud GET para obtener esa lista.

Así podría verse el código:

```java
// 1. Definimos la URL del servicio donde están los usuarios
String url = "https://ejemplo.com/api/usuarios";

// 2. Usamos RestTemplate para hacer una solicitud GET y obtener la lista de usuarios
RestTemplate restTemplate = new RestTemplate();
List<Usuario> usuarios = restTemplate.getForObject(url, List.class);

// 3. Ahora tenemos los usuarios en la variable "usuarios"
```

### En resumen
`RestTemplate` es una herramienta en Java para enviar y recibir información de otros servicios web. Nos facilita mucho el trabajo cuando queremos que nuestra aplicación se conecte con otros sistemas y "hable" con ellos, ya sea para obtener, crear, actualizar o eliminar información.

--- 


Explicación sobre cada uno de los métodos que se usan en `UserRestApi`, desglosando su propósito y el rol de cada uno.

---



## Métodos de `RestTemplate`

En esta clase `UserRestApi`, estamos utilizando `RestTemplate` para hacer solicitudes HTTP a un API externo. Los métodos de `RestTemplate` nos permiten enviar y recibir datos de un servicio web. Veamos para qué sirven cada uno de ellos y cómo se utilizan.

---

### 1. **`exchange()` - Método `getUsers()`**

```java
List<User> users = restTemplate.exchange(BASE_URL, HttpMethod.GET, null, List.class).getBody();
```

- **¿Qué hace?**  
  El método `exchange()` de `RestTemplate` envía una solicitud HTTP de un tipo específico (en este caso, `GET`) y recibe la respuesta del servidor. Aquí estamos utilizando `exchange()` para realizar una solicitud `GET` al endpoint `BASE_URL`, lo que devuelve una lista de usuarios.

- **Parámetros importantes**:
  - `BASE_URL`: Es la URL del servicio desde donde obtenemos los usuarios.
  - `HttpMethod.GET`: Define que el tipo de solicitud es `GET`, utilizada para recuperar datos.
  - `null`: No necesitamos enviar un cuerpo en esta solicitud `GET`, por eso lo dejamos `null`.
  - `List.class`: Indica que esperamos una respuesta de tipo `List` (en este caso, lista de `User`).

- **¿Para qué sirve?**  
  Este método permite obtener todos los usuarios almacenados en el servicio remoto (API).

---

### 2. **`postForObject()` - Método `addUsers()`**

```java
return restTemplate.postForObject(BASE_URL, user, User.class);
```

- **¿Qué hace?**  
  El método `postForObject()` envía una solicitud `POST` para crear un nuevo recurso en el servidor, en este caso, un usuario. Envía el objeto `user` al servicio y recibe la respuesta transformada en un objeto de tipo `User`.

- **Parámetros importantes**:
  - `BASE_URL`: La URL del servicio a donde enviamos el usuario para que sea creado.
  - `user`: El objeto que queremos enviar en el cuerpo de la solicitud para crear un nuevo usuario en el sistema remoto.
  - `User.class`: Especifica el tipo de la respuesta esperada, que es un `User`.

- **¿Para qué sirve?**  
  Este método permite crear un nuevo usuario en el servidor y recibir la representación completa del usuario recién creado en la respuesta.

---

### 3. **`put()` - Método `updateUsers()`**

```java
restTemplate.put(url, user);
```

- **¿Qué hace?**  
  El método `put()` envía una solicitud `PUT` para actualizar un recurso existente en el servidor. Utiliza la URL específica del usuario (con su `id`) y envía el objeto `user` con los nuevos datos.

- **Parámetros importantes**:
  - `url`: Es la URL del usuario específico que queremos actualizar, combinando `BASE_URL` con el `id` del usuario.
  - `user`: El objeto `User` que contiene los datos actualizados para ese usuario específico.

- **¿Para qué sirve?**  
  Este método permite modificar los datos de un usuario ya existente en el servidor. La solicitud `PUT` actualiza el recurso con los datos enviados.

---

### 4. **`delete()` - Método `deleteUsers()`**

```java
restTemplate.delete(url);
```

- **¿Qué hace?**  
  El método `delete()` envía una solicitud `DELETE` al servidor, pidiendo eliminar un recurso específico. Aquí se utiliza para eliminar un usuario particular usando su `id`.

- **Parámetros importantes**:
  - `url`: Es la URL del usuario que queremos eliminar, formada combinando `BASE_URL` con el `id` del usuario.

- **¿Para qué sirve?**  
  Este método permite eliminar un usuario específico del sistema remoto, borrando su información del servidor.

---

### 5. **`getForObject()` - Método `getUserById()`**

```java
return restTemplate.getForObject(url, User.class);
```

- **¿Qué hace?**  
  El método `getForObject()` realiza una solicitud `GET` para recuperar un recurso específico y lo convierte en un objeto Java. Aquí se utiliza para obtener un usuario específico según su `id`.

- **Parámetros importantes**:
  - `url`: Es la URL del usuario que queremos obtener, combinando `BASE_URL` con el `id` del usuario.
  - `User.class`: Especifica el tipo de respuesta esperada, que es un `User`.

- **¿Para qué sirve?**  
  Este método permite obtener un usuario específico según su `id` desde el sistema remoto, y devuelve los datos como un objeto `User`.

---

### Resumen

- `exchange()`: Realiza solicitudes flexibles (`GET`, `POST`, `PUT`, etc.) y permite especificar el tipo de respuesta.
- `postForObject()`: Crea un nuevo recurso (`POST`) y devuelve el objeto creado.
- `put()`: Actualiza un recurso (`PUT`) sin devolver respuesta.
- `delete()`: Elimina un recurso (`DELETE`).
- `getForObject()`: Obtiene un recurso (`GET`) y lo transforma en un objeto Java de tipo específico. 

