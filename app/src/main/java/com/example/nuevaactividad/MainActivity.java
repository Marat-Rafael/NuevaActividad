package com.example.nuevaactividad;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="com.example.nuevaactividad.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TwoActivity", "----------------");
        Log.d("TwoActivity", "Metodo onCreate");
        Log.d("TwoActivity", "----------------");
    }
    protected void onStart(){
        super.onStart();
        Log.d("TwoActivity","----------------");
        Log.d("TwoActivity","Metodo onStart");
        Log.d("TwoActivity","----------------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TwoActivity","----------------");
        Log.d("TwoActivity","Metodo onPause");
        Log.d("TwoActivity","----------------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TwoActivity","----------------");
        Log.d("TwoActivity","Metodo onResart");
        Log.d("TwoActivity","----------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TwoActivity","----------------");
        Log.d("TwoActivity","Metodo onResume");
        Log.d("TwoActivity","----------------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TwoActivity","----------------");
        Log.d("TwoActivity","Metodo onStop");
        Log.d("TwoActivity","----------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TwoActivity","----------------");
        Log.d("TwoActivity","Metodo onDestroy");
        Log.d("TwoActivity","----------------");
    }

    /** Se llama cuando usuario pulsa boton Enviar */
    public void sendMessage(View view){
        // hacemos algo para responder al pulsar boton
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        // constructoe intent toma dos parametros : Context y una Class
        // parametro Context se usa primeto porque la clase Activity es una sublace de Context
        // parametro Class del componente de la app, al que el sistema entrega el Intent, es en esto caso la actividad va comenzar

        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        // putExtra agrega el valor de EditText al intent. Un intent puede transportar tipos de datos como clave-valor llamadoe extra
        // añadimos nombre del paqueta para garantizar que sean unicos

        startActivity(intent);
        // start activity inicia una instancia de DisplayMesasageActivity que especifica intent. Luego debemos crear esa clase
    }
}