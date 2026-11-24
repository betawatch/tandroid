// default package

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class xge {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return xt3.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return xt3.c(edgeEffect, f, f2);
        }
        wt3.a(edgeEffect, f, f2);
        return f;
    }
}
