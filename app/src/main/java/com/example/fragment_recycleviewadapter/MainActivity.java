package com.example.fragment_recycleviewadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void to_ContactFragment(View view) {
        Intent intent = new Intent(MainActivity.this,ContactFragment.class);
        startActivity(intent);
    }
}
