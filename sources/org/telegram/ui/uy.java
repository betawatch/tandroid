package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uy extends org.telegram.ui.Cells.n4 {
    public final org.telegram.ui.Cells.w3 r;

    public uy(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, true, 3);
        this.r = w3Var;
        w3Var.setGravity(org.telegram.messenger.bd.a0 ? 3 : 5);
        org.telegram.ui.ActionBar.r6.Z(w3Var, org.telegram.ui.ActionBar.k6.L6, e6Var);
        w3Var.setTextSize(org.telegram.messenger.g0.N(15.0f));
        addView(w3Var, b8.mf.d(-1, 18.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        b8.pf.b(w3Var, 0.04f, 1.2f);
    }
}
