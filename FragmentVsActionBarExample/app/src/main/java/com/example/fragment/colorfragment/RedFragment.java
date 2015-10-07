package com.example.fragment.colorfragment;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragment.MainActivity;
import com.example.fragment.R;

/**
 * This stupid code is created by thantieuhodo on 10/7/15.
 */
public class RedFragment extends Fragment {

    public RedFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_red, null, false);

        Log.e("FragmentExample: ", "create view RedFragment");

        if (!((MainActivity)getActivity()).isCreatedView()) {
            setUpCustomActionBar(this.getActivity());
            ((MainActivity)getActivity()).markCreateViewDone();
        }

        return v;

    }


    @Override
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);

        if (menuVisible){
            if (getActivity() != null) {
                this.setUpCustomActionBar(this.getActivity());
            }
        }
    }

    private void setUpCustomActionBar(Activity activity){
        ViewGroup actionBarLayout = (ViewGroup) activity.getLayoutInflater().inflate(R.layout.actionbar_custom, null);

        Button menupin = (Button) actionBarLayout.findViewById(R.id.rl_menu_map);
        Button menufilter = (Button) actionBarLayout.findViewById(R.id.rl_menu_filter);

        ActionBar actionBar = activity.getActionBar();

        if (actionBar != null) {
            Log.e("FragmentExample: ", "red create actionbar ok");
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setCustomView(actionBarLayout);

            menufilter.setVisibility(View.GONE);
            menupin.setVisibility(View.GONE);
        }
        else {
            Log.e("FragmentExample: ", "red create actionbar fail");
        }
    }
}
