package com.example.activity_3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.mn1){
            startActivity(new Intent(this, menu1activity.class));
        } else if (item.getItemId() == R.id.mn2) {
            startActivity(new Intent(this, menu2Activity.class));
        }else  if( item.getItemId() == R.id.mn3) {
            startActivity(new Intent(this, menu3Activity.class));
        }
        return true;
    }
        }

