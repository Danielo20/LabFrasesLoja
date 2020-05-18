package com.desarrollo.labfrasesloja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Objects;

public class Comparacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparacion);

        String Comparador = "";

        String Frase1 = getIntent().getStringExtra("FraseUno");
        String Frase2 = getIntent().getStringExtra("FraseDos");

        int vocal1 = 0;
        int vocal2 = 0;

        for(int x = 0 ; x < Frase1.length() ; x++)
        {
            if ((Frase1.charAt(x)=='a') || (Frase1.charAt(x)=='e') || (Frase1.charAt(x)=='o'))
            {
                vocal1++;
            }
        }

        for(int x = 0 ; x < Frase2.length() ; x++)
        {
            if ((Frase2.charAt(x)=='i') || (Frase2.charAt(x)=='u'))
            {
                vocal2++;
            }
        }


        if (Objects.equals(Frase1, Frase2))
        {
            Comparador = getString(R.string.textoSi);
        } else
            {
            Comparador = getString(R.string.textoNo);
        }

        TextView Salida = new TextView(this);

        Salida.setText("\n\t" + getString(R.string.txtFraseUno) + "\n" + "\t" + Frase1 +
                "\n\n\t" + getString(R.string.txtFraseDos) + "\n" + "\t" + Frase2 +
                "\n\n\r\t" + Comparador + "\n\n\t" + getString(R.string.txtVocal1)  + vocal1 +
                "\n\t" + getString(R.string.txtVocal2) + vocal2);
        Salida.setTextSize(20);

        ScrollView Deslizar = new ScrollView(this);
        Deslizar.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        Deslizar.setVerticalScrollBarEnabled(true);
        Deslizar.addView(Salida);
        setContentView(Deslizar);
    }
}
