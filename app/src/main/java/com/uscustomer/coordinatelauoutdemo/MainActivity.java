package com.uscustomer.coordinatelauoutdemo;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {
    private Button btnSnack;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private AppBarLayout appBarLayout;
    private Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        collapsingToolbarLayout=(CollapsingToolbarLayout) findViewById(R.id.c_toolbar);
        collapsingToolbarLayout.setTitle("Collapsing Toolbar");
        appBarLayout=(AppBarLayout) findViewById(R.id.apbar_id);
        btnNext=(Button) findViewById(R.id.btn_new);




        /*
        *
        * add  addOnOffsetChangedListener on app bar.
        *
        * */
        appBarLayout.addOnOffsetChangedListener( new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                Log.e("offset---",""+verticalOffset);
                float percentage = ((float) Math.abs(verticalOffset) / appBarLayout.getTotalScrollRange());
                if(percentage==1.0)
                {
                    btnNext.setVisibility(View.VISIBLE);
                }else
                {
                    btnNext.setVisibility(View.GONE);
                }

                Log.e("percentage---",""+percentage);
            }  });



    }
}
