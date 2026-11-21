package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class tg0 extends hi.e {
    public final /* synthetic */ int m0;
    public final /* synthetic */ org.telegram.ui.Components.sa n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg0(org.telegram.ui.Components.sa saVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var, true);
        this.m0 = i7;
        this.n0 = saVar;
    }

    @Override // hi.e
    public final float b(float f10, float f11) {
        switch (this.m0) {
            case 0:
                vg0 vg0Var = (vg0) this.n0;
                boolean z10 = vg0Var.j2 == 0.0f;
                vg0Var.j2 = f10;
                if (z10) {
                    vg0Var.k2 = new org.telegram.ui.Components.qp(vg0Var, 2);
                    vg0Var.f1(false);
                    break;
                }
                break;
            default:
                wg.e1 e1Var = (wg.e1) this.n0;
                boolean z11 = e1Var.o2 == 0.0f;
                e1Var.o2 = f10;
                if (z11) {
                    e1Var.p2 = new org.telegram.ui.Components.qp(e1Var, 3);
                    e1Var.k1(false);
                    break;
                }
                break;
        }
        return f10;
    }
}
