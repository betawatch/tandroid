package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r00 extends org.telegram.ui.Cells.l4 {
    public final org.telegram.ui.Cells.s3 r;

    public r00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, true, true, true, 3);
        this.r = s3Var;
        s3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        s3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        s3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(s3Var, k7.b6.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        k7.d6.b(s3Var, 0.04f, 1.2f);
    }
}
