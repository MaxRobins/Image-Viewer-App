package edu.temple.dogimageviewerapp;

import android.content.Context;
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

        imageView = findViewById(R.id.imageView3);
        textView = findViewById(R.id.textView3);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            int res_image = bundle.getInt("image");
            imageView.setImageResource(res_image);
            textView.setText(getIntent().getExtras().getString("name"));
        }

    }

}
