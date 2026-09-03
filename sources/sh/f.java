package sh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f extends g51 {
    static {
        g51.setup(new f());
    }

    public static h51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        h51 J = h51.J(f.class);
        J.d = i10;
        J.z = i11;
        J.k = i12;
        J.l = charSequence;
        J.m = str;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        ((g) view).a(h51Var.z, h51Var.k, h51Var.l, h51Var.m);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new g(context, g6Var);
    }
}
