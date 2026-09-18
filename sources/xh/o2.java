package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class o2 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new o2());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        c90 c90Var = (c90) view;
        c90Var.setGravity(j51Var.z);
        c90Var.setTextColor((int) j51Var.B);
        c90Var.setTextSize(1, j51Var.A);
        c90Var.setTypeface(j51Var.q ? AndroidUtilities.bold() : null);
        int i10 = j51Var.i;
        c90Var.setPadding(i10, 0, i10, j51Var.k);
        c90Var.setText(j51Var.l);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new vb(context, 5, null);
    }
}
