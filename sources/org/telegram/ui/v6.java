package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v6 extends org.telegram.ui.Components.sc {
    public final /* synthetic */ x6 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(x6 x6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.sc.S, 0, org.telegram.ui.Components.sc.T);
        this.a0 = x6Var;
    }

    @Override // org.telegram.ui.Components.sc
    public final void d(int i10, boolean z10) {
        z6 z6Var = this.a0.e;
        if (!z10) {
            z6Var.b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < z6Var.W.size()) {
                u6 u6Var = (u6) z6Var.W.get(i12);
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
            z6Var.b.e1(new h3.y(i11, 2), 0, true);
        } else {
            z6Var.b.j1();
        }
    }
}
