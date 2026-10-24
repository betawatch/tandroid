package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class w71 extends org.telegram.ui.Components.l61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new w71());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        ((x71) view).set(m61Var.z);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean contentsEquals(org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.m61 m61Var2) {
        return m61Var.z == m61Var2.z;
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new x71(context, g6Var);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean equals(org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.m61 m61Var2) {
        return m61Var.d == m61Var2.d;
    }
}
