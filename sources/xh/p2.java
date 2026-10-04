package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yb;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class p2 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new p2());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        q90 q90Var = (q90) view;
        q90Var.setGravity(g61Var.z);
        q90Var.setTextColor((int) g61Var.B);
        q90Var.setTextSize(1, g61Var.A);
        q90Var.setTypeface(g61Var.q ? AndroidUtilities.bold() : null);
        int i10 = g61Var.i;
        q90Var.setPadding(i10, 0, i10, g61Var.k);
        q90Var.setText(g61Var.l);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new yb(context, 5, null);
    }
}
