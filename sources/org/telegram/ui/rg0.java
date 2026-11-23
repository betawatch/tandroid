package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rg0 extends hi.e {
    public final /* synthetic */ int m0;
    public final /* synthetic */ org.telegram.ui.Components.ra n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rg0(org.telegram.ui.Components.ra raVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var, true);
        this.m0 = i7;
        this.n0 = raVar;
    }

    @Override // hi.e
    public final float b(float f10, float f11) {
        switch (this.m0) {
            case 0:
                tg0 tg0Var = (tg0) this.n0;
                boolean z10 = tg0Var.j2 == 0.0f;
                tg0Var.j2 = f10;
                if (z10) {
                    tg0Var.k2 = new org.telegram.ui.Components.np(tg0Var, 2);
                    tg0Var.f1(false);
                    break;
                }
                break;
            default:
                wg.d1 d1Var = (wg.d1) this.n0;
                boolean z11 = d1Var.o2 == 0.0f;
                d1Var.o2 = f10;
                if (z11) {
                    d1Var.p2 = new org.telegram.ui.Components.np(d1Var, 3);
                    d1Var.k1(false);
                    break;
                }
                break;
        }
        return f10;
    }
}
