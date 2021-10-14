# Informatorio 2021 - Módulo Java

## Ejercicios Complementarios Level 1

### Ejercicio 1

Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”

| Input          | Output              |
| -------------- | ------------------- |
| Obi Wan Kenobi | HOLA Obi Wan Kenobi |

### Ejercicio 2

Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.

> **Input:**<br>
> 5<br>
> 4

> **Output:**<br>
> 5 + 4 = 9<br>
> 5 - 4 = 1<br>
> 5 * 4 = 20<br>
> 5 / 4 = 1<br>
> 5 % 4 = 1

### Ejercicio 3

Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:

> **Input:**<br>
> 5

> **Output:**<br>
> 1<br>
> 1 2<br>
> 1 2 3<br>
> 1 2 3 4<br>
> 1 2 3 4 5

### Ejercicio 4

Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.

> **Input:**<br>
> 5

> **Output:**<br>
> El factorial de 5 es: 120

### Ejercicio 5

Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).

> **Input:**<br>
> 2<br>
> 3

> **Output:**<br>
> 2 x 3 = 6

### Ejercicio 6

Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).

> **Input:**<br>
> 3<br>
> 3

> **Output:**<br>
> 3 elevado a 3 = 27

### Ejercicio 7

Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().

> **Input:**<br>
> informatorio

> **Output:**<br>
> INFORMATORIO

### Ejercicio 8

Crear una aplicación que solicite de entrada los datos de una persona en este orden:

- Nombre y Apellido
- Edad
- Dirección
- Ciudad

Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

> **Input:**<br>
> Homero Simpson<br>
> 48<br>
> Calle Falsa 1234<br>
> Springfield

> **Output:**<br>
> Springfield - Calle Falsa 1234 - 48 - Homero Simpson

### Ejercicio 9

Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.

> **Input:**<br>
> informatorio

> **Output:**<br>
> INFORMATORIO

---
## Ejercicios Complementarios Level 2

### Ejercicio 1

Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking

| Input       | Output      |
| ----------- | ----------- |
| Bariloche   | Bariloche   |
| Córdoba     | Córdoba     |
| Resistencia | Resistencia |

### Ejercicio 2

Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición).

### Ejercicio 3

Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.

> **Ayuda:** ArrayList implementa la interface Collection, existe algún método que me permita hacer la operación sort (mezclar) aleatoriamente? Idem para el reverso

### Ejercicio 4

Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.

> **Ayuda**: ArrayList posee un método para particionar en sub-listas?

### Ejercicio 5

Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.

> **Input:**<br>
> [6, 7, 8, 4, 5]<br>
> [350, 345, 550, 600, 320]
>
> **Nota**: Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.<br>

> **Output:**<br>
> [2100, 2415, 4400, 2400, 1600]<br>
> Total Final: $ 12915

### Ejercicio 6

Se dispone de una colección de Empleados, de cada empleado se conoce:

- Nombre y Apellido
- DNI
- horasTrabajadas
- valorPorHora

Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado.

### Ejercicio 7

Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.

> **Observación:** Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo). Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4

> **Input:**<br>
> fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye<br>
> fizzBuzzFuncion(1,8)

> **Output:**<br>
> [“1”, “Fizz”, “Buzz”, “Fizz”, 5]<br>
> [“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]
