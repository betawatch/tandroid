package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tg0 extends hi.d {
    public final /* synthetic */ int m0;
    public final /* synthetic */ org.telegram.ui.Components.sa n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg0(org.telegram.ui.Components.sa saVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var, true);
        this.m0 = i7;
        this.n0 = saVar;
    }

    @Override // hi.d
    public final float b(float f10, float f11) {
        switch (this.m0) {
            case 0:
                vg0 vg0Var = (vg0) this.n0;
                boolean z10 = vg0Var.j2 == 0.0f;
                vg0Var.j2 = f10;
                if (z10) {
                    vg0Var.k2 = new org.telegram.ui.Components.op(vg0Var, 2);
                    vg0Var.f1(false);
                    break;
                }
                break;
            default:
                wg.d1 d1Var = (wg.d1) this.n0;
                boolean z11 = d1Var.o2 == 0.0f;
                d1Var.o2 = f10;
                if (z11) {
                    d1Var.p2 = new org.telegram.ui.Components.op(d1Var, 3);
                    d1Var.k1(false);
                    break;
                }
                break;
        }
        return f10;
    }
}
