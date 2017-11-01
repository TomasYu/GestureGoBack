package com.ireader.gesture;

import android.content.Context;

/**
 * Created by caoxinyu on 1/11/2017 5:34 PM.
 * <p>
 * 类的作用:
 */


public class Util {
    /**
     * dip转换成px
     * @param context
     * @param dip
     * @return
     */
    public static final int dipToPixel2(Context context, int dip) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dip * scale + 0.5f);
    }
}
