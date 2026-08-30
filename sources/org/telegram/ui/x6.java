package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x6 extends org.telegram.ui.Components.wc {
    public final /* synthetic */ z6 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(z6 z6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.wc.T, 0, org.telegram.ui.Components.wc.U);
        this.b0 = z6Var;
    }

    @Override // org.telegram.ui.Components.wc
    public final void d(int i10, boolean z4) {
        b7 b7Var = this.b0.e;
        if (!z4) {
            b7Var.b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < b7Var.X.size()) {
                w6 w6Var = (w6) b7Var.X.get(i12);
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
            b7Var.b.e1(new d4.b(i11, 3), 0, true);
        } else {
            b7Var.b.j1();
        }
    }
}
