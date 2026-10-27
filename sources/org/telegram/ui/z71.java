package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z71 extends org.telegram.ui.Components.t61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new z71());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        ((a81) view).set(u61Var.z);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean contentsEquals(org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.u61 u61Var2) {
        return u61Var.z == u61Var2.z;
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new a81(context, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.u61 u61Var2) {
        return u61Var.d == u61Var2.d;
    }
}
