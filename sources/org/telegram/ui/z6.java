package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z6 extends org.telegram.ui.Components.wc {
    public final /* synthetic */ b7 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(b7 b7Var, Context context) {
        super(context, 11, org.telegram.ui.Components.wc.T, 0, org.telegram.ui.Components.wc.U);
        this.b0 = b7Var;
    }

    @Override // org.telegram.ui.Components.wc
    public final void d(int i10, boolean z4) {
        d7 d7Var = this.b0.e;
        if (!z4) {
            d7Var.b.i1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < d7Var.X.size()) {
                y6 y6Var = (y6) d7Var.X.get(i12);
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
            d7Var.b.d1(new d4.b(i11, 3), 0, true);
        } else {
            d7Var.b.i1();
        }
    }
}
