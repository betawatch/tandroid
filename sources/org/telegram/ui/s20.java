package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class s20 implements br0 {
    public final /* synthetic */ c40 a;

    public s20(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // org.telegram.ui.br0
    public final void G0(org.telegram.messenger.gj gjVar) {
        c40 c40Var = this.a;
        c40Var.L1.I0(true);
        c40Var.b4.f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        c40Var.b.invalidate();
    }

    @Override // org.telegram.ui.br0
    public final void I(org.telegram.messenger.gj gjVar) {
        this.a.b.invalidate();
    }

    @Override // org.telegram.ui.br0
    public final /* synthetic */ TextureView g0() {
        return null;
    }
}
