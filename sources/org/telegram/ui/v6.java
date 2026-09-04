package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class v6 extends org.telegram.ui.Components.ed {
    public final /* synthetic */ x6 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(x6 x6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.ed.W, 0, org.telegram.ui.Components.ed.a0);
        this.e0 = x6Var;
    }

    @Override // org.telegram.ui.Components.ed
    public final void d(int i10, boolean z10) {
        z6 z6Var = this.e0.e;
        if (!z10) {
            z6Var.b.i1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < z6Var.a0.size()) {
                u6 u6Var = (u6) z6Var.a0.get(i12);
                if (u6Var != null && u6Var.a == 11 && u6Var.f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            z6Var.b.d1(new i2.w(i11, 3), 0, true);
        } else {
            z6Var.b.i1();
        }
    }
}
