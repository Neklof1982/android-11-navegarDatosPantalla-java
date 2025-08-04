# 🚀 **Práctica 11 - Enviar y Recibir Datos entre Pantallas**

## 📝 Descripción

En esta práctica, se crea una aplicación Android que permite enviar y recibir datos entre dos actividades usando **Intents**. En la primera pantalla, el usuario introduce datos de **Temperatura** y **Humedad**, los cuales se envían a la segunda actividad. En la segunda pantalla, estos datos se reciben y se muestran en **TextViews** correspondientes.

## ⚙️ Tecnologías usadas

- **Android SDK 34**  
- **Java (MainActivity y RecibirDatos)**  
- **Intent para enviar datos entre actividades**  
- **Bundle para el paso de datos**  
- **ConstraintLayout para el diseño flexible**  
- **Edge-to-Edge API para diseño inmersivo**  

## 📐 Diseño UI

El layout de ambas actividades utiliza **ConstraintLayout** para organizar los elementos visuales.

### `activity_main.xml`

Contiene dos **EditTexts** para ingresar los valores de temperatura y humedad, junto con un **Button** para enviar los datos a la segunda pantalla:

- **EditText - temperatura**: Campo donde el usuario ingresa el valor de la temperatura.
- **EditText - humedad**: Campo donde el usuario ingresa el valor de la humedad.
- **Button - Enviar**: Este botón envía los datos ingresados a la segunda actividad (`RecibirDatos`).

### `activity_recibir_datos.xml`

En esta actividad, los datos enviados se muestran en **TextViews**:

- **TextView - temperatura**: Muestra el valor de la temperatura que fue enviado desde la primera actividad.
- **TextView - humedad**: Muestra el valor de la humedad que fue enviado desde la primera actividad.
- **Button - Volver**: Este botón permite regresar a la actividad principal (`MainActivity`).

## 🚀 Ejecución

1. Abrir el proyecto en **Android Studio** con el SDK 34 configurado.
2. Ejecutar la aplicación en un **dispositivo/emulador con Android 11 (API 30)** o superior.
3. En la pantalla principal, ingresar los valores de **Temperatura** y **Humedad**.
4. Al presionar el botón **"ENVIAR"**, se abrirá la segunda pantalla (`RecibirDatos`), donde se mostrarán los datos ingresados.
5. En la segunda pantalla, al presionar el botón **"VOLVER"**, se regresará a la pantalla principal.

## 📌 Versionado

Este proyecto utiliza **Git** y **GitHub** para el control de versiones, lo que permite mantener un registro detallado de los cambios realizados durante el desarrollo.

## 📄 Licencia

Este proyecto está bajo la [MIT License](./LICENSE).

## 🎁 Expresiones de Gratitud

Podéis invitarme a una cerveza 🍺 o un café ☕.  
Gracias por la lectura 🤓.
