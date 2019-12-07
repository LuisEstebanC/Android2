package com.example.finalp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registrar extends AppCompatActivity implements View.OnClickListener {
EditText us, pas,nom,ap;
Button regg,cann;
daoUsuario dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);


        us= findViewById(R.id.regUser);
        pas= findViewById(R.id.regPass);
        nom= findViewById(R.id.regNombre);
        ap= findViewById(R.id.regApellido);


        regg= findViewById(R.id.btnRegistrarg);
        cann= findViewById(R.id.btnCancelar);



        cann.setOnClickListener(this);

        regg.setOnClickListener(this);

        dao= new daoUsuario(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnRegistrarg:
                Usuario u=new Usuario();

                u.setUsuario(us.getText().toString());
                u.setPassword(pas.getText().toString());
                u.setNombre(nom.getText().toString());
                u.setApellido(ap.getText().toString());
                if (!u.isNull()){
                    Toast.makeText(this,"ERROR: Campos vacios",Toast.LENGTH_SHORT).show();
                } else if (dao.insertUsuario(u)){
                    Toast.makeText(this,"Registro Exitoso!!",Toast.LENGTH_SHORT).show();
                    Intent i2 =new Intent(Registrar.this,Log.class);
                    startActivity(i2);
                    finish();
                } else {
                    Toast.makeText(this,"El Usuario ya Existe!!!",Toast.LENGTH_SHORT).show();
                }

            break;

            case R.id.btnCancelar:
                Intent i =new Intent(Registrar.this,Log.class);
                startActivity(i);
                finish();
                break;

        }
    }
}
