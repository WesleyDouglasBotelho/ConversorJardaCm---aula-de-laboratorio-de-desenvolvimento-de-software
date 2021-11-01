package com.example.conversor_jardas_cm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtQuantJardas;
    TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtQuantJardas = findViewById(R.id.edtQuantJardas);

        txtResultado = findViewById(R.id.txtResultado);

    }

    public void calcular(View view) {

        double quantJarda = Double.parseDouble(edtQuantJardas.getText().toString());
        double valorJarda = 91.44;

        double Totalcm = valorJarda * quantJarda;

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorformatado = decimal.format(Totalcm);

        txtResultado.setText(Totalcm +"CM ");
    }


}