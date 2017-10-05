package com.popland.pop.fragmentcommunicator;

import android.app.Dialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView TVmain, TV;
    Button BTNmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTNmain = (Button)findViewById(R.id.BTNmain);
        BTNmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add Fragment to Activity's layout
//                FragmentA fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fragmentA);
//                fragmentA.changeText("hello fragment A");
//
//                FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
//                fragmentB.changeText("hello fragment B");

                //add Fragment via coding(container is mandatory)
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentA fragmentA = new FragmentA();
                fragmentTransaction.add(R.id.frameLayout,fragmentA);
                Bundle bundle = new Bundle();
                bundle.putString("data","hihih");
                fragmentA.setArguments(bundle);
                fragmentTransaction.commit();
            }
        });
    }


}
