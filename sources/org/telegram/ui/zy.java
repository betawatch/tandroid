package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zy extends org.telegram.ui.Cells.n4 {
    public final org.telegram.ui.Cells.w3 r;

    public zy(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, true, 3);
        this.r = w3Var;
        w3Var.setGravity(org.telegram.messenger.id.a0 ? 3 : 5);
        org.telegram.ui.ActionBar.s6.Y(w3Var, org.telegram.ui.ActionBar.l6.L6, g6Var);
        w3Var.setTextSize(org.telegram.messenger.g0.N(15.0f));
        addView(w3Var, c8.ha.d(-1, 18.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        c8.ka.b(w3Var, 0.04f, 1.2f);
    }
}
