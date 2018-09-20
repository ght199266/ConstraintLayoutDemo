package com.lly.constraintlayoutdemo.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lly.constraintlayoutdemo.R;

/**
 * RatioFragment[v 1.0.0]
 * classes:com.lly.constraintlayoutdemo.fragment.RatioFragment
 *
 * @author lileiyi
 * @date 2018/9/19
 * @time 15:16
 * @description 比例
 */
public class RatioFragment extends Fragment {


    /**
     * android:layout_width="0dp"
     * android:layout_height="0dp"
     * app:layout_constraintDimensionRatio="H,16:9"
     */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.ratio_layout, container, false);
    }

    public static RatioFragment newInstanceRatioFragment() {
        return new RatioFragment();
    }
}
