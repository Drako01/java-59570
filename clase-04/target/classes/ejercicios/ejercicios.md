# Clase 04

### Objetos (Encapsulamiento)

1. **Crea una clase `Persona`** con atributos `nombre` y `edad` y un método para imprimir los datos.
2. **Crea un objeto `Coche`** con atributos `marca`, `modelo` y `año` e imprime los valores.
3. **Crea una clase `Libro`** con atributos `titulo` y `autor` y un método que imprima la información del libro.
4. **Crea una clase `CuentaBancaria`** con atributos `saldo` y `titular`, y un método para mostrar el saldo.
5. **Crea una clase `Producto`** con atributos `nombre` y `precio`, y un método para calcular el precio con impuestos.
6. **Crea un objeto `Alumno`** con atributos `nombre`, `matricula` y `promedio`, e imprime los datos del alumno.
7. **Crea una clase `Animal`** con atributos `especie` y `edad`, y un método para mostrar la especie del animal.
8. **Crea una clase `Punto`** con atributos `x` y `y` que represente un punto en un plano cartesiano.
9. **Crea una clase `Vehiculo`** con atributos `velocidad` y `combustible`, y un método que disminuya el combustible.
10. **Crea una clase `Empleado`** con atributos `nombre` y `sueldo`, y un método para calcular el sueldo anual.

### Métodos

11. **Crea una clase `Calculadora`** con un método `sumar` que sume dos números enteros.
12. **Crea un método en una clase `Persona`** que salude con el nombre de la persona.
13. **Crea un método `restar` en una clase `Calculadora`** que reste dos números enteros.
14. **Crea una clase `Rectangulo`** con un método que calcule el área dada su base y altura.
15. **Crea un método en una clase `Estudiante`** que calcule la calificación promedio de tres materias.
16. **Crea una clase `Coche`** con un método que calcule el combustible necesario para recorrer una distancia.
17. **Crea un método en una clase `Tienda`** que calcule el total de una compra aplicando un descuento.
18. **Crea un método `multiplicar` en una clase `Calculadora`** que multiplique dos números enteros.
19. **Crea un método en una clase `Persona`** que imprima si la persona es mayor de edad o no.
20. **Crea una clase `Triangulo`** con un método que calcule el área dado su base y altura.

### Variables (Alcance)

21. **Crea una variable local** dentro de un método en una clase `Calculadora` que sume dos números.
22. **Crea una variable de instancia** en una clase `Persona` y muestra cómo accedes a ella desde los métodos de la clase.
23. **Crea una variable de clase (estática)** en una clase `Contador` para contar cuántos objetos de esa clase se han creado.
24. **Define una variable local en un método `multiplicar`** de una clase `Calculadora`.
25. **Crea una clase `Banco`** que tenga una variable de clase `interes` y un método para calcular los intereses.
26. **Crea un método en una clase `Rectangulo`** que use variables locales para calcular el área.
27. **Crea una clase `Empleado`** donde los atributos `nombre` y `sueldo` sean variables de instancia.
28. **Crea una variable de clase `tasaInteres`** en una clase `CuentaBancaria` y un método para calcular intereses.
29. **Crea una variable local en un método `calcularEdad`** de una clase `Persona` que calcule la edad a partir del año de nacimiento.
30. **Crea una clase `Producto`** que tenga una variable de instancia `nombre` y una variable local en un método `calcularImpuesto`.

### Constantes

31. **Crea una constante `PI`** en una clase `Circulo` y usa esa constante para calcular el área de un círculo.
32. **Crea una clase `Tienda`** con una constante `DESCUENTO` y úsala en un método para calcular el precio final.
33. **Crea una constante `VELOCIDAD_LUZ`** en una clase `Fisica` y muestra su valor en un método.
34. **Define una constante `IVA`** en una clase `Factura` y úsala en un método para calcular el total con impuestos.
35. **Crea una constante `GRAVEDAD`** en una clase `Fisica` y úsala para calcular la fuerza gravitatoria.
36. **Define una constante `SALARIO_MINIMO`** en una clase `Empleado` y úsala para validar el sueldo.
37. **Crea una constante `RADIO_TIERRA`** en una clase `Geografia` y úsala en un método para calcular la circunferencia.
38. **Define una constante `HORAS_TRABAJO`** en una clase `Empleado` y úsala para calcular el sueldo semanal.
39. **Crea una clase `Vehiculo`** con una constante `MAX_VELOCIDAD` y un método para verificar si un vehículo supera el límite.
40. **Crea una constante `MESES_ANO`** en una clase `Calendario` y úsala en un método que calcule cuántos meses faltan para fin de año.

### Control de Acceso (Modificadores de Acceso)

41. **Crea una clase `CuentaBancaria`** con atributos `saldo` y `titular` privados.
42. **Crea una clase `Persona`** donde el atributo `nombre` sea `private` y solo accesible a través de un método público.
43. **Define un atributo protegido `velocidad`** en una clase `Vehiculo` y accede a él desde otro método de la misma clase.
44. **Crea una clase `Empleado`** con un atributo `sueldo` privado y un método público que permita cambiarlo.
45. **Define un atributo `matricula`** en una clase `Estudiante` como privado y crea un método público para acceder a él.
46. **Haz que un atributo `precio`** en una clase `Producto` sea `private` y define métodos públicos para leerlo y modificarlo.
47. **Crea una clase `Coche`** donde el atributo `combustible` sea privado, y accedido solo mediante métodos públicos.
48. **Crea una clase `Libro`** donde el atributo `autor` sea `private` y define un método para cambiarlo.
49. **Define un método `mostrarSaldo`** en una clase `CuentaBancaria` como `public` para acceder a un atributo `saldo` privado.
50. **Crea una clase `Casa`** con un atributo `direccion` privado y un método público que lo retorne.

### Getters and Setters

51. **Crea una clase `Persona`** con atributos `nombre` y `edad` y define sus getters y setters.
52. **Crea una clase `Coche`** con atributos `marca` y `modelo`, y añade métodos `get` y `set` para ambos.
53. **Crea una clase `Libro`** con un atributo `titulo` y usa un getter para devolver el título.
54. **Define getters y setters** para los atributos `saldo` y `titular` en una clase `CuentaBancaria`.
55. **Crea una clase `Empleado`** con un atributo `sueldo` y define un setter que valide si el sueldo es positivo.
56. **Crea una clase `Estudiante`** con un atributo `calificacion` y usa getters y setters para modificarlo.
57. **Define un getter para el atributo `nombre`** en una clase `Persona` y un setter que valide si el nombre no está vacío.
58. **Crea una clase `Producto`** con un atributo `precio` y define métodos `getPrecio` y `setPrecio`.
59. **Define getters y setters** para los atributos `velocidad` y `combustible` en una clase `Vehiculo`.
60. **Crea una clase `Factura`** con un atributo `total` y define un setter que valide que el total es mayor que 0.

### Métodos Estáticos

61. **Crea una clase `Calculadora`** con un método estático `sumar` que sume dos números enteros.
62. **Define un método estático `restar`** en una clase `Calculadora` que reste dos números.
63. **Crea un método estático `multiplicar`** en una clase `Calculadora` que multiplique dos números.
64. **Crea una clase `Matematica`** con un método estático que calcule el cuadrado de un número.
65. **Crea una clase `Conversor`** con un método estático para convertir de grados Celsius a Fahrenheit.
66. **Define un método estático en una clase `Contador`** que cuente cuántos objetos se han creado.
67. **Crea una clase `

Geometria`** con un método estático que calcule el área de un círculo usando una constante `PI`.
68. **Crea una clase `ConversorMoneda`** con un método estático que convierta dólares a euros.
69. **Define un método estático en una clase `Triangulo`** que calcule el área dado su base y altura.
70. **Crea una clase `Banco`** con un método estático que calcule los intereses sobre una cantidad de dinero.

### Parámetros de un Método

71. **Crea un método `imprimirNombre`** en una clase `Persona` que reciba un parámetro `nombre`.
72. **Crea un método `calcularArea`** en una clase `Rectangulo` que reciba parámetros de `base` y `altura`.
73. **Define un método `sumar`** en una clase `Calculadora` que reciba dos parámetros enteros.
74. **Crea un método `calcularEdad`** en una clase `Persona` que reciba el parámetro `añoDeNacimiento` y devuelva la edad.
75. **Define un método `restar`** en una clase `Calculadora` que reciba dos parámetros y retorne la resta.
76. **Crea un método `calcularDescuento`** en una clase `Tienda` que reciba el `precio` y el `descuento` como parámetros.
77. **Crea un método `esMayorDeEdad`** en una clase `Persona` que reciba un parámetro `edad` y retorne un valor booleano.
78. **Crea un método `multiplicar`** en una clase `Calculadora` que reciba dos parámetros y retorne el resultado.
79. **Define un método `calcularPrecioFinal`** en una clase `Producto` que reciba el `precio` y el `descuento`.
80. **Crea un método `calcularCombustible`** en una clase `Vehiculo` que reciba la `distancia` y el `consumo`.

### Tipos de Retorno

81. **Crea un método `calcularSuma`** en una clase `Calculadora` que retorne un número entero.
82. **Crea un método `getNombre`** en una clase `Persona` que retorne el nombre de la persona.
83. **Crea un método `calcularArea`** en una clase `Rectangulo` que retorne un valor `double` para el área.
84. **Crea un método `esMayorDeEdad`** en una clase `Persona` que retorne un valor booleano.
85. **Crea un método `calcularEdad`** en una clase `Persona` que retorne la edad de la persona en enteros.
86. **Crea un método `obtenerPromedio`** en una clase `Estudiante` que retorne un valor `double`.
87. **Crea un método `getPrecio`** en una clase `Producto` que retorne el precio como un número `double`.
88. **Crea un método `getSaldo`** en una clase `CuentaBancaria` que retorne el saldo de la cuenta.
89. **Crea un método `calcularCombustible`** en una clase `Coche` que retorne la cantidad de combustible necesaria.
90. **Crea un método `calcularDescuento`** en una clase `Tienda` que retorne el total con descuento aplicado.

### Ejercicios Combinados

91. **Crea una clase `Calculadora`** con métodos `sumar`, `restar`, `multiplicar`, y `dividir`.
92. **Crea una clase `Persona`** que tenga los atributos `nombre`, `edad`, y un método `saludar`.
93. **Crea una clase `Producto`** con atributos `nombre` y `precio`, y métodos `calcularPrecioConDescuento`.
94. **Crea una clase `CuentaBancaria`** con atributos `saldo` y `titular`, y métodos para `depositar` y `retirar`.
95. **Crea una clase `Vehiculo`** con atributos `marca` y `modelo`, y métodos para `acelerar` y `frenar`.
96. **Crea una clase `Empleado`** con atributos `nombre` y `sueldo`, y un método `calcularSueldoAnual`.
97. **Crea una clase `Estudiante`** con atributos `nombre`, `matricula`, y un método `calcularPromedio`.
98. **Crea una clase `Coche`** con atributos `marca` y `combustible`, y un método `calcularCombustible` para una distancia.
99. **Crea una clase `Triangulo`** con atributos `base` y `altura`, y un método `calcularArea`.
100. **Crea una clase `Tienda`** con un atributo `descuento` y un método `calcularTotal` para aplicar descuentos en productos.



---



## Profesor: Alejandro Daniel Di Stefano
[GitHub](https://github.com/Drako01) 
