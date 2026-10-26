package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uw0 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ vw0 d;

    public uw0(vw0 vw0Var, Context context) {
        this.d = vw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return !((xw0) this.d.n.d.get(e1Var.b())).a.current;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        tg.r1 r1Var = (tg.r1) e1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        r1Var.a((xw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        r1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        tw0 tw0Var = new tw0(this, this.c);
        tw0Var.setCirclePaintProvider(new af0(13, this, tw0Var));
        return new org.telegram.ui.Components.vl0(tw0Var);
    }
}
