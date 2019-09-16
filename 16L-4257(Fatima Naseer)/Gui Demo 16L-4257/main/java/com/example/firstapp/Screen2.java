package com.example.firstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.firstapp.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class Screen2 extends AppCompatActivity {

    GridView androidGridView;

    Integer[] imageIDs = {
            R.drawable.dog, R.drawable.butterfly, R.drawable.lily
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        tabs.getTabAt(0).setIcon(R.drawable.relative_icon);
        tabs.getTabAt(1).setIcon(R.drawable.contraint_icon);
        tabs.getTabAt(2).setIcon(R.drawable.frame_icon);
        tabs.getTabAt(3).setIcon(R.drawable.linear_icon);

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                               .setAction("Action", null).show();
                                   }
                               });
        //for back arrow
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    //BottomNavigationView bot_nav = findViewById(R.id.bottom_nb);
        //bot_nav.setOnNavigationItemSelectedListener(navListener);

        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProfileFragmentClass()).commit();
    }
    /*private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selected =null;
                    switch(item.getItemId()){
                        case R.id.nav_profile:
                            selected=new ProfileFragmentClass();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selected).commit();
                return true;
                }
            };*/
}