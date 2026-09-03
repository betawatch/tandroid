package uh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new h());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        long j10 = h51Var.B;
        ((i) view).a((int) j10, (int) (j10 >>> 32), h51Var.k, h51Var.l, h51Var.n, h51Var.q);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new i(context, g6Var, false);
    }
}
