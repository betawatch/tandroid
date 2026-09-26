package w7;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class p7 {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f7, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u0.c.c(edgeEffect, f7, f10);
        }
        u0.b.a(edgeEffect, f7, f10);
        return f7;
    }
}
