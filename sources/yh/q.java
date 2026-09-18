package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class q extends i51 {
    static {
        i51.setup(new q());
    }

    public static j51 a(String str, CharSequence charSequence, int i10) {
        j51 J = j51.J(q.class);
        J.b = false;
        J.z = i10;
        J.l = str;
        J.m = charSequence;
        return J;
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        ((r) view).a(j51Var.l, j51Var.m, j51Var.z);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r(context, 0, f6Var);
    }
}
