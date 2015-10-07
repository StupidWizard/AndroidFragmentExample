package com.example.fragment.colorfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment.R;

/**
 * This stupid code is created by thantieuhodo on 10/7/15.
 */
public class GreenFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_green, null, false);
        return v;
    }
}
