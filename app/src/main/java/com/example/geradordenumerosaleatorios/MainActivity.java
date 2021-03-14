package com.example.geradordenumerosaleatorios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
        TextView textView = findViewById(R.id.numeroResultado);
        int geraNumero = new Random().nextInt(11);
        textView.setText("Resultado: " + geraNumero);
    }
}