package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u20 implements dr0 {
    public final /* synthetic */ e40 a;

    public u20(e40 e40Var) {
        this.a = e40Var;
    }

    @Override // org.telegram.ui.dr0
    public final void G(org.telegram.messenger.fj fjVar) {
        this.a.b.invalidate();
    }

    @Override // org.telegram.ui.dr0
    public final /* synthetic */ TextureView T() {
        return null;
    }

    @Override // org.telegram.ui.dr0
    public final void u0(org.telegram.messenger.fj fjVar) {
        e40 e40Var = this.a;
        e40Var.L1.I0(true);
        e40Var.b4.f.L0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        e40Var.b.invalidate();
    }
}
