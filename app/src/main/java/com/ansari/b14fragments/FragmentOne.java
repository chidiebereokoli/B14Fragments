package com.ansari.b14fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment {

    // V4 n V7

Button button;
MyInterface myInterface;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myInterface = (MyInterface) getActivity();
    }



    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one,container,false);
        button = view.findViewById(R.id.buttonfragone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myInterface.myMethod("My DATA");
            }
        });
        return view;
    }
}
