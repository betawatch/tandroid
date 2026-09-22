package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qr;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class x extends m4 {
    public final n6 r;

    public x(Context context, e6 e6Var) {
        super(context, e6Var);
        n6 n6Var = new n6(context, true, true, true);
        this.r = n6Var;
        n6Var.b(0.45f, 240L, qr.h);
        n6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        n6Var.setTextSize(AndroidUtilities.dp(15.0f));
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setTextColor(i6.v0(i6.L6, e6Var));
        addView(n6Var, x5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(i6.v0(i6.h5, e6Var));
    }
}
