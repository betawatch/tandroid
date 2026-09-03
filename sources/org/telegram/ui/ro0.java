package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ro0 extends org.telegram.ui.Components.d81 {
    public final /* synthetic */ np0 a;

    public ro0(np0 np0Var) {
        this.a = np0Var;
    }

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        np0 np0Var = this.a;
        if (i10 == 1) {
            return np0Var.h;
        }
        if (i10 == 0) {
            return np0Var.n;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.d81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
    }
}
