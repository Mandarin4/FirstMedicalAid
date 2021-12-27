package com.pervayapomosh.firstmedicalaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class MedPomoshActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_pomosh3);
        setTitle((getResources().getString(R.string.textTemiAct3)));
    }

    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        Intent backintent = new Intent(this, TemiActivity.class);
        startActivity(backintent);finish();
    }
}