# -_programa_java_promedio_y_media_aritmetica_- :.

<img width="1278" height="1079" alt="image" src="https://github.com/user-attachments/assets/1503ee3c-42d4-465f-bbb3-52ba2b48867c" />

```

# Programa Java - Promedio y Media Aritmética

Programa **básico de consola en Java para IntelliJ IDEA** que permite ingresar una cantidad de números por teclado y calcular su **promedio o media aritmética**.

## Características

El programa permite:

* Ingresar por teclado la cantidad de números.
* Ingresar cada número mediante `Scanner`.
* Calcular la suma de los números.
* Calcular el **promedio (media aritmética)**.
* Mostrar los resultados en consola.
* Utilizar un ciclo `for`.
* Trabajar con números decimales mediante `double`.

---

## Tecnologías utilizadas

* **Java**
* **IntelliJ IDEA**
* Clase `Scanner`
* Ciclo `for`
* Tipo de dato `double`

---

## Estructura del proyecto

```text
PromedioMedia/
└── src/
    └── Main.java
```

---

# Código completo

## `Main.java`

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Solicitar la cantidad de números
        System.out.print("¿Cuántos números desea ingresar?: ");
        int cantidad = teclado.nextInt();

        double suma = 0;

        // Entrada de los números
        for (int i = 1; i <= cantidad; i++) {

            System.out.print("Ingrese el número " + i + ": ");
            double numero = teclado.nextDouble();

            suma = suma + numero;
        }

        // Calcular la media o promedio
        double promedio = suma / cantidad;

        // Mostrar resultados
        System.out.println();
        System.out.println("================================");
        System.out.println("       RESULTADO");
        System.out.println("================================");
        System.out.println("Cantidad de números: " + cantidad);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Media aritmética: " + promedio);
        System.out.println("================================");

        teclado.close();
    }
}
```

---

# Explicación del programa

### 1. Importar `Scanner`

```java
import java.util.Scanner;
```

Permite utilizar la clase `Scanner` para ingresar información mediante el teclado.

---

### 2. Crear el objeto `Scanner`

```java
Scanner teclado = new Scanner(System.in);
```

Se crea el objeto `teclado`, que permitirá capturar los datos introducidos por el usuario.

---

### 3. Solicitar la cantidad de números

```java
System.out.print("¿Cuántos números desea ingresar?: ");
int cantidad = teclado.nextInt();
```

El usuario indica cuántos números desea ingresar.

Por ejemplo:

```text
¿Cuántos números desea ingresar?: 5
```

---

### 4. Crear la variable para la suma

```java
double suma = 0;
```

La variable `suma` almacenará el total acumulado de los números ingresados.

---

### 5. Utilizar el ciclo `for`

```java
for (int i = 1; i <= cantidad; i++) {

    System.out.print("Ingrese el número " + i + ": ");
    double numero = teclado.nextDouble();

    suma = suma + numero;
}
```

El ciclo `for` permite repetir la entrada de números tantas veces como haya indicado el usuario.

Por ejemplo, si la cantidad es `5`, el ciclo se ejecutará cinco veces.

---

### 6. Calcular el promedio

```java
double promedio = suma / cantidad;
```

El promedio se obtiene dividiendo la suma de todos los números entre la cantidad de números ingresados.

---

# Fórmula de la media aritmética

La fórmula es:

```text
Media = Suma de todos los números / Cantidad de números
```

Matemáticamente:

```text
          x₁ + x₂ + x₃ + ... + xₙ
x̄ = -------------------------------
                    n
```

Donde:

* `x̄` = media aritmética o promedio.
* `x₁, x₂, x₃...` = valores ingresados.
* `n` = cantidad de valores.

---

# Ejemplo de ejecución

```text
¿Cuántos números desea ingresar?: 5

Ingrese el número 1: 10
Ingrese el número 2: 20
Ingrese el número 3: 30
Ingrese el número 4: 40
Ingrese el número 5: 50

================================
       RESULTADO
================================
Cantidad de números: 5
Suma: 150.0
Promedio: 30.0
Media aritmética: 30.0
================================
```

## Cálculo

Los números ingresados son:

```text
10, 20, 30, 40, 50
```

La suma es:

```text
10 + 20 + 30 + 40 + 50 = 150
```

La cantidad de números es:

```text
5
```

Por lo tanto:

```text
Media = 150 / 5
```

Resultado:

```text
Media = 30
```

---

# Ejemplo con 3 valores

También podemos utilizar los valores:

```text
2, 4, 7
```

La suma es:

```text
2 + 4 + 7 = 13
```

La cantidad de valores es:

```text
3
```

Entonces:

```text
Media = 13 / 3
```

Resultado:

```text
Media = 4.333333333333333
```

O expresado como fracción:

```text
       13
Media = --
        3
```

Por lo tanto:

```text
Media = 4 1/3
```

---

# Conceptos utilizados

## `Scanner`

Permite leer información desde el teclado.

```java
Scanner teclado = new Scanner(System.in);
```

## `nextInt()`

Permite leer un número entero:

```java
int cantidad = teclado.nextInt();
```

## `nextDouble()`

Permite leer un número decimal:

```java
double numero = teclado.nextDouble();
```

## Ciclo `for`

Permite repetir una operación determinada cantidad de veces:

```java
for (int i = 1; i <= cantidad; i++) {
    // instrucciones
}
```

## `double`

Se utiliza para almacenar números que pueden contener decimales:

```java
double suma = 0;
double promedio;
double numero;
```

---

# Resumen

La **media aritmética** y el **promedio** representan el mismo cálculo:

```text
Media = suma de todos los números ÷ cantidad de números
```

El programa utiliza:

```text
Scanner
   ↓
Entrada de datos
   ↓
Ciclo for
   ↓
Suma de números
   ↓
Cálculo del promedio
   ↓
Resultado en consola
```

> **Nota:** Para una versión más robusta, se puede agregar una validación para impedir que el usuario ingrese `0` como cantidad de números,
> evitando una división entre cero . 
:. . / .
