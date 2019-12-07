package com.example.finalp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Compartida extends AppCompatActivity implements ComunicaMenu{
    Fragment [] misFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartida);

        misFragmentos=new Fragment[4];

        misFragmentos[0]=new Info();
        misFragmentos[1]= new Fragment();
        misFragmentos[2]=new InfoEmp();
        misFragmentos[3]=new Tareas();

        Bundle extras=getIntent().getExtras();

        menuAside(extras.getInt("BOTONPULSADOA"));
    }

    public void menu(int queboton ){

    }
    public  void menuAside (int quebotonAside){

        FragmentManager mimanagerA=getSupportFragmentManager();

        FragmentTransaction miTransaccion=mimanagerA.beginTransaction();

        miTransaccion.replace(R.id.compartidas,misFragmentos[quebotonAside]);

        miTransaccion.commit();


    }



}
