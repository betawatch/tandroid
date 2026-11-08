package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ m c;

    public z(View view, m mVar) {
        this.b = view;
        this.c = mVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        m mVar = this.c;
        if (i7 < 30) {
            a0.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return mVar.S0(view, h).g();
            }
        }
        this.a = h;
        k1 S0 = mVar.S0(view, h);
        if (i7 >= 30) {
            return S0.g();
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(view);
        return S0.g();
    }
}
