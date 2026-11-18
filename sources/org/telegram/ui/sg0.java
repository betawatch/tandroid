package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class sg0 extends hi.d {
    public final /* synthetic */ int m0;
    public final /* synthetic */ org.telegram.ui.Components.sa n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg0(org.telegram.ui.Components.sa saVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var, true);
        this.m0 = i7;
        this.n0 = saVar;
    }

    @Override // hi.d
    public final float b(float f10, float f11) {
        switch (this.m0) {
            case 0:
                ug0 ug0Var = (ug0) this.n0;
                boolean z10 = ug0Var.j2 == 0.0f;
                ug0Var.j2 = f10;
                if (z10) {
                    ug0Var.k2 = new org.telegram.ui.Components.op(ug0Var, 2);
                    ug0Var.f1(false);
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
