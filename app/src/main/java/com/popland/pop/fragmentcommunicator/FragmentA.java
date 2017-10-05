package com.popland.pop.fragmentcommunicator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by hai on 15/07/2016.
 */
public class FragmentA extends Fragment {
    TextView TVa;
    Button BTNa;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.a_fragment,container,false);
        TVa = (TextView)v.findViewById(R.id.TVa);
        BTNa = (Button)v.findViewById(R.id.BTNa);
        Bundle bd = getArguments();
       String s = bd.getString("data");
        TVa.setText(s);
        BTNa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) getActivity().findViewById(R.id.TVmain);// current Activity containing FragmentA
                tv.setText("Fragment A change Main Text");

            }
        });
        return v;
    }
    public void changeText(String s){
        TVa.setText(s);
    }
}
