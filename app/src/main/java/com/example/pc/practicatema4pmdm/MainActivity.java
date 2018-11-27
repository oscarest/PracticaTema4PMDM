package com.example.pc.practicatema4pmdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button boton1;
    Intent intent;
    @Override
    //  AppCompatActivity estaActivity;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, DesplazandoImagenes.class);
      //  estaActivity = this;
        boton1 = findViewById(R.id.button2);
        boton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity();
            }

            private void openActivity()
            {
                //Intent intent = new Intent(estaActivity, DesplazandoImagenes.class);
                //startActivity(intent);
                startActivity(intent);
            }
        });
    }
}
