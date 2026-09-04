package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class z implements View.OnApplyWindowInsetsListener {
    public l1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ n c;

    public z(View view, n nVar) {
        this.b = view;
        this.c = nVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.c;
        if (i10 < 30) {
            a0.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return nVar.T0(view, h).g();
            }
        }
        this.a = h;
        l1 T0 = nVar.T0(view, h);
        if (i10 >= 30) {
            return T0.g();
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(view);
        return T0.g();
    }
}
