package com.example.app1adhd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
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
