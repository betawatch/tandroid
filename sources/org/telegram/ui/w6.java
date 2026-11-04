package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w6 extends org.telegram.ui.Components.lc {
    public final /* synthetic */ x6 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(x6 x6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.lc.a0, 0, org.telegram.ui.Components.lc.b0);
        this.f0 = x6Var;
    }

    @Override // org.telegram.ui.Components.lc
    public final void d(int i3, boolean z10) {
        z6 z6Var = (z6) this.f0.f;
        if (!z10) {
            z6Var.b.l1();
            return;
        }
        int i10 = -1;
        if (i3 == 8) {
            i3 = -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 < z6Var.g0.size()) {
                v6 v6Var = (v6) z6Var.g0.get(i11);
                if (v6Var != null && v6Var.a == 11 && v6Var.f == i3) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            z6Var.b.e1(new k2.v(i10, 7), 0, true);
        } else {
            z6Var.b.l1();
        }
    }
}
