package com.dagger.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.dagger.R;
import com.dagger.adapter.NamesAdapter;
import com.dagger.databinding.ActivitySecondBinding;
import com.dagger.model.Battery;
import com.dagger.utilites.Utility;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class SecondActivity extends DaggerAppCompatActivity {

    private ActivitySecondBinding binding;
    @Inject
    Utility utility;
    @Inject
    NamesAdapter namesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setRecyclerViewData();

    }

    private void setRecyclerViewData() {
        binding.rvItems.setLayoutManager(new LinearLayoutManager(this));
        binding.rvItems.setAdapter(namesAdapter);
        namesAdapter.setData(utility.getNames());
        namesAdapter.notifyDataSetChanged();
    }
}