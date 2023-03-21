package com.example.fragmentapp;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

public class mainActivity extends AppCompatActivity {
    Button suz,bmw,hon,kia;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        suz=findViewById(R.id.suzuki);
        bmw=findViewById(R.id.BMW);
        kia=findViewById(R.id.kia);
        hon=findViewById(R.id.honda);
        loadFragment(new listFragment(),"suz");
        loadFragmentImage(new CarDetails(),"img","White Car\n Price : 6 lakhs");



    }
    private void loadFragment(Fragment fragment,String i) {
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        Bundle data=new Bundle();
        data.putString("comp",i);
        Log.d("Success11","Value: "+i);



        fragment.setArguments(data);
        ft.replace(R.id.fragmentContainerView2, fragment);
        ft.commit();
    }
    public void loadFragmentImage(Fragment fragment,String image,String details) {
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        Bundle data=new Bundle();
        data.putString("imgs",image);
        data.putString("details",details);
        Log.d("Success", "Value: " + image+details);

        fragment.setArguments(data);

        ft.replace(R.id.fragmentContainerView4, fragment);
        ft.commit();
    }
    public void suz(View v){
        loadFragment(new listFragment(),"suz");
        loadFragmentImage(new CarDetails(),"img","White Car\n Price : 6 lakhs");
    }

    public void bmw(View v){
        loadFragment(new listFragment(),"bmw");
        loadFragmentImage(new CarDetails(),"img_2","White Car\n Price :155 lakhs");

    }
    public void hon(View v){
        loadFragment(new listFragment(),"hon");
        loadFragmentImage(new CarDetails(),"img_4","Blue Car\n Price :15 lakhs");
    }
    public void kia(View v){
        loadFragment(new listFragment(),"kia");
        loadFragmentImage(new CarDetails(),"img_6","Blue Car\n Price :25 lakhs");
    }


}
