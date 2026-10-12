package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zb;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class n2 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new n2());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        da0 da0Var = (da0) view;
        da0Var.setGravity(l61Var.z);
        da0Var.setTextColor((int) l61Var.B);
        da0Var.setTextSize(1, l61Var.A);
        da0Var.setTypeface(l61Var.q ? AndroidUtilities.bold() : null);
        int i10 = l61Var.i;
        da0Var.setPadding(i10, 0, i10, l61Var.k);
        da0Var.setText(l61Var.l);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new zb(context, 5, null);
    }
}
