# Clase 05

### 1. **Herencia**
La herencia es un concepto fundamental en la programación orientada a objetos que permite que una clase herede las propiedades y métodos de otra clase. La clase que hereda se llama **subclase** o **clase derivada**, mientras que la clase de la que hereda se llama **superclase** o **clase base**.

- **Ejemplo**: Supongamos que tenemos una clase `Animal` con propiedades como `nombre` y métodos como `hacerSonido()`. Luego, creamos una subclase llamada `Perro` que hereda de `Animal` y puede tener métodos adicionales como `ladrar()`.

```java
class Animal {
    String nombre;

    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    void ladrar() {
        System.out.println("El perro ladra");
    }
}
```

- **Ventaja**: La herencia nos permite reutilizar código y crear jerarquías de clases.

### 2. **Polimorfismo**
El polimorfismo permite que un objeto se comporte de diferentes maneras dependiendo del contexto. En Java, hay dos tipos de polimorfismo:

- **Polimorfismo en tiempo de compilación** (sobrecarga de métodos): Cuando múltiples métodos tienen el mismo nombre pero diferentes parámetros.
  
- **Polimorfismo en tiempo de ejecución** (sobrescritura de métodos): Cuando una subclase proporciona su propia implementación de un método que ya existe en la superclase.

- **Ejemplo**: Sobrescritura de métodos
```java
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
```

### 3. **Hashcode**
El método `hashCode()` en Java devuelve un número entero que representa el estado de un objeto. Es utilizado principalmente en estructuras de datos como `HashMap`, `HashSet` y `Hashtable` para identificar de forma rápida los objetos.

- **Regla importante**: Si dos objetos son iguales según el método `equals()`, entonces deben tener el mismo `hashCode()`.

### 4. **Equals**
El método `equals()` se utiliza para comparar si dos objetos son iguales. Por defecto, el método `equals()` en la clase `Object` compara la referencia de memoria, es decir, si ambos objetos son exactamente el mismo objeto.

- **Sobrescritura del método equals()**: Para comparar el contenido de los objetos, es común sobrescribir este método en nuestras clases.

```java
class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return nombre.equals(persona.nombre);
    }
}
```

Voy a tratar de explicarlo de una manera más clara, usando ejemplos sencillos para que puedan entender mejor cómo funcionan `hashCode()` y `equals()` en Java.

### 1. **¿Qué es `hashCode()`?**

El método `hashCode()` devuelve un número entero que representa el estado interno de un objeto. Este número se usa para ubicar rápidamente los objetos en estructuras de datos como `HashMap` o `HashSet`. Piensa en el `hashCode()` como una "dirección" que el objeto tiene en la memoria.

- **Importante**: Si dos objetos son iguales según el método `equals()`, deben tener el mismo `hashCode()`. Sin embargo, dos objetos con el mismo `hashCode()` no necesariamente son iguales.

### 2. **¿Qué es `equals()`?**

El método `equals()` se usa para comparar si dos objetos son iguales. Por defecto, el método `equals()` en la clase `Object` compara la referencia de memoria, es decir, verifica si ambos objetos son exactamente el mismo objeto en la memoria.

Si sobrescribes el método `equals()`, puedes definir qué significa que dos objetos sean iguales según tus propios criterios. Por ejemplo, en una clase `Persona`, puedes considerar que dos personas son iguales si tienen el mismo nombre y edad.

### **Ejemplo para aclarar `hashCode()` y `equals()`**

Vamos a crear una clase simple llamada `Persona`, que tiene un nombre y una edad. Veremos cómo sobrescribir `hashCode()` y `equals()` para que dos objetos `Persona` se consideren iguales si tienen el mismo nombre y edad.

```java
class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Si los objetos son el mismo, son iguales
        if (obj == null || getClass() != obj.getClass()) return false; // Si el objeto es null o no es de la misma clase, no son iguales
        
        Persona persona = (Persona) obj; // Convertimos el objeto a Persona para comparar
        return nombre.equals(persona.nombre) && edad == persona.edad; // Comparación de contenido
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + edad; // Creamos un hashCode basado en nombre y edad
    }
}
```

### **Explicación del ejemplo:**
1. **Sobrescritura de `equals()`**:
   - Primero, comprobamos si el objeto pasado como parámetro es el mismo que el objeto actual (`this`). Si lo es, entonces son iguales.
   - Si el objeto es `null` o no es de la misma clase, devolvemos `false`.
   - Finalmente, comparamos el contenido de los objetos (nombre y edad) para determinar si son iguales.

2. **Sobrescritura de `hashCode()`**:
   - Creamos un número entero basado en los valores del nombre y la edad. Esto asegura que si dos personas tienen el mismo nombre y edad, tendrán el mismo `hashCode()`.

### **Por qué son importantes `hashCode()` y `equals()` juntos:**

- **En una estructura como un `HashMap` o `HashSet`, Java usa el `hashCode()` para ubicar rápidamente un objeto**. Luego, usa el método `equals()` para verificar si el objeto realmente es igual al que está buscando.
  
- **Regla importante**: Si dos objetos son iguales (`equals()` devuelve `true`), deben tener el mismo `hashCode()`. Esto es necesario para que las colecciones como `HashMap` y `HashSet` funcionen correctamente.

### **Ejemplo práctico:**

```java
Persona persona1 = new Persona("Juan", 25);
Persona persona2 = new Persona("Juan", 25);

System.out.println(persona1.equals(persona2)); // Debería imprimir true, porque tienen el mismo nombre y edad
System.out.println(persona1.hashCode() == persona2.hashCode()); // Debería imprimir true, porque sus hashCodes son iguales
```

En este caso:
- `equals()` devuelve `true` porque `persona1` y `persona2` tienen el mismo nombre y edad.
- Sus `hashCode()` también son iguales, lo cual es consistente con la regla que mencionamos.



### 5. **Excepciones (Checked y Unchecked)**
Las excepciones son eventos que interrumpen el flujo normal del programa. En Java, hay dos tipos de excepciones:

- **Checked exceptions (comprobadas)**: Son excepciones que se deben manejar obligatoriamente. El compilador te obliga a tratar estas excepciones. Ejemplo: `IOException`, `SQLException`.
  
- **Unchecked exceptions (no comprobadas)**: Son excepciones que ocurren durante la ejecución y no es obligatorio manejarlas. Ejemplo: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

### 6. **Manejo de Excepciones**
El manejo de excepciones en Java se realiza usando bloques `try`, `catch`, y `finally`.

- **try**: Contiene el código que puede generar una excepción.
- **catch**: Captura y maneja la excepción.
- **finally**: Código que se ejecuta siempre, sin importar si hubo o no una excepción.

```java
try {
    int resultado = 10 / 0; // Esto causará una excepción
} catch (ArithmeticException e) {
    System.out.println("No se puede dividir por cero.");
} finally {
    System.out.println("Este bloque siempre se ejecuta.");
}
```

### 7. **Control de flujo de excepciones**
El control de flujo de excepciones implica la forma en que Java maneja las excepciones cuando ocurren. Cuando se lanza una excepción, el programa busca un bloque `catch` correspondiente para manejarla, siguiendo una jerarquía de excepciones.

- Si se encuentra un `catch` adecuado, el control pasa al bloque de manejo de excepciones.
- Si no se encuentra ningún `catch`, el programa se detiene.

### 8. **Constructor**
Un constructor es un bloque especial de código en una clase que se utiliza para inicializar objetos. Se llama automáticamente cuando se crea un objeto de la clase.

- Un constructor tiene el mismo nombre que la clase y no tiene un tipo de retorno.
- Hay dos tipos de constructores:
  - **Constructor por defecto**: Es el constructor sin parámetros que Java proporciona automáticamente.
  - **Constructor parametrizado**: Un constructor que toma parámetros para inicializar un objeto con valores específicos.

```java
class Persona {
    String nombre;

    // Constructor parametrizado
    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
```



---



## Profesor: Alejandro Daniel Di Stefano
[GitHub](https://github.com/Drako01) 