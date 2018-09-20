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
 * RelativePositionFragment[v 1.0.0]
 * classes:com.lly.constraintlayoutdemo.fragment.RelativePositionFragment
 *
 * @author lileiyi
 * @date 2018/9/18
 * @time 15:52
 * @description
 */
public class RelativePositionFragment extends Fragment {

    /**
     * there is the list of available constraints
     * layout_constraintLeft_toLeftOf
     * layout_constraintLeft_toRightOf
     * layout_constraintRight_toLeftOf
     * layout_constraintRight_toRightOf
     * layout_constraintTop_toTopOf
     * layout_constraintTop_toBottomOf
     * layout_constraintBottom_toTopOf
     * layout_constraintBottom_toBottomOf
     * layout_constraintBaseline_toBaselineOf
     * layout_constraintStart_toEndOf
     * layout_constraintStart_toStartOf
     * layout_constraintEnd_toStartOf
     * layout_constraintEnd_toEndOf
     */

    /**
     * Bias(偏差属性)
     * layout_constraintHorizontal_bias
     * layout_constraintVertical_bias
     */


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.relative_position_layout, container, false);
    }

    public static RelativePositionFragment newInstanceRelativeFragment() {
        return new RelativePositionFragment();
    }

}
