# Operadores y Estructuras de Decisión en Java

Taller práctico de Java sobre operadores, estructuras de decisión (`if-else`, operador ternario y `switch`) y depuración de código, desarrollado en IntelliJ IDEA.

## Requisitos

| Herramienta | Versión |
|---|---|
| Java | OpenJDK 27 |
| IDE | IntelliJ IDEA |
| Sistema de construcción | Maven |

El `switch` moderno con flecha (`->`) requiere Java 14 o superior, así que funciona sin problema con OpenJDK 27.

## Estructura del proyecto

```
Operadores y Estructuras de Decisión en Java
├── Captura Tabla.png
├── README.md
├── Debug1_1_antes_bucle_infinito.png
├── Debug1_2_debugger_breakpoint_variables.png
├── Debug1_3_debugger_F8_contador_no_cambia.png
├── Java
│   ├── seccion1
│   │   └── Seccion1Calentamiento.java
│   ├── seccion2
│   │   ├── Seccion2Reto1.java
│   │   ├── Seccion2Reto2.java
│   │   ├── Seccion2Reto3.java
│   │   └── Seccion2Ternario.java
│   ├── seccion3
│   │   ├── Seccion3SwitchTradicional.java
│   │   └── Seccion3SwitchModerno.java
│   ├── seccion4
│   │   └── Seccion4RetoIntegrador.java
│   └── seccion5
│       ├── ErrorAsignacion.java
│       ├── ErrorComparacionString.java
│       ├── ErrorFallThrough.java
│       └── ErrorPrecision.java
└── TallerEstructurasRepetitivas
    ├── seccion1
    │   ├── Ejercicio1_1.java
    │   └── Ejercicio1_2.java
    ├── seccion2
    │   ├── Ejercicio2_1.java
    │   └── Ejercicio2_2.java
    ├── seccion3
    │   ├── Ejercicio3_1.java
    │   └── Ejercicio3_2.java
    ├── seccion4
    │   ├── Ejercicio4_1.java
    │   └── Ejercicio4_2.java
    ├── seccion5
    │   └── EjercicioIntegrador.java
    └── seccion6
        ├── Debug1.java
        ├── Debug2.java
        └── Debug3.java
```

---

# Taller: Estructuras Repetitivas y Sentencias de Ramificación en Java

Taller práctico de Java sobre estructuras de control repetitivas (`while`, `do-while`, `for`), sentencias de ramificación (`break`, `continue`) y depuración de código con el debugger de IntelliJ IDEA. Se encuentra en la carpeta `TallerEstructurasRepetitivas`.

La guía exige Java 17 LTS o superior, así que OpenJDK 27 cumple sin problema.

## Contenido por sección

| Sección | Tema | Clases |
|---|---|---|
| 1 | Bucle `while` | `Ejercicio1_1` (contador y acumulador con centinela -99), `Ejercicio1_2` (procesador de transacciones con límite de $1'000.000) |
| 2 | Bucle `do-while` | `Ejercicio2_1` (validación de PIN de 4 dígitos), `Ejercicio2_2` (menú bancario con `switch`) |
| 3 | Bucle `for` | `Ejercicio3_1` (tabla de multiplicar y conteo regresivo), `Ejercicio3_2` (factorial y patrón triangular) |
| 4 | `break` y `continue` | `Ejercicio4_1` (primer número divisible entre 7 y 11), `Ejercicio4_2` (pares que no son múltiplos de 5) |
| 5 | Reto integrador | `EjercicioIntegrador` (simulador de control de inventario) |
| 6 | Depuración | `Debug1`, `Debug2`, `Debug3` |

## Reto integrador

`EjercicioIntegrador` combina todas las estructuras del taller:

- `do-while`: menú principal (registrar lote, ver estado del almacén, salir).
- `for`: itera exactamente N veces, una por cada producto del lote.
- `while`: valida que el precio y la cantidad sean mayores a cero.
- `continue`: omite los productos descontinuados.
- `break`: aborta el lote cuando se supera la capacidad máxima de 500 unidades.

## Depuración

| Clase | Error encontrado | Corrección |
|---|---|---|
| `Debug1` | Bucle infinito: falta actualizar la variable de control | Agregar `contador++;` dentro del `while` |
| `Debug2` | Error de desfase por uno: se usa `<` en lugar de `<=` | Cambiar la condición a `i <= totalElementos` |
| `Debug3` | `break` termina el ciclo en la primera iteración | Reemplazar `break` por `continue` |

Pasos usados en el debugger de IntelliJ:

1. Poner un breakpoint (círculo rojo) en la línea donde inicia el bucle.
2. Ejecutar en modo depuración con `Shift + F9`.
3. Revisar los valores en la pestaña **Variables**.
4. Avanzar paso a paso con `F8` (Step Over).