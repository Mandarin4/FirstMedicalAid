package com.pervayapomosh.firstmedicalaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class MedPomoshActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_pomosh1);
        setTitle((getResources().getString(R.string.textTemiAct1)));

    }

    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        Intent backintent = new Intent(this, TemiActivity.class);
        startActivity(backintent);finish();
    }
}