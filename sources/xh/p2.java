package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class p2 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new p2());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        d90 d90Var = (d90) view;
        d90Var.setGravity(h51Var.z);
        d90Var.setTextColor((int) h51Var.B);
        d90Var.setTextSize(1, h51Var.A);
        d90Var.setTypeface(h51Var.q ? AndroidUtilities.bold() : null);
        int i10 = h51Var.i;
        d90Var.setPadding(i10, 0, i10, h51Var.k);
        d90Var.setText(h51Var.l);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
