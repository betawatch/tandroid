// default package

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zgc implements View.OnApplyWindowInsetsListener {
    public l2d a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ nr7 c;

    public zgc(View view, nr7 nr7Var) {
        this.b = view;
        this.c = nr7Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l2d h = l2d.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        nr7 nr7Var = this.c;
        if (i < 30) {
            ahc.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return nr7Var.S(view, h).g();
            }
        }
        this.a = h;
        l2d S = nr7Var.S(view, h);
        if (i >= 30) {
            return S.g();
        }
        WeakHashMap weakHashMap = ihc.a;
        ygc.c(view);
        return S.g();
    }
}
