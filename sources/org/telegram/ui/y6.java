package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class y6 extends org.telegram.ui.Components.dd {
    public final /* synthetic */ a7 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(a7 a7Var, Context context) {
        super(context, 11, org.telegram.ui.Components.dd.W, 0, org.telegram.ui.Components.dd.a0);
        this.e0 = a7Var;
    }

    @Override // org.telegram.ui.Components.dd
    public final void d(int i10, boolean z10) {
        c7 c7Var = this.e0.e;
        if (!z10) {
            c7Var.b.l1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < c7Var.a0.size()) {
                x6 x6Var = (x6) c7Var.a0.get(i12);
                if (x6Var != null && x6Var.a == 11 && x6Var.f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            c7Var.b.f1(new i2.v(i11, 7), 0, true);
        } else {
            c7Var.b.l1();
        }
    }
}
