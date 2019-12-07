package com.example.finalp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Map extends AppCompatActivity implements ComunicaMenu {

Button btnTipos,btnUbicacion,btnSitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

            Bundle extras=getIntent().getExtras();

        menuAside(extras.getInt("BOTONPULSADOA"));


        btnSitios =(Button) findViewById(R.id.btnSitios);
        btnUbicacion = (Button) findViewById(R.id.btnUbicacion);


        btnSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Pubicaciones.class);
                startActivity(intent);
            }
        });
    }

    public void MiLocalizacion(View v){
        Intent intent = new Intent(getApplicationContext(),MiUbicacion.class);
        startActivity(intent);
    }

    public void menu(int queboton ){

    }
    public  void menuAside (int quebotonAside){

       /* FragmentManager mimanagerA=getSupportFragmentManager();

        FragmentTransaction miTransaccion=mimanagerA.beginTransaction();

        miTransaccion.replace(R.id.mapR,);*/


    }
}
