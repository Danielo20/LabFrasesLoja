package com.desarrollo.labfrasesloja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Comparar = (Button)findViewById(R.id.btnIniciar);

        Comparar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),Comparacion.class);
                EditText txtFrase1 = (EditText)findViewById(R.id.txtFrase1);
                EditText txtFrase2 = (EditText)findViewById(R.id.txtFrase2);

                String Frase1 = txtFrase1.getText().toString();
                String Frase2 = txtFrase2.getText().toString();

                intent.putExtra("FraseUno", Frase1);
                intent.putExtra("FraseDos", Frase2);
                startActivity(intent);
            }
        });
    }
}
