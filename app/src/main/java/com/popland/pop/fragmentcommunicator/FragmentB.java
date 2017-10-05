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
public class FragmentB extends Fragment {
    TextView TVb;
    Button BTNb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.b_fragment,container,false);
        TVb = (TextView)v.findViewById(R.id.TVb);
        BTNb = (Button)v.findViewById(R.id.BTNb);
        BTNb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) getActivity().findViewById(R.id.TVa);
                tv.setText("fragment B change fragment A text");
            }
        });
        return v;
    }
    public void changeText(String s){
        TVb.setText(s);
    }
}
