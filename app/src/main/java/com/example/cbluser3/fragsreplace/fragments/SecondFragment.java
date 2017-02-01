package com.example.cbluser3.fragsreplace.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.cbluser3.fragsreplace.R;

/**
 * Created by cbluser3 on 1/2/17.
 */
public class SecondFragment extends Fragment {
    public EditText etFragTwo;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etFragTwo=(EditText)view.findViewById(R.id.etFrag2);

    }
}
