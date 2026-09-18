package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class p2 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new p2());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        l90 l90Var = (l90) view;
        l90Var.setGravity(x51Var.z);
        l90Var.setTextColor((int) x51Var.B);
        l90Var.setTextSize(1, x51Var.A);
        l90Var.setTypeface(x51Var.q ? AndroidUtilities.bold() : null);
        int i10 = x51Var.i;
        l90Var.setPadding(i10, 0, i10, x51Var.k);
        l90Var.setText(x51Var.l);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, e6 e6Var) {
        return new xb(context, 5, null);
    }
}
