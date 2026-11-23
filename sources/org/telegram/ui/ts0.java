package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ts0 extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ us0 d;

    public ts0(us0 us0Var, Context context) {
        this.d = us0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return !((ws0) this.d.n.d.get(f1Var.b())).a.current;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        ug.n1 n1Var = (ug.n1) f1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        n1Var.a((ws0) premiumPreviewFragment.d.get(i7), i7 != b() - 1);
        n1Var.c(premiumPreviewFragment.e == i7, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ss0 ss0Var = new ss0(this, this.c);
        ss0Var.setCirclePaintProvider(new yi0(10, this, ss0Var));
        return new org.telegram.ui.Components.mj0(ss0Var);
    }
}
