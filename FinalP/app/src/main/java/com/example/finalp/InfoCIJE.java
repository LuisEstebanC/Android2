package com.example.finalp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class InfoCIJE extends DialogFragment {

    public static final String ARGUMENTO_TITLE ="TITLE";
    public static final String ARGUMENTO_FULL_SNIPPET= "FULL_SNIPPET";
    private String title;
    private String fullsnippet;

    public static InfoCIJE newInstance(String title, String fullsnippet){
        InfoCIJE fragment = new InfoCIJE();
        Bundle b = new Bundle();
        b.putString(ARGUMENTO_TITLE, title);
        b.putString(ARGUMENTO_FULL_SNIPPET, fullsnippet);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Bundle args =getArguments();

        title = args.getString(ARGUMENTO_TITLE);
        fullsnippet = args.getString(ARGUMENTO_FULL_SNIPPET);

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        Dialog dialog= new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMessage(fullsnippet)
                .create();

        return dialog;

    }


}
