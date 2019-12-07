package com.example.finalp;


import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuTop extends Fragment {

    private final int [] BOTONESMENUTOP = {R.id.home,R.id.editar,R.id.actividad,R.id.chat};


    public MenuTop() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mimenutop = inflater.inflate(R.layout.fragment_menu_top, container, false);

        ImageButton botonmenutop;
        for(int i = 0;i<BOTONESMENUTOP.length;i++){
            botonmenutop = (ImageButton) mimenutop.findViewById(BOTONESMENUTOP[i]);

            final int queBoton =i;

            botonmenutop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Activity estaActividad =getActivity();

                    ((ComunicaMenu)estaActividad).menu(queBoton);
                }
            });
        }


        return mimenutop;
    }

}
