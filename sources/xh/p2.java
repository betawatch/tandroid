package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class p2 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new p2());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        n90 n90Var = (n90) view;
        n90Var.setGravity(v51Var.z);
        n90Var.setTextColor((int) v51Var.B);
        n90Var.setTextSize(1, v51Var.A);
        n90Var.setTypeface(v51Var.q ? AndroidUtilities.bold() : null);
        int i10 = v51Var.i;
        n90Var.setPadding(i10, 0, i10, v51Var.k);
        n90Var.setText(v51Var.l);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
