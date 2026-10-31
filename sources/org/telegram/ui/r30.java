package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r30 implements os0 {
    public final /* synthetic */ b50 a;

    public r30(b50 b50Var) {
        this.a = b50Var;
    }

    @Override // org.telegram.ui.os0
    public final void H0(org.telegram.messenger.jj jjVar) {
        b50 b50Var = this.a;
        b50Var.H1.I0(true);
        b50Var.T3.f.K0(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), 0, 0);
        b50Var.b.invalidate();
    }

    @Override // org.telegram.ui.os0
    public final void I(org.telegram.messenger.jj jjVar) {
        this.a.b.invalidate();
    }

    @Override // org.telegram.ui.os0
    public final /* synthetic */ TextureView k0() {
        return null;
    }
}
