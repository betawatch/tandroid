package ph;

import android.content.Context;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c3 extends k4 {
    public final y80 r;

    public c3(Context context, c6 c6Var) {
        super(context, c6Var);
        y80 y80Var = new y80(context, c6Var);
        this.r = y80Var;
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(g6.v0(g6.z6, c6Var));
        y80Var.setLinkTextColor(g6.v0(g6.L6, c6Var));
        y80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(y80Var, f6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
