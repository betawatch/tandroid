package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vs0 extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ws0 d;

    public vs0(ws0 ws0Var, Context context) {
        this.d = ws0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return !((ys0) this.d.n.d.get(d1Var.b())).a.current;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        ug.k1 k1Var = (ug.k1) d1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        k1Var.a((ys0) premiumPreviewFragment.d.get(i7), i7 != b() - 1);
        k1Var.c(premiumPreviewFragment.e == i7, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        us0 us0Var = new us0(this, this.c);
        us0Var.setCirclePaintProvider(new nk0(7, this, us0Var));
        return new org.telegram.ui.Components.yi0(us0Var);
    }
}
