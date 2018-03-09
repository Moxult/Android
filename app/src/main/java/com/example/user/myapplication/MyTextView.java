package com.example.user.myapplication;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.io.Console;

/**
 * Created by User on 06.03.2018.
 */

public class MyTextView extends TextView {

    private  static final String TAG = "MyView";

    public MyTextView(Context context) {
        super(context);
        Log.d(TAG, "ctor1");
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "ctor2");
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG, "ctor3");
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, " onTouchEvent()");

        return super.onTouchEvent(event);
    }

}
