package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class q extends u51 {
    static {
        u51.setup(new q());
    }

    public static v51 a(String str, CharSequence charSequence, int i10) {
        v51 J = v51.J(q.class);
        J.b = false;
        J.z = i10;
        J.l = str;
        J.m = charSequence;
        return J;
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((r) view).a(v51Var.l, v51Var.m, v51Var.z);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r(context, 0, d6Var);
    }
}
