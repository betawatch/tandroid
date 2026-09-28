package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class p2 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new p2());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        p90 p90Var = (p90) view;
        p90Var.setGravity(x51Var.z);
        p90Var.setTextColor((int) x51Var.B);
        p90Var.setTextSize(1, x51Var.A);
        p90Var.setTypeface(x51Var.q ? AndroidUtilities.bold() : null);
        int i10 = x51Var.i;
        p90Var.setPadding(i10, 0, i10, x51Var.k);
        p90Var.setText(x51Var.l);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
