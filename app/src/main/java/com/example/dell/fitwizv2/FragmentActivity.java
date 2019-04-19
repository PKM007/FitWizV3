package com.example.dell.fitwizv2;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    public void ChangeFragment(View view){
        Fragment fragment;

        if(view==findViewById(R.id.button))
        {
            fragment=new FragmentOne();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment);
            ft.commit();

        }

        if(view == findViewById(R.id.button2))
        {
            fragment=new FragmentTwo();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment);
            ft.commit();
        }
    }
}
