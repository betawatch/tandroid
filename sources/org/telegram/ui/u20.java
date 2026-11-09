package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u20 implements fr0 {
    public final /* synthetic */ e40 a;

    public u20(e40 e40Var) {
        this.a = e40Var;
    }

    @Override // org.telegram.ui.fr0
    public final void I(org.telegram.messenger.ij ijVar) {
        this.a.b.invalidate();
    }

    @Override // org.telegram.ui.fr0
    public final void I0(org.telegram.messenger.ij ijVar) {
        e40 e40Var = this.a;
        e40Var.H1.I0(true);
        e40Var.T3.f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        e40Var.b.invalidate();
    }

    @Override // org.telegram.ui.fr0
    public final /* synthetic */ TextureView l0() {
        return null;
    }
}
