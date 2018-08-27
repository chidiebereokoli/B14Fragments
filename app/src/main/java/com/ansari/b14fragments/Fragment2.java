package com.ansari.b14fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_two,container,false);
        tv = v.findViewById(R.id.textViewfragtwo);

        Bundle b = getArguments();
        String s = b.getString("mykey");
        tv.setText(s);


        return v;
    }

    public void myDataMethod(String d){

       // tv.setText(d);

    }
}
