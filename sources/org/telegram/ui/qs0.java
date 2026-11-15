package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qs0 extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ rs0 d;

    public qs0(rs0 rs0Var, Context context) {
        this.d = rs0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return !((ts0) this.d.n.d.get(e1Var.b())).a.current;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        ug.l1 l1Var = (ug.l1) e1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        l1Var.a((ts0) premiumPreviewFragment.d.get(i7), i7 != b() - 1);
        l1Var.c(premiumPreviewFragment.e == i7, false);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ps0 ps0Var = new ps0(this, this.c);
        ps0Var.setCirclePaintProvider(new xi0(11, this, ps0Var));
        return new org.telegram.ui.Components.cj0(ps0Var);
    }
}
