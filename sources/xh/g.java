package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class g extends a51 {
    static {
        a51.h(new g());
    }

    public static b51 i(int i10, String str, String str2) {
        b51 K = b51.K(g.class);
        K.k = i10;
        K.l = str;
        K.m = str2;
        return K;
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        ((h) view).a(b51Var.k, b51Var.l, b51Var.m);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new h(context, p6Var, false);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return false;
    }
}
