package com.pactera.commonres.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.utils.AutoLayoutHelper;

public class AutoCardView extends CardView {

    private final AutoLayoutHelper mHelper = new AutoLayoutHelper(this);


    public AutoCardView(@NonNull Context context) {
        super(context);
    }

    public AutoCardView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoCardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if(!isInEditMode()){
            mHelper.adjustChildren();
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new AutoFrameLayout.LayoutParams(getContext(),attrs);
    }
}
