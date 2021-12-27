package com.pervayapomosh.firstmedicalaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class TemiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temi);
        setTitle("Первая медецинская помощь");

    }

    public void btnTemiAct1(View view){
        Intent intent = new Intent(this, MedPomoshActivity1.class);
        startActivity(intent);
        finish();
    }

    public void btnTemiAct2(View view){
        Intent intent = new Intent(this, MedPomoshActivity2.class);
        startActivity(intent);
        finish();
    }

    public void btnTemiAct3(View view){
        Intent intent = new Intent(this, MedPomoshActivity3.class);
        startActivity(intent);
        finish();
    }

    public void btnTemiAct4(View view){
        Intent intent = new Intent(this, MedPomoshActivity4.class);
        startActivity(intent);
        finish();
    }
    public void btnTemiAct5(View view){
        Intent intent = new Intent(this, MedPomoshActivity5.class);
        startActivity(intent);
        finish();
    }

    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        Intent backintent = new Intent(this, MainActivity.class);
        startActivity(backintent);finish();
    }
}