package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yb;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class p2 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new p2());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        q90 q90Var = (q90) view;
        q90Var.setGravity(h61Var.z);
        q90Var.setTextColor((int) h61Var.B);
        q90Var.setTextSize(1, h61Var.A);
        q90Var.setTypeface(h61Var.q ? AndroidUtilities.bold() : null);
        int i10 = h61Var.i;
        q90Var.setPadding(i10, 0, i10, h61Var.k);
        q90Var.setText(h61Var.l);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new yb(context, 5, null);
    }
}
