package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class q extends h51 {
    static {
        h51.setup(new q());
    }

    public static i51 a(String str, CharSequence charSequence, int i10) {
        i51 J = i51.J(q.class);
        J.b = false;
        J.z = i10;
        J.l = str;
        J.m = charSequence;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        ((r) view).a(i51Var.l, i51Var.m, i51Var.z);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r(context, 0, e6Var);
    }
}
