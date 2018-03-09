package com.example.user.myapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

/**
 * Created by User on 09.03.2018.
 */

public class MyLinearLayout extends LinearLayout {

    private  static final String TAG = "MyViewGroup";
    public MyLinearLayout(Context context) {
        super(context);
        Log.d(TAG, "ctor1");
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "ctor2");
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG, "ctor3");
    }


}
