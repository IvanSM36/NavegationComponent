package com.example.navegationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Inicio extends Fragment {

    public Inicio() {
        // Requiere un constructor vacio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        // Inflate the layout for this fragment
        return  inflater.inflate(R.layout.fragment_inicio, container, false);
    }

    // Usamos este metodo en vez del onCreate
    // Separamos la lógica de la inicialización de la creacion de los componentes
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        Button btn1 = view.findViewById(R.id.btnFragment01);
        Button btn2 = view.findViewById(R.id.btnFragment02);

        //para usar en varias instancias...
        final NavController navController = Navigation.findNavController(view);

        btn1.setOnClickListener(new View.OnClickListener(){
            public void  onClick(View v){ Navigation.findNavController(v).navigate(R.id.fragment01);}

        });

        btn2.setOnClickListener(new View.OnClickListener(){
            public void  onClick(View v){ Navigation.findNavController(v).navigate(R.id.fragment02);}

        });

    }

}