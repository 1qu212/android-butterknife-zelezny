package com.avast.butterknifezelezny.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Try to generate Fragment injections by clicking to R.layout.fragment_main
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}