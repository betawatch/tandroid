package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class x6 extends org.telegram.ui.Components.ed {
    public final /* synthetic */ y6 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(y6 y6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.ed.W, 0, org.telegram.ui.Components.ed.a0);
        this.e0 = y6Var;
    }

    @Override // org.telegram.ui.Components.ed
    public final void d(int i10, boolean z10) {
        a7 a7Var = this.e0.e;
        if (!z10) {
            a7Var.b.m1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < a7Var.g0.size()) {
                w6 w6Var = (w6) a7Var.g0.get(i12);
                if (w6Var != null && w6Var.a == 11 && w6Var.f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            a7Var.b.f1(new i2.w(i11, 7), 0, true);
        } else {
            a7Var.b.m1();
        }
    }
}
