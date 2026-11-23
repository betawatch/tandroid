package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class us0 extends org.telegram.ui.Components.dk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ vs0 d;

    public us0(vs0 vs0Var, Context context) {
        this.d = vs0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return !((xs0) this.d.n.d.get(f1Var.b())).a.current;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        ug.n1 n1Var = (ug.n1) f1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        n1Var.a((xs0) premiumPreviewFragment.d.get(i7), i7 != b() - 1);
        n1Var.c(premiumPreviewFragment.e == i7, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ts0 ts0Var = new ts0(this, this.c);
        ts0Var.setCirclePaintProvider(new aj0(10, this, ts0Var));
        return new org.telegram.ui.Components.mj0(ts0Var);
    }
}
