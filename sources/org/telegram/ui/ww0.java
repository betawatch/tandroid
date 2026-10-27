package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ww0 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ xw0 d;

    public ww0(xw0 xw0Var, Context context) {
        this.d = xw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return !((zw0) this.d.n.d.get(e1Var.b())).a.current;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.n.d.size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        tg.r1 r1Var = (tg.r1) e1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        r1Var.a((zw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        r1Var.c(premiumPreviewFragment.e == i10, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        vw0 vw0Var = new vw0(this, this.c);
        vw0Var.setCirclePaintProvider(new cf0(13, this, vw0Var));
        return new org.telegram.ui.Components.wl0(vw0Var);
    }
}
