package com.kevinmichie.interactivestory.UI;

import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.kevinmichie.interactivestory.Model.Page;
import com.kevinmichie.interactivestory.R;

public class StoryActivity extends AppCompatActivity {



    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if(name == null){
            name = "Friend";
        }
        Log.d(TAG,name);

    }

}