package edu.temple.dogimageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectionActivity extends AppCompatActivity {

    ImageView imageView;
    Spinner spinner;
    //String defaultTextForSpinner = "Select a Breed";

    int[] dogImagesArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner =findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);

        ArrayList breedArray = new ArrayList<String>();
        breedArray.add("BlackLab");
        breedArray.add("Bulldog");
        breedArray.add("Bullmastiff");
        breedArray.add("Rottweiler");

        dogImagesArray = new int[]{R.drawable.blacklab, R.drawable.bulldog, R.drawable.bullmastiff, R.drawable.rottweiler};

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, breedArray);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //showPicture(position);
                Toast.makeText(SelectionActivity.this, "Item Selected", Toast.LENGTH_SHORT).show();
                showPicture(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(SelectionActivity.this, "Item Unselected", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void showPicture(int position){
        imageView.setImageResource(dogImagesArray[position]);
    }
}