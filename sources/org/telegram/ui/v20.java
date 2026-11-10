package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v20 implements gr0 {
    public final /* synthetic */ f40 a;

    public v20(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // org.telegram.ui.gr0
    public final void I(org.telegram.messenger.ij ijVar) {
        this.a.b.invalidate();
    }

    @Override // org.telegram.ui.gr0
    public final void I0(org.telegram.messenger.ij ijVar) {
        f40 f40Var = this.a;
        f40Var.K1.I0(true);
        f40Var.W3.f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        f40Var.b.invalidate();
    }

    @Override // org.telegram.ui.gr0
    public final /* synthetic */ TextureView l0() {
        return null;
    }
}
