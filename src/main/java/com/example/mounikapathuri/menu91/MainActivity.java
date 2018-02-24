package com.example.mounikapathuri.menu91;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
        textView = (TextView) findViewById(R.id.subMenuXml);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.red) {
            Toast.makeText(this, "RED clicked ", Toast.LENGTH_SHORT).show();
            textView.setTextColor(Color.RED);
            return true;
        }
        if (item.getItemId() == R.id.green) {
            Toast.makeText(this, "GREEN clicked ", Toast.LENGTH_SHORT).show();
            textView.setTextColor(Color.GREEN);
            return true;
        }

        if (item.getItemId() == R.id.blue) {
            Toast.makeText(this, "BLUE clicked ", Toast.LENGTH_SHORT).show();
            textView.setTextColor(Color.BLUE);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

