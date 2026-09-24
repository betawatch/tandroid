package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.rr;
import w7.y5;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class x extends m4 {
    public final p6 r;

    public x(Context context, d6 d6Var) {
        super(context, d6Var);
        p6 p6Var = new p6(context, true, true, true);
        this.r = p6Var;
        p6Var.b(0.45f, 240L, rr.h);
        p6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextColor(h6.v0(h6.L6, d6Var));
        addView(p6Var, y5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(h6.v0(h6.h5, d6Var));
    }
}
