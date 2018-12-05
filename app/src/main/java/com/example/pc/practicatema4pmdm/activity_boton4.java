package com.example.pc.practicatema4pmdm;

import android.app.Fragment;
import android.app.FragmentManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class activity_boton4 extends AppCompatActivity  {
Button boton1;
Button boton2;
Button boton3;
Button boton4;
    primer_boton4 Frag1;
    segundo_boton4 Frag2;
    tercer_boton4 Frag3;
    cuarto_boton4 Frag4;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton4);
        /*boton1 = findViewById(R.id.button5);
        boton2 = findViewById(R.id.button6);
        boton3 = findViewById(R.id.button7);
        boton4 = findViewById(R.id.button8);
*/
        Frag1= new primer_boton4();
        Frag2= new segundo_boton4();
        Frag3= new tercer_boton4();
        Frag4= new cuarto_boton4();
        fragmentTransaction =  getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container1  , Frag1).commit();
       //primer_boton4 fragment = getFragmentManager().findFragmentById(R.id.primer_boton4);
      /*  Fragment mFragment = null;
        mFragment = new primer_boton4();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container,mFragment);
        transaction.addToBackStack(null);
        transaction.commit();
        */
        /*boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                primer_boton4 nextFrag1= new primer_boton4();
                fragmentTransaction.replace(R.id.fragment3, nextFrag1);
                fragmentTransaction.commit();
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                segundo_boton4 nextFrag2= new segundo_boton4();
                fragmentTransaction.add(R.id.fragment3, nextFrag2);
                fragmentTransaction.commit();

            }
        });
         fragmentTransaction.commit();
        */
       /* boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                fragmentTransaction.replace(R.id.container, Frag1).commit();
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                fragmentTransaction.replace(R.id.container1, Frag2).commit();

            }
        });
        */
    }
    //Se ha seleccionado todos estos metodos como listeners de cada botón en el xml
   public void onClick(View v)
   {
       fragmentTransaction =  getSupportFragmentManager().beginTransaction();
       fragmentTransaction.replace(R.id.container1, Frag1).commit();
   }
    public void onClick1(View v)
    {
        fragmentTransaction =  getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container1, Frag2).commit();
    }
    public void onClick2(View v)
    {
        fragmentTransaction =  getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container1, Frag3).commit();
    }
    public void onClick3(View v)
    {
        fragmentTransaction =  getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container1, Frag4).commit();
    }
}
