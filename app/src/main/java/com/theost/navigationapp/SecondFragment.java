package com.theost.navigationapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.theost.navigationapp.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return FragmentSecondBinding.inflate(inflater).getRoot();
    }

    public static Fragment newInstance() {
        return new SecondFragment();
    }
}
