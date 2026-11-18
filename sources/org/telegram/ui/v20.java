package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
