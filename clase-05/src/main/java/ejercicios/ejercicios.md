# Clase 05

### Herencia

1. **Crea una clase `Animal`** con un método `hacerSonido`, y una subclase `Perro` que sobrescriba este método.
2. **Crea una clase `Vehiculo`** con un método `arrancar` y una subclase `Coche` que sobrescriba el método con su propio comportamiento.
3. **Crea una clase `Persona`** con el método `trabajar`, y una subclase `Estudiante` que sobrescriba este método.
4. **Crea una clase `Figura`** con el método `calcularArea` y subclases `Cuadrado` y `Círculo` que implementen este método.
5. **Crea una clase `Empleado`** con un atributo `sueldo` y una subclase `Gerente` que tenga un método para calcular bonificaciones.
6. **Define una clase `Instrumento`** con un método `tocar` y una subclase `Guitarra` que lo sobrescriba.
7. **Crea una clase `Producto`** con el método `calcularPrecio`, y una subclase `Electronico` que tenga un método adicional para calcular garantía.
8. **Crea una clase `Ave`** con el método `volar`, y una subclase `Paloma` que implemente su propio vuelo.
9. **Define una clase `Mamifero`** con el método `alimentarse`, y subclases `Perro` y `Gato` que sobrescriban este método.
10. **Crea una clase `Persona`** con un atributo `nombre` y una subclase `Empleado` con un método para calcular el sueldo mensual.
11. **Crea una clase `Vehiculo`** con el método `acelerar`, y una subclase `Moto` que lo sobrescriba con mayor velocidad.
12. **Define una clase `Computadora`** con un método `encender`, y subclases `Portatil` y `Escritorio` que implementen diferentes formas de encendido.
13. **Crea una clase `Cuenta`** con un método `depositar`, y una subclase `CuentaAhorros` que implemente una tasa de interés.
14. **Crea una clase `Reptil`** con el método `reptar`, y una subclase `Serpiente` que sobrescriba el método.
15. **Define una clase `Figura`** con el método `dibujar`, y subclases `Triangulo` y `Rectangulo` que sobrescriban el método.
16. **Crea una clase `Electrodomestico`** con un método `encender`, y una subclase `Televisor` que sobrescriba el método para mostrar un canal inicial.
17. **Crea una clase `Instrumento`** con un método `afinar`, y una subclase `Piano` que sobrescriba la afinación.
18. **Crea una clase `Animal`** con el método `moverse`, y una subclase `Gato` que lo sobrescriba.
19. **Crea una clase `Figura3D`** con un método `volumen`, y una subclase `Esfera` que implemente su fórmula de volumen.
20. **Crea una clase `Empleado`** con un método `trabajar`, y una subclase `Desarrollador` que sobrescriba el método y agregue un método adicional para programar.

### Polimorfismo

21. **Crea una clase `Animal`** con un método `hacerSonido`, y utiliza polimorfismo para crear un `Perro` y un `Gato` y llamarlos a través de una referencia de tipo `Animal`.
22. **Crea una clase `Vehiculo`** con un método `acelerar`, y utiliza polimorfismo para crear un `Coche` y una `Moto`.
23. **Crea una clase `Instrumento`** con un método `tocar`, y utiliza polimorfismo para llamar a este método en objetos de tipo `Piano` y `Guitarra`.
24. **Crea una clase `Persona`** con un método `trabajar`, y utiliza polimorfismo para llamar este método en una referencia de tipo `Empleado`.
25. **Crea una clase `Figura`** con un método `calcularArea`, y utiliza polimorfismo para calcular el área de un `Círculo` y un `Cuadrado`.
26. **Crea una clase `Electrodomestico`** con el método `encender`, y utiliza polimorfismo para encender una `Lavadora` y un `Televisor`.
27. **Crea una clase `Mamifero`** con un método `alimentarse`, y utiliza polimorfismo para llamar a este método en un `Perro` y un `Gato`.
28. **Crea una clase `Figura3D`** con el método `volumen`, y utiliza polimorfismo para calcular el volumen de una `Esfera` y un `Cubo`.
29. **Crea una clase `Vehiculo`** con el método `frenar`, y utiliza polimorfismo para detener un `Coche` y una `Moto`.
30. **Crea una clase `Electrodomestico`** con el método `apagar`, y utiliza polimorfismo para apagar un `Televisor` y un `Microondas`.

### `hashCode` y `equals`

31. **Crea una clase `Persona`** con atributos `nombre` y `dni`, y sobrescribe los métodos `hashCode` y `equals` para comparar objetos por su DNI.
32. **Crea una clase `Producto`** con atributos `codigo` y `nombre`, y sobrescribe los métodos `hashCode` y `equals` para comparar productos por su código.
33. **Crea una clase `Vehiculo`** con atributos `matricula` y `modelo`, y sobrescribe los métodos `hashCode` y `equals` para que dos vehículos sean iguales si tienen la misma matrícula.
34. **Define una clase `CuentaBancaria`** con atributos `numeroCuenta` y `titular`, y sobrescribe `hashCode` y `equals` para que dos cuentas sean iguales si tienen el mismo número de cuenta.
35. **Crea una clase `Libro`** con atributos `isbn` y `titulo`, y sobrescribe `hashCode` y `equals` para que dos libros sean iguales si tienen el mismo ISBN.
36. **Crea una clase `Estudiante`** con atributos `matricula` y `nombre`, y sobrescribe los métodos `hashCode` y `equals` para comparar estudiantes por matrícula.
37. **Crea una clase `Producto`** con atributos `codigo` y `precio`, y sobrescribe los métodos `hashCode` y `equals` para comparar productos por código.
38. **Crea una clase `Ciudad`** con atributos `nombre` y `codigoPostal`, y sobrescribe los métodos `hashCode` y `equals` para comparar ciudades por su código postal.
39. **Crea una clase `Pelicula`** con atributos `titulo` y `director`, y sobrescribe `hashCode` y `equals` para comparar películas por título y director.
40. **Crea una clase `Usuario`** con atributos `username` y `email`, y sobrescribe `hashCode` y `equals` para comparar usuarios por su email.

### Excepciones (Checked y Unchecked)

41. **Crea un método `calcularDivision`** que lanza una excepción `ArithmeticException` si se intenta dividir por cero.
42. **Crea un método `leerArchivo`** que lanza una excepción `FileNotFoundException` si el archivo no existe.
43. **Crea una clase `CuentaBancaria`** con un método `retirar` que lance una excepción `SaldoInsuficienteException` si el saldo es insuficiente.
44. **Crea un método `convertirStringAEntero`** que lanza una excepción `NumberFormatException` si el formato es incorrecto.
45. **Crea una clase `Registro`** con un método `agregar` que lance una excepción `RegistroDuplicadoException` si se intenta agregar un registro duplicado.
46. **Crea un método `abrirConexion`** que lanza una excepción `SQLException` si falla la conexión a la base de datos.
47. **Crea una clase `Producto`** con un método `aplicarDescuento` que lance una excepción `DescuentoInvalidoException` si el descuento es negativo.
48. **Crea un método `leerArchivo`** que lance una excepción `IOException` al leer un archivo.
49. **Crea un método `validarEdad`** que lance una excepción `IllegalArgumentException` si la edad ingresada es menor a cero.
50. **Crea un método `calcularRaizCuadrada`** que lance una excepción `IllegalArgumentException` si el número es negativo.

### Manejo de Excepciones

51. **Crea un método `dividir`** que maneje una excepción `ArithmeticException` al dividir por cero.
52. **Crea un método `leerArchivo`** que maneje una excepción `FileNotFoundException` si

 el archivo no existe.
53. **Crea un método `conectarBaseDeDatos`** que maneje una excepción `SQLException`.
54. **Crea un método `calcularFactorial`** que maneje una excepción `IllegalArgumentException` si el número es negativo.
55. **Crea una clase `CuentaBancaria`** con un método `retirar` que maneje una excepción `SaldoInsuficienteException`.
56. **Crea un método `abrirArchivo`** que maneje una excepción `IOException` al leer un archivo.
57. **Crea un método `convertirAEntero`** que maneje una excepción `NumberFormatException` al convertir un string.
58. **Crea un método `obtenerElemento`** que maneje una excepción `IndexOutOfBoundsException` al acceder a un índice fuera de los límites.
59. **Crea un método `validarEdad`** que maneje una excepción `IllegalArgumentException` si la edad es inválida.
60. **Crea un método `consultarSaldo`** que maneje una excepción `SaldoInsuficienteException`.

### Control de flujo de excepciones

61. **Crea un método `leerArchivo`** que utilice `try-catch-finally` para manejar una excepción `IOException`.
62. **Crea un método `calcularDivision`** que utilice `try-catch-finally` para manejar una excepción `ArithmeticException`.
63. **Crea un método `conectarBaseDeDatos`** que utilice `try-catch-finally` para manejar una excepción `SQLException`.
64. **Crea un método `abrirArchivo`** que utilice `try-catch-finally` para manejar excepciones de archivos.
65. **Crea un método `validarEntrada`** que use `try-catch` para validar y manejar un `NumberFormatException`.
66. **Crea un método `calcularPromedio`** que utilice `try-catch-finally` para manejar excepciones.
67. **Crea un método `retirarDinero`** que utilice `try-catch` para manejar una excepción `SaldoInsuficienteException`.
68. **Crea un método `validarEdad`** que utilice `try-catch` para manejar una excepción `IllegalArgumentException`.
69. **Crea un método `convertirAEntero`** que utilice `try-catch` para manejar un `NumberFormatException`.
70. **Crea un método `validarArchivo`** que utilice `try-catch-finally` para manejar una excepción `FileNotFoundException`.

### Constructores

71. **Crea una clase `Persona`** con un constructor que reciba nombre y edad.
72. **Crea una clase `Coche`** con un constructor que reciba marca y modelo.
73. **Crea una clase `CuentaBancaria`** con un constructor que reciba número de cuenta y saldo inicial.
74. **Crea una clase `Libro`** con un constructor que reciba título y autor.
75. **Crea una clase `Producto`** con un constructor que reciba código y precio.
76. **Crea una clase `Empleado`** con un constructor que reciba nombre y salario.
77. **Crea una clase `Figura`** con un constructor que reciba base y altura.
78. **Crea una clase `Estudiante`** con un constructor que reciba matrícula y nombre.
79. **Crea una clase `Instrumento`** con un constructor que reciba tipo y marca.
80. **Crea una clase `Vehiculo`** con un constructor que reciba color y velocidad.

### Ejercicios Mixtos

81. **Crea una clase `Animal`** con un constructor y métodos sobrescritos en sus subclases `Perro` y `Gato`.
82. **Crea una clase `Producto`** que sobrescriba `hashCode` y `equals`, y tenga un constructor que reciba `codigo` y `nombre`.
83. **Crea una clase `CuentaBancaria`** que implemente `hashCode`, `equals`, y maneje la excepción `SaldoInsuficienteException`.
84. **Crea una clase `Figura`** con un constructor que reciba parámetros para `base` y `altura`, y calcule el área.
85. **Crea una clase `Empleado`** con un constructor y métodos sobrescritos en subclases como `Gerente` y `Desarrollador`.
86. **Crea una clase `Vehiculo`** que sobrescriba `hashCode`, y tenga un constructor que reciba `matricula` y `modelo`.
87. **Crea una clase `Pelicula`** con un constructor que reciba `titulo` y sobrescriba `hashCode` y `equals`.
88. **Crea una clase `Estudiante`** que sobrescriba `hashCode`, y tenga un constructor que reciba `nombre` y `matricula`.
89. **Crea una clase `Electrodomestico`** con un constructor que reciba `marca` y `modelo`, y sobrescriba `hashCode`.
90. **Crea una clase `Instrumento`** con un constructor que reciba `tipo`, y sobrescriba `hashCode` y `equals`.

### Excepciones Mixtas

91. **Crea una clase `Producto`** con un método `aplicarDescuento` que maneje una excepción `DescuentoInvalidoException`.
92. **Crea una clase `CuentaBancaria`** con un método `retirar` que maneje `SaldoInsuficienteException`.
93. **Crea una clase `Empleado`** con un método `calcularSueldo` que maneje excepciones de parámetros inválidos.
94. **Crea una clase `Archivo`** con un método `abrirArchivo` que maneje excepciones de archivos.
95. **Crea una clase `Vehiculo`** con un método `acelerar` que maneje excepciones de velocidad.
96. **Crea una clase `Computadora`** con un método `iniciar` que maneje excepciones de sistema.
97. **Crea una clase `CuentaBancaria`** con un método `retirar` que maneje excepciones y sobrescriba `hashCode` y `equals`.
98. **Crea una clase `Estudiante`** con un constructor que lance una excepción si la matrícula es inválida.
99. **Crea una clase `Libro`** con un método `leer` que maneje excepciones de archivo y sobrescriba `hashCode`.
100. **Crea una clase `Pelicula`** con un método `reproducir` que maneje excepciones y sobrescriba `hashCode`.




---



## Profesor: Alejandro Daniel Di Stefano
[GitHub](https://github.com/Drako01) 