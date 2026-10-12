package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a0 implements View.OnApplyWindowInsetsListener {
    public l1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ o c;

    public a0(View view, o oVar) {
        this.b = view;
        this.c = oVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l1 h = l1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.c;
        if (i10 < 30) {
            b0.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return oVar.Q0(view, h).g();
            }
        }
        this.a = h;
        l1 Q0 = oVar.Q0(view, h);
        if (i10 >= 30) {
            return Q0.g();
        }
        WeakHashMap weakHashMap = j0.a;
        z.c(view);
        return Q0.g();
    }
}
