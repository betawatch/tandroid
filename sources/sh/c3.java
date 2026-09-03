package sh;

import android.content.Context;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.g90;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c3 extends m4 {
    public final g90 r;

    public c3(Context context, g6 g6Var) {
        super(context, g6Var);
        g90 g90Var = new g90(context, g6Var);
        this.r = g90Var;
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(k6.v0(k6.z6, g6Var));
        g90Var.setLinkTextColor(k6.v0(k6.L6, g6Var));
        g90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(g90Var, c6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
