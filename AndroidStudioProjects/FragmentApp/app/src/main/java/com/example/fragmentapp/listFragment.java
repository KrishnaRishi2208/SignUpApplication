package com.example.fragmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class listFragment extends Fragment implements AdapterView.OnItemClickListener {

    String[] carlist={"Swift", "Celerio"} ;
    String imstr="suz";
    String imstr2 = null;
    ListView lv;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);



//        ListView lv = (ListView)rootView.findViewById(R.id.list);
        // Inflate the layout for this fragment
//        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), androidx.constraintlayout.widget.R.layout.abc_activity_chooser_view_list_item, carlist);

        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        Bundle data = this.getArguments();

        if (data != null) {
            imstr = data.getString("comp");
            Log.d("Success3", "Value: " + imstr);
            imstr2 = String.valueOf(imstr);


        }

        super.onViewCreated(view, savedInstanceState);
        lv = view.findViewById(R.id.list);
        Log.d("Success31", "Value: " );

        Log.d("Success2", "value: " + imstr);
        if(imstr2!=null) {


            if (imstr2.equals("suz")) {
                carlist = new String[]{"Swift", "Celerio"};
            }
            if (imstr2.equals("bmw")) {
                carlist = new String[]{"X7", "M4"};
            }
            if (imstr2.equals("hon")) {
                carlist = new String[]{"City", "Jazz"};
            }
            if (imstr2.equals("kia")) {
                carlist = new String[]{"Seltos", "Sonet"};
            }
        }
        if(imstr2==null){
            carlist=new String[]{"Swift", "Celerio"};
        }
//        ListView lv=view.findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, carlist);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
        String[] mess = carlist;
        Toast.makeText(getActivity(), "Item: " + mess[position], Toast.LENGTH_SHORT).show();
        if(imstr.equals("suz")){
        if(mess[position].equals("Celerio")){
            Fragment fragment=new CarDetails();

            mainActivity m=(mainActivity) getActivity();
            m.loadFragmentImage(fragment,"img_1","Red Car \n Price :5 Lakhs");

        }
        if(mess[position].equals("Swift")){
            Fragment fragment=new CarDetails();


            mainActivity m=(mainActivity) getActivity();
            m.loadFragmentImage(fragment,"img","White Car \n Price :6 Lakhs");

        }}
        if(imstr.equals("bmw")){
            if(mess[position].equals("X7")){
                Fragment fragment=new CarDetails();

                mainActivity m=(mainActivity) getActivity();
                m.loadFragmentImage(fragment,"img_2","White Car \n Price :155 Lakhs");

            }
            if(mess[position].equals("M4")){
                Fragment fragment=new CarDetails();


                mainActivity m=(mainActivity) getActivity();
                m.loadFragmentImage(fragment,"img_3","Yellow Car \n Price :85 Lakhs");

            }
        }
        if(imstr.equals("hon")){
            if(mess[position].equals("City")){
                Fragment fragment=new CarDetails();


                mainActivity m=(mainActivity) getActivity();
                m.loadFragmentImage(fragment,"img_4","Blue Car \n Price :15 Lakhs");

            }
            if(mess[position].equals("Jazz")){
                Fragment fragment=new CarDetails();

                mainActivity m=(mainActivity) getActivity();
                m.loadFragmentImage(fragment,"img_5","Red Car \n Price :10 Lakhs");

            }
        }
        if(imstr.equals("kia")){
            if(mess[position].equals("Seltos")){
                Fragment fragment=new CarDetails();


                mainActivity m=(mainActivity) getActivity();
                m.loadFragmentImage(fragment,"img_6","Blue Car \n Price :25 Lakhs");

            }
            if(mess[position].equals("Sonet")){
                Fragment fragment=new CarDetails();

                mainActivity m=(mainActivity) getActivity();
                m.loadFragmentImage(fragment,"img_7","Red Car \n Price :15 Lakhs");

            }
        }
    }


}