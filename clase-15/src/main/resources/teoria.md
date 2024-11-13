
### ¿Qué es `String.format`?

La función `String.format` nos permite crear cadenas de texto de manera flexible, insertando variables en un texto base. 
En este caso, queremos construir un mensaje que incluya la fecha, la hora y el número de invocaciones.

### Desglose del Formato del Mensaje

En la primera parte, dentro de `String.format`, escribimos la estructura del mensaje como plantilla:

- `"Fecha Actual: %s %s %d, %d\nHora: %s\nNúmero de invocaciones: %d"`

Los símbolos `%` seguidos de una letra (`%s`, `%d`) representan "espacios reservados" donde se colocarán las variables.

### Explicación de Cada Símbolo

- `%s`: Espacio reservado para una **cadena de texto** (String).
- `%d`: Espacio reservado para un **número entero** (int).

### Plantilla del Mensaje Desglosada

La plantilla es:

1. `"Fecha Actual: %s %s %d, %d"` – Primera línea del mensaje:
   - `%s`: Será reemplazado por el **día de la semana** (`fechaActual.getDayOfWeek()`), por ejemplo, "Thursday".
   - `%s`: Será reemplazado por el **mes** (`fechaActual.getMonth()`), como "11".
   - `%d`: Será reemplazado por el **día del mes** (`fechaActual.getDay()`), como "14".
   - `%d`: Será reemplazado por el **año** (`fechaActual.getYear()`), como "2024".

   Resultado ejemplo: `"Fecha Actual: Thursday 11 14, 2024"`

2. `"\nHora: %s"` – Segunda línea del mensaje:
   - `%s`: Será reemplazado por la **hora** (`fechaActual.getTime()`), por ejemplo, "13:13".

   Resultado ejemplo: `"Hora: 13:13"`

3. `"\nNúmero de invocaciones: %d"` – Tercera línea del mensaje:
   - `%d`: Será reemplazado por el **contador de invocaciones** (`invocacionesCount`), como "1".

   Resultado ejemplo: `"Número de invocaciones: 1"`

### Resultado Final de Ejemplo

Si los datos fueran:
- Día de la semana: "Thursday"
- Mes: "11"
- Día: "14"
- Año: "2024"
- Hora: "13:13"
- Número de invocaciones: "1"

El resultado final sería:

```
Fecha Actual: Thursday 11 14, 2024
Hora: 13:13
Número de invocaciones: 1
```
