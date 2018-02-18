package com.andro.maisha.tmaishashahrani_1202154340_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuResto extends AppCompatActivity {
    String next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_resto);
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "MAISHA_1202154340", Toast.LENGTH_LONG);
        toast.show();
    }



    public void takeAway(View view) {
        this.next = "Take away";
    }

    public void dine(View view) {
        this.next = "Dine In";
    }

    public void Memilih(View view) {
        if(this.next == "Dinner In"){
            Intent i = new Intent(this, DineIn.class);
            startActivity(i);

        }else if(this.next == "Take Away"){
            Intent i = new Intent(this, TakeAway.class);
            startActivity(i);
        }else{
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Masukkan Data yang Benar", Toast.LENGTH_LONG);
            toast.show();

        }
    }
}
