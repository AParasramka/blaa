package com.kaustubh.insomniatec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Options extends AppCompatActivity implements View.OnClickListener {

    LinearLayout l0, l1, l2;
    TextView t0, t1, t2;


    String user = "Eugene";
    int drink = 0;
    String good = "Haha";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_options);

        l0 = (LinearLayout) findViewById(R.id.screen0);
        //l1 = (LinearLayout) findViewById(R.id.screen1);
        //l1 = (LinearLayout) findViewById(R.id.screen1);

        t0 = (TextView) findViewById(R.id.txtBt0);
        //t1 = (TextView) findViewById(R.id.txtBt1);
        //t1 = (TextView) findViewById(R.id.txtBt2);

        t0.setOnClickListener(this);
        //t1.setOnClickListener(this);
        //t1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.txtBt0) {
            l0.setVisibility(View.GONE);
            //l1.setVisibility(View.VISIBLE);
      }
//      else if (view.getId() == R.id.txtBt1)
//      {
//            l1.setVisibility(View.GONE);
//            l2.setVisibility(View.VISIBLE);
            //}
            //else if (view.getId() == R.id.txtBt2)
            //{
            //l1.setVisibility(View.GONE);
            //l0.setVisibility(View.VISIBLE);
        finish();

    }
}
