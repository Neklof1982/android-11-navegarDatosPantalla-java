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

public class RecibirDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recibir_datos);

        TextView textoT = findViewById(R.id.textTemperatura);
        TextView textoH = findViewById(R.id.textHumedad);
        Button botonVolver = findViewById(R.id.buttonEnviar);

        // Obtiene los datos del Intent que inició esta actividad. `getExtras()` devuelve un Bundle con los extras.
        Bundle extras = this.getIntent().getExtras();

        // Recupera el valor entero de la temperatura usando la clave "TEMPERATURA" del Bundle.
        int temperature = extras.getInt("TEMPERATURA");

        // Recupera el valor de la humedad (String) usando la clave "HUMEDAD" del Bundle.
        String humedad = extras.getString("HUMEDAD");

        // Establece el valor de la temperatura en el TextView correspondiente.
        textoT.setText(String.valueOf(temperature));

        // Establece el valor de la humedad en el TextView correspondiente.
        textoH.setText(humedad);

        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cuando se presiona el botón salir se ejecuta el método finish() que tiene por objetivo
                //liberar el espacio de memoria de esta actividad y pedir que se muestre la actividad
                //anterior.
                finish();
            }
        });



    }
}