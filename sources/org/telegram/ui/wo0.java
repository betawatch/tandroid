package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class wo0 extends org.telegram.ui.Components.n81 {
    public final /* synthetic */ tp0 a;

    public wo0(tp0 tp0Var) {
        this.a = tp0Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        tp0 tp0Var = this.a;
        if (i10 == 1) {
            return tp0Var.h;
        }
        if (i10 == 0) {
            return tp0Var.n;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return 2;
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
    }
}
