package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class uw0 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ vw0 d;

    public uw0(vw0 vw0Var, Context context) {
        this.d = vw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return !((xw0) this.d.n.d.get(m1Var.b())).a.current;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        fg.j2 j2Var = (fg.j2) m1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        j2Var.a((xw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        j2Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        tw0 tw0Var = new tw0(this, this.c);
        tw0Var.setCirclePaintProvider(new vl0(10, this, tw0Var));
        return new org.telegram.ui.Components.el0(tw0Var);
    }
}
