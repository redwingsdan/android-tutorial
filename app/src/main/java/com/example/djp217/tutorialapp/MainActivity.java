package com.example.djp217.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void createPlaylist(View view) {
             Intent intent = new Intent(this, SecondActivity.class);
             EditText editText = (EditText) findViewById(R.id.edit_message);
             String message = editText.getText().toString();
             intent.putExtra(EXTRA_MESSAGE, message);
             startActivity(intent);
        }
    }

    public void editPlaylist(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickButton = (Button) findViewById(R.id.buttona);
        Button clickButton2 = (Button) findViewById(R.id.buttonb);
        clickButton2.setOnClickListener(this);
        clickButton.setOnClickListener(this);
       // clickButton.setOnClickListener(new View.OnClickListener() {
            //Show an output message when the button is clicked
         //   @Override
           // public void onClick(View v) {
             //   Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();
           // }
        //};
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.buttona: {
                    Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();
                    break;
                }

                case R.id.buttonb: {

                    break;
                }

            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
