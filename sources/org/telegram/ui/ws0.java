package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ws0 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ xs0 d;

    public ws0(xs0 xs0Var, Context context) {
        this.d = xs0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return !((zs0) this.d.n.d.get(d1Var.b())).a.current;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        ug.k1 k1Var = (ug.k1) d1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        k1Var.a((zs0) premiumPreviewFragment.d.get(i7), i7 != b() - 1);
        k1Var.c(premiumPreviewFragment.e == i7, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        vs0 vs0Var = new vs0(this, this.c);
        vs0Var.setCirclePaintProvider(new ok0(7, this, vs0Var));
        return new org.telegram.ui.Components.xi0(vs0Var);
    }
}
