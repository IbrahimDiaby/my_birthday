package com.example.matrixid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void HbdClick(View view){
        Intent hbd = new Intent(HomeActivity.this, HbdActivity.class);
        startActivity(hbd);
        finish();
    }

}
