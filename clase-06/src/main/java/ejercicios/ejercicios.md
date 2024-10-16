# Clase 06
### Ejercicios de Objetos, Métodos, Sobrecarga, y Control de Acceso

1. Crea una clase `Producto` con atributos `nombre` y `precio`. Agrega métodos para modificar y obtener sus valores. Implementa los métodos `getNombre()`, `setNombre()`, `getPrecio()`, y `setPrecio()`.
   
2. Implementa una clase `Persona` con atributos `nombre` y `edad`. Utiliza encapsulamiento para proteger el acceso a los atributos, y agrega métodos `get` y `set` para ambos.

3. Sobrecarga un método `sumar()` en una clase `Calculadora` que acepte enteros, doubles, y floats.

4. Crea una clase `Circulo` con un método `calcularArea()` que calcule el área según el radio. Sobrecarga el método para aceptar diferentes tipos de valores (int, double).

5. Crea una clase `Rectangulo` con atributos `base` y `altura`, y un método `calcularArea()`. Implementa sobrecarga para aceptar diferentes tipos de números como parámetros.

6. Implementa una clase `Persona` con un constructor que acepte parámetros para inicializar los atributos `nombre` y `edad`. Sobrecarga el constructor para aceptar diferentes combinaciones de atributos.

7. Implementa un método `compararEdades()` en la clase `Persona`, que acepte otra instancia de `Persona` y devuelva `true` si tienen la misma edad, y `false` en caso contrario.

8. Crea una clase `CalculadoraAvanzada` con métodos estáticos para sumar, restar, multiplicar y dividir dos números enteros. Sobrecarga los métodos para aceptar diferentes tipos de datos (int, double, float).

9. Crea una clase `Animal` con un método `hacerSonido()`. Luego, crea clases `Perro` y `Gato` que hereden de `Animal` y sobrescriban el método `hacerSonido()` con sonidos específicos.

10. Implementa una clase `Vehiculo` con un método `arrancar()`. Crea subclases `Auto` y `Moto`, y sobrescribe el método `arrancar()` con comportamientos diferentes.

### Ejercicios de Herencia, Polimorfismo, Overloading y Overriding

11. Crea una clase base `Empleado` con un método `calcularSalario()`. Crea subclases `EmpleadoTiempoCompleto` y `EmpleadoMedioTiempo`, y sobrescribe el método para que calculen el salario según el tipo de empleado.

12. Implementa una clase `InstrumentoMusical` con un método `tocar()`. Crea subclases `Guitarra` y `Piano` que sobrescriban este método con un comportamiento específico para cada instrumento.

13. Crea una clase `FiguraGeometrica` con un método `calcularArea()`. Luego crea clases `Cuadrado` y `Triangulo`, que sobrescriban el método `calcularArea()` para calcular el área de la figura correspondiente.

14. Crea una clase `Vehiculo` con un método `mover()`. Crea clases `Bicicleta` y `Coche`, que sobrescriban el método `mover()` para describir su forma de moverse.

15. Implementa una clase `Empleado` con un método `trabajar()`. Sobrescribe el método en las subclases `Desarrollador` y `Diseñador` para que representen sus respectivas tareas.

16. Crea una clase `Cliente` con un atributo `saldo`. Implementa un método `retirarDinero()` que permita retirar una cantidad. Sobrecarga el método para que acepte diferentes tipos de parámetros (int, double).

17. Crea una clase `Estudiante` con un método `estudiar()`. Sobrescribe este método en subclases como `EstudiantePrimaria` y `EstudianteSecundaria` para simular diferentes formas de estudiar.

18. Sobrecarga un constructor en la clase `Producto` para que permita crear productos con solo el nombre, o con el nombre y el precio.

19. Crea una clase `Banco` con un método `crearCuenta()`. Sobrecarga este método para permitir la creación de diferentes tipos de cuentas (cuenta corriente, cuenta de ahorro).

20. Implementa una clase `Empleado` con un método `trabajar()`. Crea subclases `Gerente` y `Programador`, y sobrescribe el método `trabajar()` para que describan las tareas específicas de cada tipo de empleado.

### Ejercicios de Hashcode, Equals, y Excepciones

21. Crea una clase `Persona` con un método `equals()` que compare dos personas por su nombre y edad.

22. Implementa el método `hashCode()` en la clase `Producto` para generar un código hash basado en el nombre y el precio.

23. Crea una clase `Libro` con atributos `titulo` y `autor`. Sobrescribe los métodos `hashCode()` y `equals()` para comparar libros por su título y autor.

24. Implementa una clase `Empleado` con métodos `equals()` y `hashCode()` para comparar empleados por su número de identificación.

25. Crea una clase `CuentaBancaria` con un método `retirar()` que lance una excepción si el saldo es insuficiente.

26. Implementa una clase `Division` que realice una división entre dos números y maneje la excepción `ArithmeticException` si se intenta dividir por cero.

27. Crea una clase `ArrayUtil` con un método `obtenerElemento()` que reciba un array y un índice, y maneje la excepción `ArrayIndexOutOfBoundsException` si el índice es inválido.

28. Crea una clase `Calculadora` con un método `dividir()` que maneje excepciones si se intenta dividir por cero.

29. Implementa una clase `CajeroAutomatico` que lance una excepción personalizada `SaldoInsuficienteException` si el saldo es menor al monto solicitado.

30. Crea una clase `TransferenciaBancaria` con un método `realizarTransferencia()` que maneje la excepción `NullPointerException` si la cuenta de destino es nula.

### Ejercicios de Interfaces y Clases Abstractas

31. Define una interfaz `Operable` con el método `operar()`. Luego, crea clases `Suma` y `Resta` que implementen esta interfaz y realicen las operaciones correspondientes.

32. Crea una interfaz `Vehiculo` con los métodos `arrancar()` y `detener()`. Implementa esta interfaz en clases `Auto` y `Moto`.

33. Define una interfaz `Electrodomestico` con el método `encender()`. Crea clases `Television` y `Lavadora` que implementen la interfaz.

34. Crea una clase abstracta `Animal` con un método abstracto `hacerSonido()`. Luego, crea subclases `Perro` y `Gato` que sobrescriban el método.

35. Implementa una interfaz `Pago` con un método `realizarPago()`. Crea clases `PagoConTarjeta` y `PagoConEfectivo` que implementen este método.

36. Crea una clase abstracta `Figura` con un método abstracto `calcularArea()`. Crea subclases `Circulo` y `Cuadrado` que sobrescriban este método.

37. Define una interfaz `Instrumento` con el método `tocar()`. Implementa esta interfaz en clases `Guitarra` y `Piano`.

38. Crea una clase abstracta `Empleado` con un método abstracto `calcularSalario()`. Crea subclases `EmpleadoTiempoCompleto` y `EmpleadoMedioTiempo` que implementen el método.

39. Define una interfaz `Transporte` con métodos `mover()` y `detener()`. Implementa esta interfaz en clases `Bicicleta` y `Coche`.

40. Crea una clase abstracta `Producto` con un método abstracto `calcularPrecio()`. Luego, crea subclases `ProductoElectronico` y `ProductoAlimenticio` que implementen el método.

### Ejercicios de Sobrecarga y Sobrescritura (Overloading y Overriding)

41. Sobrecarga el método `imprimirDetalles()` en la clase `Persona` para aceptar diferentes cantidades de parámetros.

42. Crea una clase `Factura` con un método `calcularTotal()`. Sobrecarga este método para calcular el total de diferentes formas (con impuestos, sin impuestos, con descuentos).

43. Implementa una clase `Empleado` con un método `trabajar()`. Sobrecarga este método para aceptar un parámetro que indique el número de horas trabajadas.

44. Crea una clase `Estudiante` con un método `estudiar()`. Sobrecarga el método para aceptar diferentes tipos de materias.

45. Implementa una clase `CuentaBancaria` con un método `depositar()`. Sobrecarga este método para permitir diferentes tipos de depósitos (efectivo, cheque).

46. Crea una clase `OrdenCompra` con un método `calcularTotal()`. Sobrecarga este método para aceptar diferentes formas de pago.

47. Sobrecarga el constructor de la clase `Vehiculo` para que acepte diferentes parámetros como marca, modelo y año.



48. Implementa una clase `Cliente` con un método `realizarCompra()`. Sobrecarga el método para aceptar diferentes formas de pago.

49. Crea una clase `Producto` con un método `aplicarDescuento()`. Sobrecarga el método para aplicar diferentes tipos de descuentos (porcentaje, cantidad fija).

50. Implementa una clase `Banco` con un método `transferir()`. Sobrecarga este método para aceptar diferentes tipos de cuentas.


---



## Profesor: Alejandro Daniel Di Stefano
[GitHub](https://github.com/Drako01) 

