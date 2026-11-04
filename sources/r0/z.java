package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int i3 = Build.VERSION.SDK_INT;
        m mVar = this.c;
        if (i3 < 30) {
            a0.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return mVar.R0(view, h).g();
            }
        }
        this.a = h;
        k1 R0 = mVar.R0(view, h);
        if (i3 >= 30) {
            return R0.g();
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(view);
        return R0.g();
    }
}
