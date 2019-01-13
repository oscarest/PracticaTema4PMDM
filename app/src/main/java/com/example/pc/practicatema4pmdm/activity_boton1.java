package com.example.pc.practicatema4pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_boton1 extends AppCompatActivity {

    Button boton;
    TextView txtv;
    EditText edit;
    Boolean isPrime;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton1);
        boton = findViewById(R.id.button4);
        txtv = findViewById(R.id.textView2);
        edit = findViewById(R.id.editText);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edit.getText().toString().isEmpty())
                {
                    int numero;
                    numero = Integer.parseInt(edit.getText().toString());
                    isPrime = true;
                    for (int divisor = 2; divisor <= numero / 2; divisor++) {
                        if (numero % divisor == 0) {
                            isPrime = false;
                            break; // num is not a prime, no reason to continue checking
                        }
                    }
                    if (isPrime == true) {
                        txtv.setText(getResources().getString(R.string.prime));
                    } else {
                        txtv.setText(getResources().getString(R.string.noprime));
                    }
                }
                else
                {
                }
            }
        });
    }

}
