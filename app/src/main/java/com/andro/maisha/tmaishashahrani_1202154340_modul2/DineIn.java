package com.andro.maisha.tmaishashahrani_1202154340_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public abstract class DineIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    int Var;
    String jenis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        showSpinner();
    }

    public void showSpinner(){
        //Membuat Spinner.
        Spinner spinner = (Spinner) findViewById(R.id.NoMeja);
        if (spinner != null){
            spinner.setOnItemSelectedListener(this);
        }
        //Mmebuat arrayAdapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Menu, R.layout.support_simple_spinner_dropdown_item);

        adapter.setDropDownViewResource
                (R.layout.support_simple_spinner_dropdown_item);

        if (spinner != null){
            spinner.setAdapter(adapter);
        }
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        this.jenis = adapterView.getItemAtPosition(i).toString();
        String showToast = this.jenis + "Menu telah dipesan";
        this.Var = i;
        if (i != 0) {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, showToast, Toast.LENGTH_LONG);
            toast.show();
        }
    }}

