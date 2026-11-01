package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w41 extends org.telegram.ui.Components.a51 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.a51.h(new w41());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        ((x41) view).set(b51Var.z);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean c(org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.b51 b51Var2) {
        return b51Var.z == b51Var2.z;
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new x41(context, p6Var);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.b51 b51Var2) {
        return b51Var.d == b51Var2.d;
    }
}
