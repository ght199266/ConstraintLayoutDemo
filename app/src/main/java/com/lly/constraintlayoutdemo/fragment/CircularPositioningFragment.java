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
 * CircularPositioningFragment[v 1.0.0]
 * classes:com.lly.constraintlayoutdemo.fragment.CircularPositioningFragment
 *
 * @author lileiyi
 * @date 2018/9/19
 * @time 10:42
 * @description 圆形定位
 */
public class CircularPositioningFragment extends Fragment {


    /**
     * app:layout_constraintCircle="@id/xxx"
     * app:layout_constraintCircleAngle="45"
     * app:layout_constraintCircleRadius="70dp" />
     */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.circular_position_layout, container, false);
    }

    public static CircularPositioningFragment newInstanceCircularFragment() {
        return new CircularPositioningFragment();
    }
}
