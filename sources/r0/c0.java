package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static m1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        m1 h = m1.h(null, rootWindowInsets);
        j1 j1Var = h.a;
        j1Var.r(h);
        j1Var.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i9, int i10) {
        view.setScrollIndicators(i9, i10);
    }
}
