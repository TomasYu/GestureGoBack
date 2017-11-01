package com.xinyu.gesturegoback;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ireader.gesture.GuestureHandler;

public class SecondActivity extends AppCompatActivity {
    private GuestureHandler mGuestureHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mGuestureHandler = new GuestureHandler();
        mGuestureHandler.onActivityCreate(this);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mGuestureHandler.onActivityPostCreate(this);
    }

    @Override
    public View findViewById(int id) {
        View view = super.findViewById(id);
        if (view == null) {
            if (mGuestureHandler != null) {
                view=mGuestureHandler.findViewById(this,id);
            }
        }
        return view;
    }
}
