package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class u00 extends org.telegram.ui.Cells.l4 {
    public final org.telegram.ui.Cells.t3 r;

    public u00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, true, 3);
        this.r = t3Var;
        t3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        t3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(t3Var, w7.x5.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        w7.z5.b(t3Var, 0.04f, 1.2f);
    }
}
