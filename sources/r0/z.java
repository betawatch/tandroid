package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class z implements View.OnApplyWindowInsetsListener {
    public m1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ n c;

    public z(View view, n nVar) {
        this.b = view;
        this.c = nVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 h = m1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.c;
        if (i10 < 30) {
            a0.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return nVar.Q0(view, h).g();
            }
        }
        this.a = h;
        m1 Q0 = nVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(view);
        return Q0.g();
    }
}
