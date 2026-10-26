package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                return nVar.P0(view, h).g();
            }
        }
        this.a = h;
        k1 P0 = nVar.P0(view, h);
        if (i10 >= 30) {
            return P0.g();
        }
        WeakHashMap weakHashMap = i0.a;
        y.c(view);
        return P0.g();
    }
}
