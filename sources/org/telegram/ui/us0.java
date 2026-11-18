package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class us0 extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ vs0 d;

    public us0(vs0 vs0Var, Context context) {
        this.d = vs0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return !((xs0) this.d.n.d.get(f1Var.b())).a.current;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        ug.o1 o1Var = (ug.o1) f1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        o1Var.a((xs0) premiumPreviewFragment.d.get(i7), i7 != b() - 1);
        o1Var.c(premiumPreviewFragment.e == i7, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ts0 ts0Var = new ts0(this, this.c);
        ts0Var.setCirclePaintProvider(new aj0(10, this, ts0Var));
        return new org.telegram.ui.Components.kj0(ts0Var);
    }
}
