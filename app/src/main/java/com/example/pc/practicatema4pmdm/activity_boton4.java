package com.example.pc.practicatema4pmdm;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

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
       //primer_boton4 fragment = getFragmentManager().findFragmentById(R.id.primer_boton4);
      /*  Fragment mFragment = null;
        mFragment = new primer_boton4();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container,mFragment);
        transaction.addToBackStack(null);
        transaction.commit();
        */
        primer_boton4 nextFrag= new primer_boton4();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.container, nextFrag);
        ft.commit();
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                primer_boton4 nextFrag= new primer_boton4();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.container, nextFrag);
                ft.commit();
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                segundo_boton4 nextFrag= new segundo_boton4();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.container, nextFrag);
                ft.commit();
            }
        });
    }
}
