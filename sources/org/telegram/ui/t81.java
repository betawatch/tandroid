package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class t81 extends org.telegram.ui.Components.w51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new t81());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        ((u81) view).set(x51Var.z);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean contentsEquals(org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.x51 x51Var2) {
        return x51Var.z == x51Var2.z;
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u81(context, d6Var);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean equals(org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.x51 x51Var2) {
        return x51Var.d == x51Var2.d;
    }
}
