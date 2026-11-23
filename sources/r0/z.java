package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ m c;

    public z(View view, m mVar) {
        this.b = view;
        this.c = mVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        m mVar = this.c;
        if (i7 < 30) {
            a0.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return mVar.P0(view, h).g();
            }
        }
        this.a = h;
        l1 P0 = mVar.P0(view, h);
        if (i7 >= 30) {
            return P0.g();
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(view);
        return P0.g();
    }
}
