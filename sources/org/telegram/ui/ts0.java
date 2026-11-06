package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ts0 extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ us0 d;

    public ts0(us0 us0Var, Context context) {
        this.d = us0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return !((ws0) this.d.n.d.get(d1Var.b())).a.current;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        ug.k1 k1Var = (ug.k1) d1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        k1Var.a((ws0) premiumPreviewFragment.d.get(i7), i7 != b() - 1);
        k1Var.c(premiumPreviewFragment.e == i7, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ss0 ss0Var = new ss0(this, this.c);
        ss0Var.setCirclePaintProvider(new lk0(7, this, ss0Var));
        return new org.telegram.ui.Components.xi0(ss0Var);
    }
}
