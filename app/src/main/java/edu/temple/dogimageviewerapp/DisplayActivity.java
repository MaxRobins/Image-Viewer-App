package edu.temple.dogimageviewerapp;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DisplayActivity extends AppCompatActivity {
    //Context context;
    //ArrayList<String> items;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        imageView = (ImageView)findViewById(R.id.imageView3);
        //textView = findViewById(R.id.textView);//possibly textview3

        //String string = getString(R.string.textview);


        /*getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full Screen Image");*/

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        imageView.setImageResource(imageAdapter.imageArray[position]);


        /*imageView = findViewById(R.id.imageView3);
        textView = findViewById(R.id.textView3);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            int res_image = bundle.getInt("image");
            imageView.setImageResource(res_image);
            textView.setText(getIntent().getExtras().getString("name"));
        }*/

    }

}
