package com.pactera.commonres.utils;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

import com.pactera.commonres.R;

public class Anim {

    public static void exit(Activity activity){
        activity.overridePendingTransition(R.anim.public_translate_left_to_center,R.anim.public_translate_center_to_right);
    }

    public static void in(Activity activity){
        activity.overridePendingTransition(R.anim.public_translate_right_to_center,R.anim.public_translate_center_to_left);
    }


    public static void  clear(ImageView  imageview){
        if (imageview != null)
            return;
        imageview.setImageResource(0);
        imageview.clearAnimation();
        imageview.setVisibility(View.GONE);
    }
}
