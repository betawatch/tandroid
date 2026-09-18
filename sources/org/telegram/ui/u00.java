package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class u00 extends org.telegram.ui.Cells.m4 {
    public final org.telegram.ui.Cells.u3 r;

    public u00(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, true, 3);
        this.r = u3Var;
        u3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        u3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, e6Var));
        u3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(u3Var, w7.y5.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        w7.a6.b(u3Var, 0.04f, 1.2f);
    }
}
