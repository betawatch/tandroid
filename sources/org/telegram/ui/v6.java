package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v6 extends org.telegram.ui.Components.qc {
    public final /* synthetic */ w6 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(w6 w6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.qc.a0, 0, org.telegram.ui.Components.qc.b0);
        this.f0 = w6Var;
    }

    @Override // org.telegram.ui.Components.qc
    public final void d(int i7, boolean z10) {
        y6 y6Var = (y6) this.f0.f;
        if (!z10) {
            y6Var.b.l1();
            return;
        }
        int i10 = -1;
        if (i7 == 8) {
            i7 = -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 < y6Var.g0.size()) {
                u6 u6Var = (u6) y6Var.g0.get(i11);
                if (u6Var != null && u6Var.a == 11 && u6Var.f == i7) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            y6Var.b.e1(new l2.u(i10, 3), 0, true);
        } else {
            y6Var.b.l1();
        }
    }
}
