package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class v6 extends org.telegram.ui.Components.nc {
    public final /* synthetic */ w6 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(w6 w6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.nc.W, 0, org.telegram.ui.Components.nc.a0);
        this.e0 = w6Var;
    }

    @Override // org.telegram.ui.Components.nc
    public final void d(int i7, boolean z9) {
        y6 y6Var = (y6) this.e0.f;
        if (!z9) {
            y6Var.b.l1();
            return;
        }
        int i10 = -1;
        if (i7 == 8) {
            i7 = -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 < y6Var.f0.size()) {
                u6 u6Var = (u6) y6Var.f0.get(i11);
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
