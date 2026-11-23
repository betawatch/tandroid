package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class v20 implements dr0 {
    public final /* synthetic */ f40 a;

    public v20(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // org.telegram.ui.dr0
    public final void G0(org.telegram.messenger.gj gjVar) {
        f40 f40Var = this.a;
        f40Var.L1.I0(true);
        f40Var.b4.f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        f40Var.b.invalidate();
    }

    @Override // org.telegram.ui.dr0
    public final void H(org.telegram.messenger.gj gjVar) {
        this.a.b.invalidate();
    }

    @Override // org.telegram.ui.dr0
    public final /* synthetic */ TextureView f0() {
        return null;
    }
}
