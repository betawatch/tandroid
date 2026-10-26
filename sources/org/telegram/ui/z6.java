package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z6 extends org.telegram.ui.Components.cd {
    public final /* synthetic */ a7 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(a7 a7Var, Context context) {
        super(context, 11, org.telegram.ui.Components.cd.W, 0, org.telegram.ui.Components.cd.a0);
        this.e0 = a7Var;
    }

    @Override // org.telegram.ui.Components.cd
    public final void d(int i10, boolean z10) {
        c7 c7Var = this.e0.e;
        if (!z10) {
            c7Var.b.m1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < c7Var.g0.size()) {
                y6 y6Var = (y6) c7Var.g0.get(i12);
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
            c7Var.b.e1(new i2.w(i11, 7), 0, true);
        } else {
            c7Var.b.m1();
        }
    }
}
