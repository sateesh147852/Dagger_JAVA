package com.dagger.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dagger.R;
import com.dagger.databinding.FragmentHomeBinding;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends DaggerFragment {

    @Inject
    @Named("FirstName")
    String firstName;

    @Inject
    @Named("LastName")
    String lastName;

    public static HomeFragment newInstance() {
        return new HomeFragment();

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentHomeBinding binding = FragmentHomeBinding.inflate(getLayoutInflater(),container,false);
        binding.tvName.setText(firstName + " "+lastName);
        return binding.getRoot();
    }
}