package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ss0 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ts0 d;

    public ss0(ts0 ts0Var, Context context) {
        this.d = ts0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return !((vs0) this.d.n.d.get(d1Var.b())).a.current;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        ug.k1 k1Var = (ug.k1) d1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        k1Var.a((vs0) premiumPreviewFragment.d.get(i7), i7 != b() - 1);
        k1Var.c(premiumPreviewFragment.e == i7, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        rs0 rs0Var = new rs0(this, this.c);
        rs0Var.setCirclePaintProvider(new lk0(7, this, rs0Var));
        return new org.telegram.ui.Components.xi0(rs0Var);
    }
}
