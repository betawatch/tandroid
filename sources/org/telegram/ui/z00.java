package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z00 extends org.telegram.ui.Cells.m4 {
    public final org.telegram.ui.Cells.u3 r;

    public z00(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, true, 3);
        this.r = u3Var;
        u3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        u3Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        u3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(u3Var, w7.z5.a(18.0f, 22.0f, 17.0f, 22.0f, 0.0f, -1, (LocaleController.isRTL ? 3 : 5) | 48));
        w7.b6.b(u3Var, 0.04f, 1.2f);
    }
}
