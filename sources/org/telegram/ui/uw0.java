package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uw0 extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ vw0 d;

    public uw0(vw0 vw0Var, Context context) {
        this.d = vw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return !((xw0) this.d.n.d.get(l1Var.b())).a.current;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        eg.k2 k2Var = (eg.k2) l1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        k2Var.a((xw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        k2Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        tw0 tw0Var = new tw0(this, this.c);
        tw0Var.setCirclePaintProvider(new vl0(10, this, tw0Var));
        return new org.telegram.ui.Components.dl0(tw0Var);
    }
}
