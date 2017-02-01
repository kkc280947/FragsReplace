package com.example.cbluser3.fragsreplace.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cbluser3.fragsreplace.R;
import com.example.cbluser3.fragsreplace.fragments.FirstFragment;
import com.example.cbluser3.fragsreplace.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnReplace;
    FirstFragment firstFragment=new FirstFragment();
    SecondFragment secondFragment=new SecondFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getToolbar();

        btnReplace=(Button)findViewById(R.id.btnFrag);
        btnReplace.setOnClickListener(this);


        FragmentTransaction fragmentTransaction=getSupportFragmentManager()
                .beginTransaction().add(R.id.flFrame1,firstFragment,"frag1");
        fragmentTransaction.commit();


       fragmentTransaction=getSupportFragmentManager().beginTransaction().add(R.id.flFrame2,secondFragment,"frag2");
       fragmentTransaction.commit();
    }

    private void getToolbar(){
        Toolbar toolbar=(Toolbar)findViewById(R.id.tbTool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public void onClick(View v) {

        FirstFragment fragment1=(FirstFragment) getSupportFragmentManager().findFragmentByTag("frag1");
        String name1=fragment1.etFragOne.getText().toString().trim();

        SecondFragment fragment2=(SecondFragment) getSupportFragmentManager().findFragmentByTag("frag2");
        String name2=fragment2.etFragTwo.getText().toString().trim();

        fragment1.etFragOne.setText(name2);
        fragment2.etFragTwo.setText(name1);

    }
}
