package com.ansari.b14fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements MyInterface{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction().add(R.id.mylayout,new FragmentOne(),"mytag").commit();


    }

    @Override
    public void myMethod(String data) {

       /*Fragment2 fragment2 = (Fragment2) getFragmentManager().findFragmentById(R.id.fragmentTwo);
       fragment2.myDataMethod(data);*/

    Fragment2 fragment2 = new Fragment2();
    Bundle bundle = new Bundle();
    bundle.putString("mykey",data);
    fragment2.setArguments(bundle);

getFragmentManager().beginTransaction().replace(R.id.mylayout,fragment2).commit();


    }
}
