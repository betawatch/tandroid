package r0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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

    public static void b(View view, int i7, int i10) {
        view.setScrollIndicators(i7, i10);
    }
}
