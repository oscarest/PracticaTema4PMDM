package com.example.pc.practicatema4pmdm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_boton4 extends AppCompatActivity {
Button boton1;
Button boton2;
Button boton3;
Button boton4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton4);
        boton1 = findViewById(R.id.button5);
        boton2 = findViewById(R.id.button6);
        boton3 = findViewById(R.id.button7);
        boton4 = findViewById(R.id.button8);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.container, primer_boton4);
                ft.commit();
               // new primer_boton4();
            }
        });
    }
}
