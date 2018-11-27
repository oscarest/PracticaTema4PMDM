package com.example.pc.practicatema4pmdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button boton;
    Button boton1;
    Button boton2;
    Intent intent2;
    Intent intent;
   Intent intent1;
    Intent intent3;
    @Override
    //  AppCompatActivity estaActivity;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent2 = new Intent(this, DesplazandoImagenes.class);
        intent = new Intent(this, activity_boton1.class);
       intent1 = new Intent(this, activity_boton2.class);
     //   intent = new Intent(this, activity_boton4.class);
      //  estaActivity = this;
        boton=findViewById(R.id.button);
        boton1=findViewById(R.id.button1);
        boton2 = findViewById(R.id.button2);
        boton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity();
            }

            private void openActivity()
            {
                //Botónn 3 del programa
                //Intent intent = new Intent(estaActivity, DesplazandoImagenes.class);
                //startActivity(intent);
                startActivity(intent2);
            }
        });
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Botón 1 del programa
                startActivity(intent);
            }
        });
        boton1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            //Botón 2 del programa
            startActivity(intent1);
        }
    });
    }
}
