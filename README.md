# 🗺️ Navegación por un mapa

Proyecto sencillo en **Java** para practicar estructuras de control mediante la navegación de un personaje por un mapa.

La idea es que el personaje pueda desplazarse por el escenario **sin atravesar las paredes**, obligando a comprobar en cada movimiento si la nueva posición es válida.

## 🎯 Objetivo didáctico

Este proyecto está pensado para trabajar principalmente:

- **Condicionales** (`if`, `else`, etc.).
- **Bucles** para mantener el programa en ejecución mientras el usuario se desplaza por el mapa.
- Validación de datos y decisiones en función del estado del programa.
- Manejo de coordenadas y posiciones dentro de una matriz/mapa.
- Descomposición de un problema en pasos pequeños.

La actividad busca que el alumnado practique la lógica de programación en un contexto visual y fácil de entender: **moverse por un mapa respetando sus límites y obstáculos**.

## 🎮 Funcionamiento

El programa representa un mapa formado por distintas posiciones.

En él encontramos:

- zonas por las que el personaje puede desplazarse;
- paredes u obstáculos que no se pueden atravesar;
- una posición actual del personaje.

En cada turno, el programa debe:

1. Mostrar el estado del mapa.
2. Pedir al usuario un movimiento.
3. Calcular la posición a la que quiere desplazarse.
4. Comprobar si ese movimiento es válido.
5. Mover al personaje únicamente si no colisiona con una pared.
6. Repetir el proceso.

La lógica básica que se pretende trabajar puede resumirse así:

```text
mientras el juego continúe
    mostrar mapa
    pedir movimiento

    si el movimiento es válido
        mover personaje
    si no
        mantener la posición
fin mientras
```

## 🧠 Conceptos que se trabajan

### Condicionales

Antes de realizar un movimiento hay que tomar una decisión:

```java
if (movimientoValido) {
    // mover al personaje
} else {
    // no permitir el movimiento
}
```

El alumnado debe comprobar, entre otras cosas, que el personaje no intente entrar en una pared.

### Bucles

El programa debe permitir realizar movimientos sucesivos, por lo que la navegación se desarrolla dentro de un bucle.

Por ejemplo:

```java
while (jugando) {
    // mostrar mapa
    // leer movimiento
    // comprobar colisión
    // actualizar posición
}
```

## 🚧 Colisiones

Una de las partes principales de la práctica consiste en decidir si una posición es transitable.

Antes de modificar las coordenadas del personaje se debe comprobar el contenido de la casilla de destino.

```text
posición actual
      ↓
calcular nueva posición
      ↓
¿hay una pared?
   ↙       ↘
  sí        no
   ↓         ↓
no mover    mover
```

Esto permite trabajar una idea importante en programación:

> **Primero comprobamos si una acción es válida y después modificamos el estado del programa.**

## ▶️ Ejecutar el proyecto

El proyecto utiliza **Maven** y está configurado para **Java 25**.

Clona el repositorio:

```bash
git clone https://github.com/jsotera/prom-26-27-ut-3-mapa.git
cd prom-26-27-ut-3-mapa
```

También puedes abrir directamente el proyecto desde IntelliJ IDEA u otro IDE compatible con Maven y ejecutar la clase principal.

## 📁 Estructura

```text
prom-26-27-ut-3-mapa/
├── src/
│   └── main/
│       └── java/
│           └── edu/
│               └── masanz/
│                   └── da/
│                       └── ut3/
├── pom.xml
└── README.md
```

## 🧩 Propuesta de trabajo para el alumnado

El objetivo no es únicamente conseguir que el personaje se mueva, sino razonar qué debe ocurrir antes de cada movimiento.

Algunas preguntas que pueden guiar la actividad:

- ¿Cómo sabemos dónde está el personaje?
- ¿Qué coordenada cambia al movernos hacia arriba?
- ¿Y al movernos hacia la izquierda?
- ¿Cómo podemos saber qué hay en la siguiente casilla?
- ¿Qué condición impide atravesar una pared?
- ¿Qué ocurre si el movimiento no es válido?
- ¿Qué estructura permite seguir pidiendo movimientos?
- ¿Cómo podemos terminar el programa?

## 🚀 Posibles ampliaciones

Una vez resuelta la navegación básica, se pueden añadir nuevos retos:

- Añadir una **casilla de salida** y detectar cuándo se alcanza.
- Contar el número de movimientos.
- Limitar el número máximo de movimientos.
- Añadir distintos tipos de terreno.
- Incorporar objetos que se puedan recoger.
- Añadir puertas y llaves.
- Crear varios mapas.
- Permitir reiniciar la partida.
- Detectar movimientos fuera de los límites del mapa.
- Buscar automáticamente un camino hasta la salida.

## 👨‍🏫 Contexto

Material preparado como ejercicio educativo para trabajar **bucles y estructuras condicionales en Java** mediante un problema sencillo de navegación y detección de colisiones.

---

Repositorio: [jsotera/prom-26-27-ut-3-mapa](https://github.com/jsotera/prom-26-27-ut-3-mapa)
