package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t6 extends org.telegram.ui.Components.zc {
    public final /* synthetic */ v6 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(v6 v6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.zc.S, 0, org.telegram.ui.Components.zc.T);
        this.a0 = v6Var;
    }

    @Override // org.telegram.ui.Components.zc
    public final void d(int i10, boolean z10) {
        x6 x6Var = this.a0.e;
        if (!z10) {
            x6Var.b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < x6Var.W.size()) {
                s6 s6Var = (s6) x6Var.W.get(i12);
                if (s6Var != null && s6Var.a == 11 && s6Var.f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            x6Var.b.e1(new j3.x(i11, 2), 0, true);
        } else {
            x6Var.b.j1();
        }
    }
}
