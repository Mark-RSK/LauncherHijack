package com.parrotgeek.launcherhijack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chooser(View view){
        Intent choose = new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME).setClassName("android","com.android.internal.app.ResolverActivity");
        startActivity(choose);
    }

}
