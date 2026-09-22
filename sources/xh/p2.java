package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class p2 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new p2());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        n90 n90Var = (n90) view;
        n90Var.setGravity(y51Var.z);
        n90Var.setTextColor((int) y51Var.B);
        n90Var.setTextSize(1, y51Var.A);
        n90Var.setTypeface(y51Var.q ? AndroidUtilities.bold() : null);
        int i10 = y51Var.i;
        n90Var.setPadding(i10, 0, i10, y51Var.k);
        n90Var.setText(y51Var.l);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new wb(context, 5, null);
    }
}
