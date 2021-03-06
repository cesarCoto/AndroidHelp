package com.coto.cesar.androidhelp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;

public class RadioButtonActivity extends AppCompatActivity {


    RadioButton rb_green,rb_red,rb_blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rb_blue = (RadioButton) findViewById(R.id.rb_blue_AcRadioButton);
        rb_green = (RadioButton) findViewById(R.id.rb_green_AcRadioButton);
        rb_red = (RadioButton) findViewById(R.id.rb_red_AcRadioButton);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // button ir atras
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        // metodo para cambiar colores

    }

    public boolean onCreateOptionsMenu(Menu menu_radiobutton) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_radiobutton, menu_radiobutton);
        return true;
    }
}
