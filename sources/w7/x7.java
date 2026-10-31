package w7;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class x7 {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f7, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.d.c(edgeEffect, f7, f10);
        }
        u0.c.a(edgeEffect, f7, f10);
        return f7;
    }
}
