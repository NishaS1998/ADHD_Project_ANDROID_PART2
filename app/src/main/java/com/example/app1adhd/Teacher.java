package com.example.app1adhd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Teacher extends AppCompatActivity {
    Button be,bm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        be=(Button)findViewById(R.id.be1);
        bm=(Button)findViewById(R.id.bm1);

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gbe = new Intent(Intent.ACTION_VIEW, Uri.parse("https://thingspeak.com/channels/1070688/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15"));
                startActivity(Gbe);
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gbm = new Intent(Intent.ACTION_VIEW, Uri.parse("https://thingspeak.com/channels/1070688/charts/2?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15"));
                startActivity(Gbm);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity2_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.item1){
            Intent i1=new Intent(this,Aboutus.class);
            startActivity(i1);
        }
        if(id==R.id.item3){
            Intent i1=new Intent(this,Contact.class);
            startActivity(i1);
        }
        if(id==R.id.item4){
            Intent i1=new Intent(this,MainActivity.class);
            startActivity(i1);
        }

        return super.onOptionsItemSelected((MenuItem) item);
    }
}
