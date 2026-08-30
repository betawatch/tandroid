package rh;

import android.content.Context;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.e90;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class d3 extends m4 {
    public final e90 r;

    public d3(Context context, f6 f6Var) {
        super(context, f6Var);
        e90 e90Var = new e90(context, f6Var);
        this.r = e90Var;
        e90Var.setTextSize(1, 14.0f);
        e90Var.setTextColor(j6.v0(j6.z6, f6Var));
        e90Var.setLinkTextColor(j6.v0(j6.L6, f6Var));
        e90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(e90Var, b6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
