package ug;

import android.view.ViewGroup;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h1 extends sj0 {
    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return tg.b0.c().size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        c1 c1Var = (c1) d1Var.a;
        tg.b0 b0Var = (tg.b0) tg.b0.c().get(i3);
        c1Var.getClass();
        c1Var.setTypeface(b0Var.d());
        String str = b0Var.c;
        if (str == null) {
            str = bd.N0(b0Var.b);
        }
        c1Var.setText(str);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        c1 c1Var = new c1(viewGroup.getContext());
        c1Var.setLayoutParams(new u4.p0(-1, -2));
        return new bj0(c1Var);
    }
}
