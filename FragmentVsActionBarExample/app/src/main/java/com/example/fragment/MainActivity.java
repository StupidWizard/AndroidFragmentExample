package com.example.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;

// TODO: Note!! Fragment from support.v4 !!!
public class MainActivity extends FragmentActivity implements View.OnClickListener{

    private FragmentManager fragmentManager;

    private ColorPagerAdapter adapter;

    private ViewPager viewPager;

    private boolean markCreatedView = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.main_act_pager);
        initView();

        findViewById(R.id.main_act_btn_red).setOnClickListener(this);
        findViewById(R.id.main_act_btn_yellow).setOnClickListener(this);
        findViewById(R.id.main_act_btn_green).setOnClickListener(this);
        findViewById(R.id.main_act_btn_blue).setOnClickListener(this);
        findViewById(R.id.main_act_btn_yellow2).setOnClickListener(this);
    }


    public boolean isCreatedView() {
        return markCreatedView;
    }

    public void markCreateViewDone() {
        markCreatedView = true;
    }

    private void initView() {
        fragmentManager = getSupportFragmentManager();

        adapter = new ColorPagerAdapter(fragmentManager);

        viewPager.setAdapter(adapter);


        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_act_btn_red:
                viewPager.setCurrentItem(0);
                break;

            case R.id.main_act_btn_yellow:
                viewPager.setCurrentItem(1);
                break;

            case R.id.main_act_btn_green:
                viewPager.setCurrentItem(2);
                break;

            case R.id.main_act_btn_blue:
                viewPager.setCurrentItem(3);
                break;

            case R.id.main_act_btn_yellow2:
                viewPager.setCurrentItem(4);
                break;
        }
    }
}
