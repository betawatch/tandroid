package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v71 extends org.telegram.ui.Components.v41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new v71());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        ((w71) view).set(w41Var.z);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean contentsEquals(org.telegram.ui.Components.w41 w41Var, org.telegram.ui.Components.w41 w41Var2) {
        return w41Var.z == w41Var2.z;
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new w71(context, c6Var);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(org.telegram.ui.Components.w41 w41Var, org.telegram.ui.Components.w41 w41Var2) {
        return w41Var.d == w41Var2.d;
    }
}
