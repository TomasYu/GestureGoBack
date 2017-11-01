package com.ireader.gesture;

import android.app.Activity;
import android.view.View;

/**
 * Activity手势处理器
 * Created by chenxingang on 2016/11/3.
 */

public interface IGuestureHandler {
    void onActivityCreate(Activity act);
    void onActivityPostCreate(Activity act);
    View findViewById(Activity act, int id);

    void enableGuesture(boolean enable);
    void connectStatusBar(View statusbar);
}
