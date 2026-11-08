package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class s20 implements dr0 {
    public final /* synthetic */ c40 a;

    public s20(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // org.telegram.ui.dr0
    public final void I(org.telegram.messenger.ij ijVar) {
        this.a.b.invalidate();
    }

    @Override // org.telegram.ui.dr0
    public final void I0(org.telegram.messenger.ij ijVar) {
        c40 c40Var = this.a;
        c40Var.H1.I0(true);
        c40Var.T3.f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        c40Var.b.invalidate();
    }

    @Override // org.telegram.ui.dr0
    public final /* synthetic */ TextureView l0() {
        return null;
    }
}
