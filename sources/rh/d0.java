package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d0 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new d0());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        e0 e0Var = (e0) view;
        a aVar = (a) n41Var.G;
        c0 c0Var = (c0) n41Var.H;
        e0Var.a = aVar;
        e0Var.A = c0Var;
        e0Var.c(aVar);
        e0Var.i();
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        e0 e0Var = new e0(context, i10, c6Var);
        e0Var.setBackground(new u1(g6.v0(g6.d6, c6Var)));
        return e0Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean isClickable() {
        return false;
    }
}
