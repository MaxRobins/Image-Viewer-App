package edu.temple.dogimageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectionActivity extends AppCompatActivity {

    //ImageView imageView;
    //Spinner spinner;
    //int[] dogImagesArray;

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Selection Activity");

        gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));


        /*spinner =findViewById(R.id.spinner);
        //imageView = findViewById(R.id.imageView);


        ArrayList breedArray = new ArrayList<String>();
        breedArray.add(0,"Select item from list");
        breedArray.add("BlackLab");
        breedArray.add("Bulldog");
        breedArray.add("Bullmastiff");
        breedArray.add("Rottweiler");


        ArrayList colorArray = new ArrayList<String>();
        colorArray.add(0,"");
        colorArray.add("Black");
        colorArray.add("White");
        colorArray.add("Brown");
        colorArray.add("Black");

        dogImagesArray = new int[]{android.R.color.transparent,R.drawable.blacklab, R.drawable.bulldog, R.drawable.bullmastiff, R.drawable.rottweiler};

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, breedArray);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Select item from list")){
                    imageView.setImageResource(android.R.color.transparent);
                }
                else{
                    Intent launchIntent = new Intent(SelectionActivity.this, DisplayActivity.class);
                    launchIntent.putExtra("name", spinner.getSelectedItem().toString());
                    launchIntent.putExtra("image", dogImagesArray[position]);
                    startActivity(launchIntent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(SelectionActivity.this, "Item Unselected", Toast.LENGTH_SHORT).show();
            }
        });
    }
            @Override
            protected void onResume(){
                super.onResume();;
                spinner.setSelection(0);
            }

            private void showPicture(int position){
                imageView.setImageResource(dogImagesArray[position]);
            }*/
    }
}