package com.petroprix.appmodlyd.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.petroprix.appmodlyd.R;

public class FragmentTransfer extends Fragment implements View.OnClickListener {

    private EditText transferencia;
    private String textoPantalla, textoAnterior, textoNuevo;
    private int numeroDecimales;
    private Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0, botonComma, botonDelete;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_transfer, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //EDIT TEXT TECLADO
        transferencia = view.findViewById(R.id.etxt_transfer);
        transferencia.setInputType(InputType.TYPE_NULL);

        //IDENTIFICACIÓN DE BOTONES
        boton1 = view.findViewById(R.id.btn_uno);
        boton1.setOnClickListener(this);
        boton2 = view.findViewById(R.id.btn_dos);
        boton2.setOnClickListener(this);
        boton3 = view.findViewById(R.id.btn_tres);
        boton3.setOnClickListener(this);
        boton4 = view.findViewById(R.id.btn_cuatro);
        boton4.setOnClickListener(this);
        boton5 = view.findViewById(R.id.btn_cinco);
        boton5.setOnClickListener(this);
        boton6 = view.findViewById(R.id.btn_seis);
        boton6.setOnClickListener(this);
        boton7 = view.findViewById(R.id.btn_siete);
        boton7.setOnClickListener(this);
        boton8 = view.findViewById(R.id.btn_ocho);
        boton8.setOnClickListener(this);
        boton9 = view.findViewById(R.id.btn_nueve);
        boton9.setOnClickListener(this);
        boton0 = view.findViewById(R.id.btn_cero);
        boton0.setOnClickListener(this);
        botonComma = view.findViewById(R.id.btn_coma);
        botonComma.setOnClickListener(this);
        botonDelete = view.findViewById(R.id.btn_borrar);
        botonDelete.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        textoPantalla = transferencia.getText().toString();

        switch (v.getId()){

            case R.id.btn_uno:
                controlarTecladoNum("1");
                break;

            case R.id.btn_dos:
                controlarTecladoNum("2");
                break;

            case R.id.btn_tres:
                controlarTecladoNum("3");
                break;

            case R.id.btn_cuatro:
                controlarTecladoNum("4");
                break;

            case R.id.btn_cinco:
                controlarTecladoNum("5");
                break;

            case R.id.btn_seis:
                controlarTecladoNum("6");
                break;

            case R.id.btn_siete:
                controlarTecladoNum("7");
                break;

            case R.id.btn_ocho:
                controlarTecladoNum("8");
                break;

            case R.id.btn_nueve:
                controlarTecladoNum("9");
                break;

            case R.id.btn_cero:
                controlarTecladoNum("0");
                break;

            case R.id.btn_coma:
                if( textoPantalla.length() < 8 && textoPantalla.length() > 0){
                    if( textoPantalla.indexOf(".") == -1){
                        textoAnterior = textoPantalla;
                        textoNuevo = textoAnterior + ".";
                        transferencia.setText(textoNuevo);
                    }
                }
                break;

            case R.id.btn_borrar:
                if( textoPantalla.length() <= 9){
                    textoAnterior = textoPantalla;
                    if( textoAnterior.length() != 0){
                        textoNuevo = textoAnterior.substring(0, textoAnterior.length() - 1);
                        transferencia.setText(textoNuevo);
                    }
                }
                break;


            default: break;
        }

    }

    public void controlarTecladoNum(String numero){
        if( textoPantalla.length() < 9){
            if( textoPantalla.indexOf(".") != -1){
                numeroDecimales = textoPantalla.substring(textoPantalla.indexOf("."), textoPantalla.length() - 1).length();
                if( numeroDecimales < 2){
                    textoAnterior = textoPantalla;
                    textoNuevo = textoAnterior + numero;
                    transferencia.setText(textoNuevo);
                }

            } else{
                textoAnterior = textoPantalla;
                textoNuevo = textoAnterior + numero;
                transferencia.setText(textoNuevo);
            }
        }
    }
}
