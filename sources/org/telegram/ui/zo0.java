package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class zo0 extends org.telegram.ui.Components.y81 {
    public final /* synthetic */ wp0 a;

    public zo0(wp0 wp0Var) {
        this.a = wp0Var;
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        wp0 wp0Var = this.a;
        if (i10 == 1) {
            return wp0Var.h;
        }
        if (i10 == 0) {
            return wp0Var.n;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.y81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
    }
}
