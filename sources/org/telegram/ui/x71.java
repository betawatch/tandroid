package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x71 extends org.telegram.ui.Components.s61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.s61.setup(new x71());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        ((y71) view).set(t61Var.z);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean contentsEquals(org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.t61 t61Var2) {
        return t61Var.z == t61Var2.z;
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new y71(context, u6Var);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean equals(org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.t61 t61Var2) {
        return t61Var.d == t61Var2.d;
    }
}
