package com.example.finalp;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuAside extends Fragment {

    private final int [] BOTONESMENUASIDE = {R.id.info,R.id.imagenes,R.id.empleados,R.id.tareas,R.id.location};


    public MenuAside() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mimenuAside =inflater.inflate(R.layout.fragment_menu_aside, container, false);

        ImageButton botonmenuaside;
        for (int e = 0;e<BOTONESMENUASIDE.length;e++){
            botonmenuaside = (ImageButton) mimenuAside.findViewById(BOTONESMENUASIDE[e]);

            final int quebotonAside = e;

            botonmenuaside.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Activity estaActividad =getActivity();

                    ((ComunicaMenu)estaActividad).menuAside(quebotonAside);
                }
            });
        }

        return mimenuAside;
    }

}
