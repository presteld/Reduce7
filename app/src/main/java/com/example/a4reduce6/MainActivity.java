package com.example.a4reduce6;  // dieses Paket kann wiederverwendet werden

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { // übersetzt die compilde-SDK in die Targer SDK
// Java Architektur: Klassenname = Dateiname
    @Override
    protected void onCreate(Bundle savedInstanceState) {   // Lebenszyklusmethode, zur Inbetriebnahme der 1.Aktivität (BS-Komponente = 1. Bildschirm)
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btnReduce = findViewById(R.id.btnReduce); // Android bildet aus res - Ordner die R.Klasse und instanziert sie zum R-Objekt
        // Attributinhalte sind jetzt in dem Objekt btnTeduce verfügbar btn refuce = Refernz auf Objekt vom button.
        // findView byID = Obejkt - Generator (Factory-Klasse)

        btnReduce.setOnClickListener(this);   // übergebene refrenz muss vom Typ Interface OnClickListener des MVC -Beobachter Pattern sein

    }

    @Override  /// es muss eine Oberklassen Methode geben  -> Annotation
    public void onClick(View view) {
        System.out.println("_______________________Button wurde gedrückt");

        EditText etZaehler = findViewById(R.id.etZaehler);
        EditText etNenner = findViewById(R.id.etNenner);

        String sZaehler = etZaehler.getText().toString();
        String sNenner = etNenner.getText().toString();

        int iZaehler = Integer.parseInt(sZaehler);
        int iNenner = Integer.parseInt(sNenner);


       if(iNenner * iZaehler !=0 ){    //Euklidischer Algorithmus zur Berechnung des ggT
            int iRest, iGGT = Math.abs(iZaehler), iDivisor = Math.abs(iNenner);
            do {
                iRest = iGGT % iDivisor;
                iGGT = iDivisor;
                iDivisor = iRest;
            } while (iRest > 0);

            etZaehler.setText(iZaehler / iGGT  + ""); // durch Konkatenation wir int in string gecasted

            //  etZaehler.setText(String.valueOf(iZaehler / iGGT));
            etNenner.setText(String.valueOf(iNenner / iGGT));
        }



        }

    }
