package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.firstapp.ui.main.ImageAdapter;
import com.example.firstapp.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class Screen2 extends AppCompatActivity {
    private ImageButton x;
    GridView grid;

    Integer[] imageIDs = {
            R.drawable.dog, R.drawable.butterfly, R.drawable.lily, R.drawable.tower
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        x= (ImageButton) findViewById(R.id.backarrow);
        x.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                BackArrowPress();
            }
        });
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        tabs.getTabAt(0).setIcon(R.drawable.relative_icon);
        tabs.getTabAt(1).setIcon(R.drawable.contraint_icon);
        tabs.getTabAt(2).setIcon(R.drawable.frame_icon);
        tabs.getTabAt(3).setIcon(R.drawable.linear_icon);

        grid = (GridView) findViewById(R.id.gridd);

        // Instance of ImageAdapter Class
        grid.setAdapter(new ImageAdapter(this));

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                               .setAction("Action", null).show();
                                   }
                               });
    }
    public void BackArrowPress(){
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}