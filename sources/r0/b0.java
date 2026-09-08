package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class b0 {
    public static l1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        l1 h = l1.h(null, rootWindowInsets);
        i1 i1Var = h.a;
        i1Var.r(h);
        i1Var.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
