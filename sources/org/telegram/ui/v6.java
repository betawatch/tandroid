package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class v6 extends org.telegram.ui.Components.dd {
    public final /* synthetic */ x6 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(x6 x6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.dd.W, 0, org.telegram.ui.Components.dd.a0);
        this.e0 = x6Var;
    }

    @Override // org.telegram.ui.Components.dd
    public final void d(int i10, boolean z10) {
        z6 z6Var = this.e0.e;
        if (!z10) {
            z6Var.b.k1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < z6Var.e0.size()) {
                u6 u6Var = (u6) z6Var.e0.get(i12);
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
            z6Var.b.f1(new i2.v(i11, 3), 0, true);
        } else {
            z6Var.b.k1();
        }
    }
}
