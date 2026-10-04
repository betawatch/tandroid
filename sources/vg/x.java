package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.tr;
import w7.z5;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class x extends m4 {
    public final p6 r;

    public x(Context context, d6 d6Var) {
        super(context, d6Var);
        p6 p6Var = new p6(context, true, true, true);
        this.r = p6Var;
        p6Var.b(0.45f, 240L, tr.h);
        p6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextColor(i6.v0(i6.L6, d6Var));
        addView(p6Var, z5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(i6.v0(i6.h5, d6Var));
    }
}
