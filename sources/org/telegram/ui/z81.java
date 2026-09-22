package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z81 extends org.telegram.ui.Components.h51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new z81());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        ((a91) view).set(i51Var.z);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(org.telegram.ui.Components.i51 i51Var, org.telegram.ui.Components.i51 i51Var2) {
        return i51Var.z == i51Var2.z;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new a91(context, e6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(org.telegram.ui.Components.i51 i51Var, org.telegram.ui.Components.i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }
}
