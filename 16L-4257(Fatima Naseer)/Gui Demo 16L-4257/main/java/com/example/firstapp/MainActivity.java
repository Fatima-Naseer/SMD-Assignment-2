package com.example.firstapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button signupbtn;
    private Button exitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signupbtn= (Button) findViewById(R.id.signUpButton);
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScreen2();
            }

        });
        exitbtn= (Button) findViewById(R.id.exitButton);
        exitbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
    @Override
    public void onBackPressed(){
      AlertDialog.Builder builder=new AlertDialog.Builder(this);
      builder.setMessage("Are you sure you want to exit?")
              .setCancelable(false)
              .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                      MainActivity.super.onBackPressed();
                  }
              })
              .setNegativeButton("No", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialogInterface, int i) {
                      dialogInterface.cancel();
                  }
              });
      AlertDialog alert=builder.create();
      alert.show();
    }

    public void openScreen2(){
        Intent intent =new Intent(this, Screen2.class);
        startActivity(intent);
    }
}
