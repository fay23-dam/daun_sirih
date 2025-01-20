package com.example.sispak_kel_9;

// tentang.java
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tentang extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);


    }

    public void personal(View view) {
        Intent intent = new Intent(tentang.this, Personal.class);
        startActivity(intent);
    }
}
