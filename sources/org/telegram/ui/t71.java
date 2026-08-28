package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t71 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.k41.setup(new t71());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        ((u71) view).set(l41Var.z);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean contentsEquals(org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.l41 l41Var2) {
        return l41Var.z == l41Var2.z;
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new u71(context, b6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }
}
