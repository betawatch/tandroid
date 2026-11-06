package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class xy extends org.telegram.ui.Cells.n4 {
    public final org.telegram.ui.Cells.w3 r;

    public xy(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, true, 3);
        this.r = w3Var;
        w3Var.setGravity(org.telegram.messenger.hd.a0 ? 3 : 5);
        org.telegram.ui.ActionBar.r6.Z(w3Var, org.telegram.ui.ActionBar.k6.L6, f6Var);
        w3Var.setTextSize(org.telegram.messenger.g0.N(15.0f));
        addView(w3Var, c8.ha.d(-1, 18.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        c8.ka.b(w3Var, 0.04f, 1.2f);
    }
}
