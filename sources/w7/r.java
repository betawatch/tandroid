package w7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class r {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.n3.a(view, charSequence);
            return;
        }
        m.p3 p3Var = m.p3.v;
        if (p3Var != null && p3Var.a == view) {
            m.p3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m.p3(view, charSequence);
            return;
        }
        m.p3 p3Var2 = m.p3.w;
        if (p3Var2 != null && p3Var2.a == view) {
            p3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
