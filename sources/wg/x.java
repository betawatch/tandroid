package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.q6;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class x extends l4 {
    public final q6 r;

    public x(Context context, d6 d6Var) {
        super(context, d6Var);
        q6 q6Var = new q6(context, true, true, true);
        this.r = q6Var;
        q6Var.b(0.45f, 240L, bs.h);
        q6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextColor(h6.w0(h6.L6, d6Var));
        addView(q6Var, z5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 80));
        setBackgroundColor(h6.w0(h6.h5, d6Var));
    }
}
