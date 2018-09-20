package com.lly.constraintlayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.lly.constraintlayoutdemo.fragment.ChainsFragment;
import com.lly.constraintlayoutdemo.fragment.CircularPositioningFragment;
import com.lly.constraintlayoutdemo.fragment.RatioFragment;
import com.lly.constraintlayoutdemo.fragment.RelativePositionFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    private String[] titles = new String[]{"相对布局", "圆形定位", "比例(Ratio)", "链(Chains)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.vp_viewpager);
        mTabLayout = findViewById(R.id.tl_tablayout);
        setAdapter();
    }

    private void setAdapter() {
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return RelativePositionFragment.newInstanceRelativeFragment();
                    case 1:
                        return CircularPositioningFragment.newInstanceCircularFragment();
                    case 2:
                        return RatioFragment.newInstanceRatioFragment();
                    case 3:
                        return ChainsFragment.newInstanceChainsFragment();
                }
                return null;
            }

            @Override
            public int getCount() {
                return titles.length;
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];
            }
        });
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}
