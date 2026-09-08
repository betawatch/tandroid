package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class q extends g51 {
    static {
        g51.setup(new q());
    }

    public static h51 a(String str, CharSequence charSequence, int i10) {
        h51 J = h51.J(q.class);
        J.b = false;
        J.z = i10;
        J.l = str;
        J.m = charSequence;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((r) view).a(h51Var.l, h51Var.m, h51Var.z);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r(context, 0, f6Var);
    }
}
