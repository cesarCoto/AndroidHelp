package com.coto.cesar.androidhelp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    //se enlazan las views

   EditText et_numeroA,et_numeroB;
   TextView tvresultado;
   CheckBox suma,resta,divicion,multiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        et_numeroA = (EditText) findViewById(R.id.et_AcCheckbox_numeroA);
        et_numeroB = (EditText) findViewById(R.id.et_AcCheckbox_numeroB);

        tvresultado = (TextView) findViewById(R.id.text_resultado_AcCheckbox);

        suma = (CheckBox) findViewById(R.id.Cb_AcCheckbox_Suma);
        resta = (CheckBox) findViewById(R.id.Cb_AcCheckbox_Resta);
        divicion = (CheckBox) findViewById(R.id.Cb_AcCheckbox_Divicion);
        multiplicacion = (CheckBox) findViewById(R.id.Cb_AcCheckbox_Multiplicacion);

        //codigo del button flotante
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.buton_operar_AcCheckbox);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                //se crea un metodo para hacer las operaciones
                operaciones();
            }
        });

        // button ir atras

        //button ir atras
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void operaciones(){
        String A = et_numeroA.getText().toString();
        String B = et_numeroB.getText().toString();
        String Resultado="";
        if(A.length()!=0 && B.length()!=0){
            int a = Integer.parseInt(A);
            int b = Integer.parseInt(B);
            if (suma.isChecked()){
                Resultado = A + "+" + B + "="+(a+b)+ "\n";
            }
            if(resta.isChecked()){
                Resultado = Resultado + A + "-" + B + "="+(a-b)+"\n";
            }
            if(divicion.isChecked()){
                Resultado = Resultado + A + "/" + B + "=" +(a/b)+ "\n";
            }
            if (multiplicacion.isChecked()){
                Resultado = Resultado + A + "*" + B + "=" + (a*b) + "\n";
            }
            if("".compareTo(Resultado) ==0){
                Toast.makeText(this, "Please selec something", Toast.LENGTH_SHORT).show();
            }
            tvresultado.setText(Resultado);

        }else{
            Toast.makeText(this, "Please write something", Toast.LENGTH_SHORT).show();
            tvresultado.setText("");
        }


    }

    //meotodo para el menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu_checkbox) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_checkbox, menu_checkbox);
        return true;
    }

}
