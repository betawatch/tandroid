package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qw0 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ rw0 d;

    public qw0(rw0 rw0Var, Context context) {
        this.d = rw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return !((tw0) this.d.n.d.get(b1Var.b())).a.current;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        sg.r1 r1Var = (sg.r1) b1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        r1Var.a((tw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        r1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        pw0 pw0Var = new pw0(this, this.c);
        pw0Var.setCirclePaintProvider(new ql0(9, this, pw0Var));
        return new org.telegram.ui.Components.wl0(pw0Var);
    }
}
