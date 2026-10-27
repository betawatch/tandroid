package xg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x extends q4 {
    public final s6 r;

    public x(Context context, u6 u6Var) {
        super(context, u6Var);
        s6 s6Var = new s6(context, true, true, true);
        this.r = s6Var;
        s6Var.b(0.45f, 240L, ds.h);
        s6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        f7.Z(s6Var, y6.L6, u6Var);
        addView(s6Var, kb1.h(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        f7.i(y6.h5, this, u6Var);
    }
}
