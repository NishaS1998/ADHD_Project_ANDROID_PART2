package com.example.app1adhd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1=(Button)findViewById(R.id.b11);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

    }
    public void openNewActivity(){
        Intent intent = new Intent(this, Parentresult.class);
        startActivity(intent);
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
