package com.example.finalp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements ComunicaMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menu(int queboton ){
        if (queboton == 0){
            Intent inA = new Intent(this,MainActivity.class);

            inA.putExtra("BOTONPULSADO", queboton);

            startActivity(inA);
        }

    }
    public  void menuAside (int quebotonAside){

        if (quebotonAside == 4){
        Intent inA = new Intent(this,Map.class);

        inA.putExtra("BOTONPULSADOA", quebotonAside);

        startActivity(inA);
        }else if (quebotonAside == 1){
            Intent inA = new Intent(this,Galeria.class);

            inA.putExtra("BOTONPULSADOA", quebotonAside);

            startActivity(inA);
        } else {
            Intent inA = new Intent(this,Compartida.class);

            inA.putExtra("BOTONPULSADOA", quebotonAside);

            startActivity(inA);
        }

    }


}
