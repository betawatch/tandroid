package org.telegram.utils.twidget;

import android.graphics.BlendMode;
import android.graphics.Paint;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public abstract class f {
    public static final BlendMode[] a;

    static {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        blendMode = BlendMode.SRC_OVER;
        blendMode2 = BlendMode.SRC_IN;
        blendMode3 = BlendMode.DST_IN;
        blendMode4 = BlendMode.PLUS;
        blendMode5 = BlendMode.SCREEN;
        blendMode6 = BlendMode.OVERLAY;
        blendMode7 = BlendMode.COLOR_DODGE;
        blendMode8 = BlendMode.COLOR_BURN;
        blendMode9 = BlendMode.SOFT_LIGHT;
        a = new BlendMode[]{blendMode, blendMode2, BlendMode.SRC_OUT, BlendMode.SRC_ATOP, BlendMode.DST_OVER, blendMode3, BlendMode.DST_OUT, BlendMode.DST_ATOP, blendMode4, BlendMode.SRC, BlendMode.XOR, BlendMode.MULTIPLY, blendMode5, blendMode6, BlendMode.DARKEN, BlendMode.LIGHTEN, blendMode7, blendMode8, BlendMode.HARD_LIGHT, blendMode9, BlendMode.DIFFERENCE, BlendMode.EXCLUSION, BlendMode.HUE, BlendMode.SATURATION, BlendMode.COLOR, BlendMode.LUMINOSITY};
    }

    public static void a(int i7, Paint paint) {
        BlendMode blendMode;
        if (i7 > 0) {
            BlendMode[] blendModeArr = a;
            if (i7 < blendModeArr.length) {
                blendMode = blendModeArr[i7];
                paint.setBlendMode(blendMode);
            }
        }
        blendMode = null;
        paint.setBlendMode(blendMode);
    }
}
