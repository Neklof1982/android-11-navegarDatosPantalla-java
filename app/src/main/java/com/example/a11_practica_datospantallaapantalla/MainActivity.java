package com.example.a11_practica_datospantallaapantalla;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView textoT = findViewById(R.id.editTemperatura);
        TextView textoH = findViewById(R.id.editHumedad);
        Button botonEnviar = findViewById(R.id.buttonEnviar);




        // Se configura un listener para el botón `botonEnviar`, que se ejecutará al hacer clic en el botón.
        botonEnviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // Obtener los valores en el momento de hacer clic en el botón

                // Se convierte el texto ingresado en el TextView textoT a un entero, ya que representa la temperatura.
                // String.valueOf(...) lo convierte en String
                // Integer.parseInt(...) lo convierte a un entero.
                int Temperatura = Integer.parseInt(String.valueOf(textoT.getText()));

                // Se obtiene el texto ingresado en el TextView textoH como un String, ya que representa la humedad.
                String Humedad = String.valueOf(textoH.getText());

                // Se crea un nuevo Intent para pasar a la actividad `RecibirDatos`.
                Intent intento1 = new Intent(MainActivity.this, RecibirDatos.class);

                // Se crea un Bundle, que es un contenedor para los datos que se enviarán con el Intent.
                Bundle guardar = new Bundle();

                // Se agrega al Bundle un valor entero (la temperatura) con la clave "TEMPERATURA".
                guardar.putInt("TEMPERATURA", Temperatura);
                // Se agrega al Bundle un valor String (la humedad) con la clave "HUMEDAD".
                guardar.putString("HUMEDAD", Humedad);

                // Se asocia el Bundle al Intent, de modo que los datos serán enviados con este.
                intento1.putExtras(guardar);

                // Se inicia la actividad RecibirDatos
                startActivity(intento1);

            }
        });


    }
}