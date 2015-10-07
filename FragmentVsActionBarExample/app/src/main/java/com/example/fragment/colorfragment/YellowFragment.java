package com.example.fragment.colorfragment;

import android.annotation.SuppressLint;
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
import android.widget.TextView;

import com.example.fragment.R;

/**
 * This stupid code is created by thantieuhodo on 10/7/15.
 */
@SuppressLint("ValidFragment")
public class YellowFragment extends Fragment {

    private int id = 0;

    @SuppressLint("ValidFragment")
    public YellowFragment(int pId) {
        super();
        id = pId;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_yellow, null, false);

        TextView text = (TextView) v.findViewById(R.id.frag_yellow_text);
        text.setText("Yellow " + id);

        Log.e("FragmentExample: ", "create view YellowFragment");

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
            Log.e("FragmentExample: ", "yellow create actionbar ok");

            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setCustomView(actionBarLayout);

            menufilter.setVisibility(View.VISIBLE);
            menupin.setVisibility(View.GONE);
        }
    }
}

