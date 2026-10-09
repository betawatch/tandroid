package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u6 extends org.telegram.ui.Components.gd {
    public final /* synthetic */ w6 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(w6 w6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.gd.W, 0, org.telegram.ui.Components.gd.a0);
        this.e0 = w6Var;
    }

    @Override // org.telegram.ui.Components.gd
    public final void d(int i10, boolean z10) {
        y6 y6Var = this.e0.e;
        if (!z10) {
            y6Var.b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < y6Var.a0.size()) {
                t6 t6Var = (t6) y6Var.a0.get(i12);
                if (t6Var != null && t6Var.a == 11 && t6Var.f == i10) {
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
            y6Var.b.j1();
        }
    }
}
