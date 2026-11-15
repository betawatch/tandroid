package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                return mVar.M0(view, h).g();
            }
        }
        this.a = h;
        k1 M0 = mVar.M0(view, h);
        if (i7 >= 30) {
            return M0.g();
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(view);
        return M0.g();
    }
}
