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
 * ChainsFragment[v 1.0.0]
 * classes:com.lly.constraintlayoutdemo.fragment.ChainsFragment
 *
 * @author lileiyi
 * @date 2018/9/19
 * @time 16:27
 * @description
 */
public class ChainsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.chains_layout, container, false);
    }


    public static ChainsFragment newInstanceChainsFragment() {
        return new ChainsFragment();
    }

}
