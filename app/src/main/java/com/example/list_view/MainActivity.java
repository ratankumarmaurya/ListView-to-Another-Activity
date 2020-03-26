package com.example.list_view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        // define array

        final String[] values = new String[]{
                "Android list View ",
                "Simple Adopter",
                "Android Example",
                "Create List View",
                "list View Source Code",
                "Hindi Movies",
                "English Movies",
                "English Movies doub in hindi",
                "Cartoon moview",
                "TV Show",
                "TV Serial",
                "Comedy"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

/*
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int itemPosition = (position);
                long itemValue = listView.getItemIdAtPosition(position);

                Toast.makeText(getApplicationContext(), "Position:" + itemPosition + "Item Click :" + itemValue, Toast.LENGTH_LONG).show();
            }
        });


 */

 listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                // Getting listview click value into String variable.
               String TempListViewClickedValue = values[position].toString();

                Intent intent = new Intent(MainActivity.this, Demo.class);

                // Sending value to another activity using intent.
                intent.putExtra("ListViewClickedValue", TempListViewClickedValue);

                startActivity(intent);

            }
        });

    }






    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }


}
