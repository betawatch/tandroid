package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.qr;
import w7.y5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class x extends m4 {
    public final p6 r;

    public x(Context context, e6 e6Var) {
        super(context, e6Var);
        p6 p6Var = new p6(context, true, true, true);
        this.r = p6Var;
        p6Var.b(0.45f, 240L, qr.h);
        p6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextColor(j6.v0(j6.L6, e6Var));
        addView(p6Var, y5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(j6.v0(j6.h5, e6Var));
    }
}
