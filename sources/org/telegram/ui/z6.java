package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class z6 extends org.telegram.ui.Components.fd {
    public final /* synthetic */ b7 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(b7 b7Var, Context context) {
        super(context, 11, org.telegram.ui.Components.fd.W, 0, org.telegram.ui.Components.fd.a0);
        this.e0 = b7Var;
    }

    @Override // org.telegram.ui.Components.fd
    public final void d(int i10, boolean z10) {
        d7 d7Var = this.e0.e;
        if (!z10) {
            d7Var.b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < d7Var.a0.size()) {
                y6 y6Var = (y6) d7Var.a0.get(i12);
                if (y6Var != null && y6Var.a == 11 && y6Var.f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            d7Var.b.e1(new i2.v(i11, 7), 0, true);
        } else {
            d7Var.b.j1();
        }
    }
}
