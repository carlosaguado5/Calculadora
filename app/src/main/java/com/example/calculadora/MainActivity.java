package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt_numero1 = null;
    private EditText edt_numero2 = null;
    TextView txt_resultado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_numero1=(EditText) findViewById(R.id.edt_numero1);
        edt_numero2=(EditText)findViewById(R.id.edt_numero2);
        txt_resultado =(TextView) findViewById(R.id.txt_resultado);

    }

    public void calcular(View view)
    {
        String textonumero1= String.valueOf(edt_numero1.getText());
        String textonumero2= String.valueOf(edt_numero2.getText());
        //------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //_-----------------------------------------------------
        double resultado = 0.0;
        switch (view.getId())
        {
            case R.id.btn_sumar: resultado=numero1+numero2;
                break;
            case R.id.btn_menos: resultado=numero1-numero2;
                break;
            case R.id.btn_por: resultado = numero1*numero2;
                break;
            case R.id.btn_dividir:
                if (numero2!=0){

                    resultado = numero1/numero2;
                }
                else{
                    edt_numero2.setError("no puedes poner cero");

                }
                break;
            case R.id.btn_resto:
                if (numero2!=0){

                    resultado = numero1%numero2;
                }
                else{
                    edt_numero2.setError("no puedes poner cero");

                }
                break;
            default:
                break;
        }
        //------------------------------------------------------
        double resultadoredondeado = Math.round(resultado * 100.0)/100;
        txt_resultado.setText(String.valueOf(resultadoredondeado));

    }









}