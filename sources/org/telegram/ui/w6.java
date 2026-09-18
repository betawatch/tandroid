package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class w6 extends org.telegram.ui.Components.bd {
    public final /* synthetic */ y6 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(y6 y6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.bd.W, 0, org.telegram.ui.Components.bd.a0);
        this.e0 = y6Var;
    }

    @Override // org.telegram.ui.Components.bd
    public final void d(int i10, boolean z10) {
        a7 a7Var = this.e0.e;
        if (!z10) {
            a7Var.b.k1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < a7Var.e0.size()) {
                v6 v6Var = (v6) a7Var.e0.get(i12);
                if (v6Var != null && v6Var.a == 11 && v6Var.f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            a7Var.b.f1(new i2.v(i11, 3), 0, true);
        } else {
            a7Var.b.k1();
        }
    }
}
