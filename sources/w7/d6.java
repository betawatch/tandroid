package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x90;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class d6 {
    public static x90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.gc;
        x90 x90Var = new x90(context, null);
        x90Var.setTextSize(1, f7);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        if (z10) {
            x90Var.setTypeface(AndroidUtilities.bold());
        }
        return x90Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        TextView f10 = org.telegram.messenger.g0.f(context, 1, f7);
        f10.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        if (z10) {
            f10.setTypeface(AndroidUtilities.bold());
        }
        return f10;
    }
}
