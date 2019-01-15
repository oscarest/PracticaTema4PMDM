package com.example.pc.practicatema4pmdm;

import android.app.Fragment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class activity_boton2 extends AppCompatActivity
{
    Button boton;
    RadioButton radio1;
    RadioButton radio2;
    RadioButton radio3;
    RadioButton radio4;
    RadioButton radio5;
    RadioButton radio6;
    RadioButton radio7;
    RadioButton radio8;
    RadioButton radio9;
    RadioButton radio10;
    RadioButton radio11;
    RadioButton radio12;
    RadioButton radio13;
    RadioButton radio14;
    RadioButton radio15;
    RadioButton radio16;
    RadioButton radio17;
    RadioButton radio18;
    RadioButton radio19;
    RadioButton radio20;
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    TextView txt1;
    TextView txt2;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton2);
        txt1 = findViewById(R.id.textView3);
        txt2 = findViewById(R.id.textView4);
        boton = findViewById(R.id.button10);
        radio1 = findViewById(R.id.radioButton);
        radio2 = findViewById(R.id.radioButton13);
        radio3 = findViewById(R.id.radioButton2);
        radio4 = findViewById(R.id.radioButton15);
        radio5 = findViewById(R.id.radioButton3);
        radio6 = findViewById(R.id.radioButton11);
        radio7 = findViewById(R.id.radioButton4);
        radio8 = findViewById(R.id.radioButton14);
        radio9 = findViewById(R.id.radioButton5);
        radio10 = findViewById(R.id.radioButton12);
        radio11 = findViewById(R.id.radioButton6);
        radio12 = findViewById(R.id.radioButton18);
        radio13 = findViewById(R.id.radioButton7);
        radio14 = findViewById(R.id.radioButton17);
        radio15 = findViewById(R.id.radioButton8);
        radio16 = findViewById(R.id.radioButton16);
        radio17 = findViewById(R.id.radioButton9);
        radio18 = findViewById(R.id.radioButton20);
        radio19 = findViewById(R.id.radioButton10);
        radio20 = findViewById(R.id.radioButton19);
        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radio1.isChecked())
                {
                    txt1.setText(getResources().getString(R.string.pais1));
                }
                else if(radio3.isChecked())
                {
                    txt1.setText(getResources().getString(R.string.pais2));
                }
                else if(radio5.isChecked())
                {
                    txt1.setText(getResources().getString(R.string.pais3));
                }
                else if(radio7.isChecked())
                {
                    txt1.setText(getResources().getString(R.string.pais4));
                }
                else if(radio9.isChecked())
                {
                    txt1.setText(getResources().getString(R.string.pais5));
                }
                else if(radio11.isChecked())
                {
                    txt1.setText(getResources().getString(R.string.pais6));
                }
                else if(radio13.isChecked())
                {
                    txt1.setText(getResources().getString(R.string.pais7));
                }
                else if(radio15.isChecked())
                {
                    txt1.setText(getResources().getString(R.string.pais8));
                }
                else if(radio17.isChecked())
                {
                    txt1.setText(getResources().getString(R.string.pais9));
                }
                else if(radio19.isChecked())
                {
                    txt1.setText(getResources().getString(R.string.pais10));
                }
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radio2.isChecked())
                {
                    txt2.setText(getResources().getString(R.string.capital1));
                }
                else if(radio4.isChecked())
                {
                    txt2.setText(getResources().getString(R.string.capital2));
                }
                else if(radio6.isChecked())
                {
                    txt2.setText(getResources().getString(R.string.capital3));
                }
                else if(radio8.isChecked())
                {
                    txt2.setText(getResources().getString(R.string.capital4));
                }
                else if(radio10.isChecked())
                {
                    txt2.setText(getResources().getString(R.string.capital5));
                }
                else if(radio12.isChecked())
                {
                    txt2.setText(getResources().getString(R.string.capital6));
                }
                else if(radio14.isChecked())
                {
                    txt2.setText(getResources().getString(R.string.capital7));
                }
                else if(radio16.isChecked())
                {
                    txt2.setText(getResources().getString(R.string.capital8));
                }
                else if(radio18.isChecked())
                {
                    txt2.setText(getResources().getString(R.string.capital9));
                }
                else if(radio20.isChecked())
                {
                    txt2.setText(getResources().getString(R.string.capital10));
                }
            }
        });
        imagen= findViewById(R.id.imageView8);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            if(radio1.isChecked() && radio2.isChecked())
            {
                imagen.setImageResource(R.drawable.acierto);
            }
            else if(radio3.isChecked() && radio4.isChecked())
            {
                imagen.setImageResource(R.drawable.acierto);
            }
            else if(radio5.isChecked() && radio6.isChecked())
            {
                imagen.setImageResource(R.drawable.acierto);
            }
            else if(radio7.isChecked() && radio8.isChecked())
            {
                imagen.setImageResource(R.drawable.acierto);
            }
            else if(radio9.isChecked() && radio10.isChecked())
            {
                imagen.setImageResource(R.drawable.acierto);
            }
            else if(radio11.isChecked() && radio12.isChecked())
            {
                imagen.setImageResource(R.drawable.acierto);
            }
            else if(radio13.isChecked() && radio14.isChecked())
            {
                imagen.setImageResource(R.drawable.acierto);
            }
            else if(radio15.isChecked() && radio16.isChecked())
            {
                imagen.setImageResource(R.drawable.acierto);
            }
            else if(radio17.isChecked() && radio18.isChecked())
            {
                imagen.setImageResource(R.drawable.acierto);
            }
            else if(radio19.isChecked() && radio20.isChecked())
            {
                imagen.setImageResource(R.drawable.acierto);
            }
            else
            {
                imagen.setImageResource(R.drawable.error);
            }
            }
        });

    }
}
