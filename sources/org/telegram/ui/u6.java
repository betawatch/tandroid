package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class u6 extends org.telegram.ui.Components.rc {
    public final /* synthetic */ v6 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(v6 v6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.rc.a0, 0, org.telegram.ui.Components.rc.b0);
        this.f0 = v6Var;
    }

    @Override // org.telegram.ui.Components.rc
    public final void d(int i7, boolean z10) {
        x6 x6Var = (x6) this.f0.f;
        if (!z10) {
            x6Var.b.l1();
            return;
        }
        int i10 = -1;
        if (i7 == 8) {
            i7 = -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 < x6Var.g0.size()) {
                t6 t6Var = (t6) x6Var.g0.get(i11);
                if (t6Var != null && t6Var.a == 11 && t6Var.f == i7) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 >= 0) {
            x6Var.b.e1(new l2.t(i10, 3), 0, true);
        } else {
            x6Var.b.l1();
        }
    }
}
