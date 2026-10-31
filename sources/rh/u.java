package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u extends z41 {
    static {
        z41.h(new u());
    }

    public static a51 i(String str, CharSequence charSequence, int i10) {
        a51 K = a51.K(u.class);
        K.b = false;
        K.z = i10;
        K.l = str;
        K.m = charSequence;
        return K;
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        ((v) view).a(a51Var.z, a51Var.l, a51Var.m);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new v(0, context, p6Var);
    }
}
