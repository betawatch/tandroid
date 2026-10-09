package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ea0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class b6 {
    public static ea0 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11 = org.telegram.ui.ActionBar.i6.gc;
        ea0 ea0Var = new ea0(context, null);
        ea0Var.setTextSize(1, f7);
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        if (z10) {
            ea0Var.setTypeface(AndroidUtilities.bold());
        }
        return ea0Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView f10 = org.telegram.messenger.q.f(context, 1, f7);
        f10.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        if (z10) {
            f10.setTypeface(AndroidUtilities.bold());
        }
        return f10;
    }
}
