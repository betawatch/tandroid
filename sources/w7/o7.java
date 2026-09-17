package w7;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class o7 {
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
