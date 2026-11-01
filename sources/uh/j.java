package uh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new j());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        k kVar = (k) view;
        n10 n10Var = (n10) b51Var.G;
        kVar.a.setText(n10Var.b);
        kVar.b.setText(n10Var.c);
        if (kVar.c != z10) {
            kVar.invalidate();
        }
        kVar.c = z10;
        kVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new k(context);
    }
}
