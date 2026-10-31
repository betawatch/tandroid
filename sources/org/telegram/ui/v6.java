package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v6 extends org.telegram.ui.Components.ic {
    public final /* synthetic */ w6 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(w6 w6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.ic.W, 0, org.telegram.ui.Components.ic.a0);
        this.e0 = w6Var;
    }

    @Override // org.telegram.ui.Components.ic
    public final void d(int i10, boolean z10) {
        y6 y6Var = (y6) this.e0.f;
        if (!z10) {
            y6Var.b.l1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < y6Var.f0.size()) {
                u6 u6Var = (u6) y6Var.f0.get(i12);
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
            y6Var.b.e1(new i2.w(i11, 7), 0, true);
        } else {
            y6Var.b.l1();
        }
    }
}
