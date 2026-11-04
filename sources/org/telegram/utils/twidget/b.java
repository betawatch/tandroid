package org.telegram.utils.twidget;

import android.graphics.BlendMode;
import android.graphics.Paint;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public abstract class b {
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

    public static void a(int i3, Paint paint) {
        BlendMode blendMode;
        if (i3 > 0) {
            BlendMode[] blendModeArr = a;
            if (i3 < blendModeArr.length) {
                blendMode = blendModeArr[i3];
                paint.setBlendMode(blendMode);
            }
        }
        blendMode = null;
        paint.setBlendMode(blendMode);
    }
}
