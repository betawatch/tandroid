package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static j1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        j1 h = j1.h(null, rootWindowInsets);
        g1 g1Var = h.a;
        g1Var.r(h);
        g1Var.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
