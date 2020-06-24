package com.example.app1adhd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;
    String a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.editText1);
        ed2 = (EditText) findViewById(R.id.editText2);
        b1 = (Button) this.findViewById(R.id.button1);
        a = ed1.getText().toString();
        b = ed2.getText().toString();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }

            private void check() {
                if (ed1.getText().toString().equals("Parent")) {
                    Intent ii=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(ii);

                }
                if(ed1.getText().toString().equals("Teacher")){
                    Intent i2=new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(i2);
                }
                if(ed1.getText().toString().equals("Doctor")){
                    Intent i2=new Intent(MainActivity.this,Main4Activity.class);
                    startActivity(i2);
                }
            }

        });


    }
}
