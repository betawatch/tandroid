package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
