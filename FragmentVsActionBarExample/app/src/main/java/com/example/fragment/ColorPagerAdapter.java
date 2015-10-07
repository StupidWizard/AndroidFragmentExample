package com.example.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.fragment.colorfragment.BlueFragment;
import com.example.fragment.colorfragment.GreenFragment;
import com.example.fragment.colorfragment.RedFragment;
import com.example.fragment.colorfragment.YellowFragment;

import java.util.LinkedList;

/**
 * This stupid code is created by thantieuhodo on 10/7/15.
 */
public class ColorPagerAdapter extends FragmentPagerAdapter {

    LinkedList<Fragment> listFragment;

    public ColorPagerAdapter(FragmentManager fm) {
        super(fm);

        listFragment = new LinkedList<Fragment>();

        RedFragment redFragment = new RedFragment();
        listFragment.add(redFragment);

        YellowFragment yellowFragment = new YellowFragment(2);
        listFragment.add(yellowFragment);

        GreenFragment greenFragment = new GreenFragment();
        listFragment.add(greenFragment);

        BlueFragment blueFragment = new BlueFragment();
        listFragment.add(blueFragment);

        YellowFragment yellowFragment1 = new YellowFragment(5);
        listFragment.add(yellowFragment1);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return listFragment.size();
    }
}
