package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                return nVar.P0(view, h).g();
            }
        }
        this.a = h;
        l1 P0 = nVar.P0(view, h);
        if (i10 >= 30) {
            return P0.g();
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(view);
        return P0.g();
    }
}
