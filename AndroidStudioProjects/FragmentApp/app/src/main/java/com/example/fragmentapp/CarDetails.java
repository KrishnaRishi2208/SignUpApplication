package com.example.fragmentapp;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class CarDetails extends Fragment {
    ImageView imv;
    String imstr,detstr;
    TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment




        return inflater.inflate(R.layout.fragment_car_details, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Bundle data=this.getArguments();
        if(data!=null){
            imstr=data.getString("imgs");
            detstr= data.getString("details");

        }

        super.onViewCreated(view, savedInstanceState);

        imv=view.findViewById(R.id.imageView2);
        Log.d("Success2","value: "+imstr);
        String imagename=String.valueOf(imstr);
        imv.setImageResource(getResources().getIdentifier(imagename, "drawable", getActivity().getPackageName()));
        tv=view.findViewById(R.id.textView4);
        tv.setText(detstr);
    }
}