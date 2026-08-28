package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u6 extends org.telegram.ui.Components.uc {
    public final /* synthetic */ w6 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(w6 w6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.uc.S, 0, org.telegram.ui.Components.uc.T);
        this.a0 = w6Var;
    }

    @Override // org.telegram.ui.Components.uc
    public final void d(int i9, boolean z10) {
        y6 y6Var = this.a0.e;
        if (!z10) {
            y6Var.b.j1();
            return;
        }
        int i10 = -1;
        if (i9 == 8) {
            i9 = -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 < y6Var.W.size()) {
                t6 t6Var = (t6) y6Var.W.get(i11);
                if (t6Var != null && t6Var.a == 11 && t6Var.f == i9) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            y6Var.b.e1(new h3.x(i10, 2), 0, true);
        } else {
            y6Var.b.j1();
        }
    }
}
