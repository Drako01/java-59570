# Clase 08

### Ejemplos:



1. **OneToOne**: Una relación uno a uno, como la relación entre una **Persona** y un **Pasaporte** (cada persona tiene un pasaporte, y cada pasaporte pertenece a una sola persona).
2. **OneToMany**: Una relación uno a muchos, como la relación entre un **Cliente** y sus **Pedidos** (un cliente puede tener muchos pedidos).
3. **ManyToOne**: Lo opuesto a la relación anterior, cada **Pedido** pertenece a un solo **Cliente**.

### 1. **OneToOne**: Persona y Pasaporte
**Persona** y **Pasaporte** tienen una relación uno a uno. Una persona puede tener un solo pasaporte, y un pasaporte pertenece a una sola persona.

```java
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pasaporte_id", referencedColumnName = "id")
    private Pasaporte pasaporte;
    
    // Getters, setters, constructor y toString
}

@Entity
public class Pasaporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String numero;
    
    @OneToOne(mappedBy = "pasaporte")
    private Persona persona;
    
    // Getters, setters, constructor y toString
}
```

**Explicación**:
- **@OneToOne**: Define la relación uno a uno. La anotación `@JoinColumn` en la clase `Persona` indica que la clave foránea estará en la tabla `Persona` y se relaciona con la columna `id` de la tabla `Pasaporte`.
- **cascade = CascadeType.ALL**: Indica que las operaciones (como persistir, eliminar) se propagarán de `Persona` a `Pasaporte`.

### 2. **OneToMany** y **ManyToOne**: Cliente y Pedidos
Aquí tenemos una relación uno a muchos entre **Cliente** y **Pedido**. Un cliente puede hacer muchos pedidos, pero cada pedido pertenece a un solo cliente.

#### Cliente (OneToMany)
```java
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedido> pedidos = new ArrayList<>();
    
    // Getters, setters, constructor y toString
}
```

#### Pedido (ManyToOne)
```java
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    // Getters, setters, constructor y toString
}
```

**Explicación**:
- **@OneToMany**: En la clase `Cliente`, usamos `@OneToMany` para definir que un cliente puede tener muchos pedidos. El atributo `mappedBy = "cliente"` indica que la tabla `Pedido` es la que contiene la clave foránea.
- **@ManyToOne**: En la clase `Pedido`, usamos `@ManyToOne` para indicar que cada pedido pertenece a un cliente. `@JoinColumn(name = "cliente_id")` especifica que el campo `cliente_id` en la tabla `Pedido` será la clave foránea que apunta a la tabla `Cliente`.

### Código Completo de las Clases:

#### Clase `Persona`:
```java
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pasaporte_id", referencedColumnName = "id")
    private Pasaporte pasaporte;
    
    // Getters, setters, constructor y toString
}
```

#### Clase `Pasaporte`:
```java
@Entity
public class Pasaporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String numero;
    
    @OneToOne(mappedBy = "pasaporte")
    private Persona persona;
    
    // Getters, setters, constructor y toString
}
```

#### Clase `Cliente`:
```java
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedido> pedidos = new ArrayList<>();
    
    // Getters, setters, constructor y toString
}
```

#### Clase `Pedido`:
```java
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    // Getters, setters, constructor y toString
}
```

### Resumen:
- **OneToOne**: Relación entre `Persona` y `Pasaporte`.
- **OneToMany**: Relación entre `Cliente` y `Pedido` (un cliente tiene muchos pedidos).
- **ManyToOne**: Relación entre `Pedido` y `Cliente` (cada pedido pertenece a un cliente).



### 1. **Proyecto Spring Boot**
Este es un proyecto **Spring Boot**, un marco que permite crear aplicaciones web de manera rápida y sencilla. En este caso, estamos construyendo una aplicación que maneja dos entidades principales: **Alumno** y **Curso**.

**Conceptos clave:**
- **Spring Boot**: Es un framework que te permite crear aplicaciones sin necesidad de configurar todo manualmente. Hace que el desarrollo sea más rápido.
  - [Referencia](https://spring.io/projects/spring-boot)

### 2. **Entidades: Alumno y Curso**
En este proyecto, tenemos dos entidades representadas por las clases **Alumno** y **Curso**. Una entidad es una clase que mapea a una tabla en la base de datos.

#### Alumno:
La entidad `Alumno` tiene atributos como nombre, apellido, DNI (documento de identidad) y legajo. Además, un alumno puede estar inscrito en varios cursos.

```java
@Entity
@Table(name = "Alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private Long dni;
    private String legajo;
    @ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
    private List<Curso> cursos = new ArrayList<>();
}
```

- **@Entity**: Le dice a Spring que esta clase representa una tabla en la base de datos.
- **@Table(name = "Alumnos")**: Define el nombre de la tabla.
- **@Id y @GeneratedValue**: La anotación `@Id` define el campo que será la clave primaria, y `@GeneratedValue` genera automáticamente los valores para este campo.
- **@ManyToMany**: Indica que existe una relación "muchos a muchos" entre alumnos y cursos (un alumno puede estar en muchos cursos y un curso puede tener muchos alumnos).
  
#### Curso:
La entidad `Curso` tiene un nombre y una lista de alumnos que están inscritos en él.

```java
@Entity
@Table(name = "Cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Alumno> alumnos = new ArrayList<>();
}
```

**Conceptos clave:**
- **Relación Many-to-Many**: Indica que ambas entidades (Alumno y Curso) pueden tener muchas instancias relacionadas entre sí.
  - [Referencia](https://www.baeldung.com/jpa-many-to-many)

### 3. **Base de datos MySQL**
El proyecto utiliza **MySQL** para almacenar los datos. En el archivo `application.properties`, configuras los datos de la conexión a la base de datos.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/coderhouse
spring.datasource.username=root
spring.datasource.password=tu_contraseña
```

- **spring.datasource.url**: Especifica la URL de la base de datos.
- **spring.datasource.username y password**: Las credenciales para conectarse a la base de datos.

**Conceptos clave:**
- **Base de datos MySQL**: Sistema de gestión de bases de datos que guarda tus datos en tablas.
  - [Referencia](https://dev.mysql.com/doc/)

### 4. **DAO Factory: Acceso a los Datos**
En el archivo `DaoFactory`, defines métodos para interactuar con la base de datos, como crear alumnos, cursos e inscribir alumnos en cursos.

```java
@Transactional
public void createAlumno(Alumno alumno) {
    em.persist(alumno);
}
```

- **@Transactional**: Indica que el método debe ejecutarse dentro de una transacción, es decir, todas las operaciones realizadas en ese método serán tratadas como un solo bloque de trabajo.
- **EntityManager**: Es el objeto que utilizamos para realizar operaciones CRUD (crear, leer, actualizar, eliminar) en la base de datos.

**Conceptos clave:**
- **DAO (Data Access Object)**: Patrón de diseño que separa la lógica de acceso a la base de datos del resto de la aplicación.
  - [Referencia](https://www.baeldung.com/java-dao-pattern)

### 5. **Ejecución de la Aplicación**
En el archivo `DemoApplication`, defines el método `run` para crear alumnos, cursos e inscribirlos en esos cursos cuando la aplicación arranca.

```java
@Override
public void run(String... args) throws Exception {
    Curso curso1 = new Curso("Matemáticas");
    Alumno alumno1 = new Alumno("Ernesto", "Sabato", 343434L, "343434L");
    daoFactory.createCurso(curso1);
    daoFactory.createAlumno(alumno1);
    daoFactory.inscribirAlumnoEnCurso(curso1.getId(), alumno1.getDni());
}
```

- **CommandLineRunner**: Te permite ejecutar código al iniciar la aplicación.
  - [Referencia](https://www.baeldung.com/spring-boot-console-app)

### 6. **LazyInitializationException**
El error que enfrentabas era causado por intentar acceder a una colección que aún no había sido inicializada (debido al uso de `FetchType.LAZY`). Cambiamos a **FetchType.EAGER** para cargar los datos automáticamente cuando se consultan.

**Conceptos clave:**
- **FetchType.LAZY**: Carga los datos de una relación solo cuando son necesarios.
- **FetchType.EAGER**: Carga los datos de la relación inmediatamente.
  - [Referencia](https://www.baeldung.com/hibernate-lazy-eager-loading)

### Resumen:
- **Spring Boot**: El framework que utilizamos para crear la aplicación.
- **Entidades JPA**: Definen las tablas en la base de datos (Alumno y Curso).
- **Relaciones Many-to-Many**: Permiten que un alumno esté inscrito en varios cursos y viceversa.
- **DAO**: Los objetos que manejan el acceso a los datos.
- **MySQL**: La base de datos que almacena la información.



---



## Profesor: Alejandro Daniel Di Stefano
[GitHub](https://github.com/Drako01) 

  