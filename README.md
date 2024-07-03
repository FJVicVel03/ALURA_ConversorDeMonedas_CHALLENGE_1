# Conversor de Monedas

Este es un proyecto en Java que permite la conversión de monedas utilizando una API. Cuenta con un menú sencillo en consola donde puedes ingresar las iniciales de la moneda de origen y la moneda de destino para realizar la conversión. Además, cada conversión se guarda en un historial que puedes consultar en cualquier momento.

## Características

- Conversión de monedas en tiempo real utilizando una API.
- Menú interactivo en consola para realizar conversiones.
- Historial de conversiones accesible para consultas posteriores.

## Requisitos

- Java 8 o superior.
- Conexión a Internet para acceder a la API de conversión de monedas.

## Instalación

1. Clona este repositorio en tu máquina local:

    ```sh
    git clone https://github.com/FJVicVel03/ALURA_ConversorDeMonedas_CHALLENGE_1.git
    ```

2. Navega al directorio del proyecto:

    ```sh
    cd api-exchange-br
    ```

3. Compila el proyecto:

    ```sh
    javac -d bin src/*.java
    ```

4. Ejecuta el proyecto:

    ```sh
    java -cp bin Main
    ```

## Uso

1. Al iniciar el programa, se te presentará un menú en la consola.
2. Ingresa las iniciales de la moneda de origen (por ejemplo, USD, EUR).
3. Ingresa las iniciales de la moneda de destino (por ejemplo, MXN, GBP).
4. La conversión se realizará utilizando la API y se mostrará el resultado en la consola.
5. Las conversiones realizadas se guardarán en un historial que puedes consultar seleccionando la opción correspondiente en el menú.

## Ejemplo

Bienvenido al Conversor de Monedas

Seleccione una opción:
1. Convertir Moneda
2. Ver Historial
3. Salir

Opción: 1
Ingresa moneda desde la que partes (EJ: USD, ARS ...) : GTQ
Ingresa la moneda a la que quieras convertir (EJ: USD, ARS ...): USD
Ingresa la cantidad de GTQ que quieres convertir a USD:
Convirtiendo 150.0 GTQ a USD...

150.0 GTQ es igual a 19.32 USD

Seleccione una opción:
1. Convertir Moneda
2. Ver Historial
3. Salir

Opción: 2

Historial de conversiones: 
1. 150.0 GTQ a 19.32 USD


## API Utilizada

Este proyecto utiliza la API de ExchangeRate API para obtener las tasas de conversión actuales. Puedes registrarte y obtener una clave de API en https://www.exchangerate-api.com/.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, envía un pull request o abre un issue para discutir cualquier cambio que desees realizar.



