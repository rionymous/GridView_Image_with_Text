package com.androidrion.gridviewimagetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView androidGridView;

    String[] gridViewString = {
            "Android Rion", "Android Rion", "Android Rion", "Android Rion",
            "Android Rion", "Android Rion", "Android Rion", "Android Rion",
            "Android Rion", "Android Rion", "Android Rion", "Android Rion",
            "Android Rion", "Android Rion", "Android Rion", "Android Rion"

    };
    int[] gridViewImageId = {
            R.drawable.androidrion, R.drawable.androidrion, R.drawable.androidrion, R.drawable.androidrion,
            R.drawable.androidrion, R.drawable.androidrion, R.drawable.androidrion, R.drawable.androidrion,
            R.drawable.androidrion, R.drawable.androidrion, R.drawable.androidrion, R.drawable.androidrion,
            R.drawable.androidrion, R.drawable.androidrion, R.drawable.androidrion, R.drawable.androidrion

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGridViewActivity customGridViewActivity = new CustomGridViewActivity(MainActivity.this, gridViewString, gridViewImageId);
        androidGridView = findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(customGridViewActivity);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                Toast.makeText(MainActivity.this, "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
            }
        });
    }
}
