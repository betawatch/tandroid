package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class z implements View.OnApplyWindowInsetsListener {
    public k1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ n c;

    public z(View view, n nVar) {
        this.b = view;
        this.c = nVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 h = k1.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.c;
        if (i10 < 30) {
            a0.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return nVar.B0(view, h).g();
            }
        }
        this.a = h;
        k1 B0 = nVar.B0(view, h);
        if (i10 >= 30) {
            return B0.g();
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(view);
        return B0.g();
    }
}
