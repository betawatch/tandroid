package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y implements View.OnApplyWindowInsetsListener {
    public j1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ m c;

    public y(View view, m mVar) {
        this.b = view;
        this.c = mVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        j1 h = j1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        m mVar = this.c;
        if (i10 < 30) {
            z.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return mVar.R0(view, h).g();
            }
        }
        this.a = h;
        j1 R0 = mVar.R0(view, h);
        if (i10 >= 30) {
            return R0.g();
        }
        WeakHashMap weakHashMap = h0.a;
        x.c(view);
        return R0.g();
    }
}
