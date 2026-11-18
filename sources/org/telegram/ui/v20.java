package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v20 implements dr0 {
    public final /* synthetic */ f40 a;

    public v20(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // org.telegram.ui.dr0
    public final void G0(org.telegram.messenger.fj fjVar) {
        f40 f40Var = this.a;
        f40Var.L1.I0(true);
        f40Var.b4.f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        f40Var.b.invalidate();
    }

    @Override // org.telegram.ui.dr0
    public final void H(org.telegram.messenger.fj fjVar) {
        this.a.b.invalidate();
    }

    @Override // org.telegram.ui.dr0
    public final /* synthetic */ TextureView f0() {
        return null;
    }
}
