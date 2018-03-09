package com.example.user.myapplication;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/**
 * Created by User on 06.03.2018.
 */

public class MyViewGroup extends ViewGroup{

        private static final String TAG = "MyViewGroup";
        public MyViewGroup(Context context) {
            super(context);
            Log.d(TAG, "ctor1");
        }

        public MyViewGroup(Context context, AttributeSet attrs) {
            super(context, attrs);
            Log.d(TAG, "ctor2");
        }

        public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            Log.d(TAG, "ctor3");
        }


        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
        }

        @Override
        protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

        }


}
