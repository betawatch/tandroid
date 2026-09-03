package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.c;
        if (i10 < 30) {
            b0.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return oVar.M0(view, h).g();
            }
        }
        this.a = h;
        m1 M0 = oVar.M0(view, h);
        if (i10 >= 30) {
            return M0.g();
        }
        WeakHashMap weakHashMap = j0.a;
        z.c(view);
        return M0.g();
    }
}
