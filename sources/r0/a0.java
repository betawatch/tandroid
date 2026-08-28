package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 implements View.OnApplyWindowInsetsListener {
    public m1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ o c;

    public a0(View view, o oVar) {
        this.b = view;
        this.c = oVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m1 h = m1.h(view, windowInsets);
        int i9 = Build.VERSION.SDK_INT;
        o oVar = this.c;
        if (i9 < 30) {
            b0.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return oVar.L0(view, h).g();
            }
        }
        this.a = h;
        m1 L0 = oVar.L0(view, h);
        if (i9 >= 30) {
            return L0.g();
        }
        WeakHashMap weakHashMap = j0.a;
        z.c(view);
        return L0.g();
    }
}
