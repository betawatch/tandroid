package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class r extends g61 {
    static {
        g61.setup(new r());
    }

    public static h61 a(String str, CharSequence charSequence, int i10) {
        h61 K = h61.K(r.class);
        K.b = false;
        K.z = i10;
        K.l = str;
        K.m = charSequence;
        return K;
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ((s) view).a(h61Var.l, h61Var.m, h61Var.z);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s(context, 0, d6Var);
    }
}
