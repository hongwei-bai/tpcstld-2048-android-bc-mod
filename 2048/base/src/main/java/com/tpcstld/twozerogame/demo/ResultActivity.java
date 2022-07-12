package com.tpcstld.twozerogame.demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.tpcstld.twozerogame.MainActivity;
import com.tpcstld.twozerogame.base.R;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result);
    }

    @Override
    protected void onResume() {
        super.onResume();

        final Context context = this;
        Button button = findViewById(R.id.button_ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
