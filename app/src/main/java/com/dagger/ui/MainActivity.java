package com.dagger.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.RequestManager;
import com.dagger.databinding.ActivityMainBinding;
import com.dagger.model.Battery;
import com.dagger.utilites.Utility;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    private static final String TAG = "MainActivity";

    private ActivityMainBinding binding;

    @Inject
    Battery battery;

    @Inject
    @Named("FirstName")
    String firstName;

    @Inject
    @Named("LastName")
    String lastName;

    @Inject
    RequestManager requestManager;

    @Inject
    Utility utility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        printNames();
        loadImage();
        loadFragment();
        setOnClickListener();
    }

    private void setOnClickListener() {
        binding.button.setOnClickListener(v -> {
            startActivity(new Intent(this,SecondActivity.class));
        });
    }

    private void loadFragment() {
        getSupportFragmentManager().beginTransaction().add(binding.flContainer.getId(),HomeFragment.newInstance()).addToBackStack(null).commit();
    }

    private void printNames() {
        Log.i(TAG, "onCreate: " + firstName + " "+lastName);
    }

    private void loadImage() {
        requestManager.load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfU-D8wCubuzDiHFO51U-0km3pUztmPQd09Q&usqp=CAU")
                .into(binding.ivImageView);

        if (utility.isConnectionAvailable(this))
            Toast.makeText(this, "Connection is available", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Connection is not available", Toast.LENGTH_SHORT).show();
    }
}