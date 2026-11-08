package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class qf0 extends ix {
    public final int[] N;
    public final /* synthetic */ bg0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf0(bg0 bg0Var, pf0 pf0Var, int i7) {
        super(i7, pf0Var);
        this.O = bg0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.ix
    public final void g(hx hxVar) {
        bg0 bg0Var = this.O;
        xf0 xf0Var = bg0Var.J;
        if (hxVar == null) {
            return;
        }
        if (bg0Var.k0 != null) {
            hxVar.c = true;
            float f10 = (ix.f() * org.telegram.messenger.g0.p) / 1.3f;
            float f11 = f10 / 3.0f;
            hxVar.d = f11;
            hxVar.e = f11;
            hxVar.a = Utilities.i(bg0Var.k0.right - (0.75f * f10), org.telegram.messenger.g0.q.x - f10, 0.0f);
            hxVar.b = bg0Var.k0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = bg0Var.P;
        if (q1Var == null || !q1Var.isAttachedToWindow() || bg0Var.P.getMessageObject() == null || bg0Var.P.getMessageObject().f1() != bg0Var.Q) {
            return;
        }
        bg0Var.P.getLocationOnScreen(this.N);
        hxVar.c = true;
        float f12 = (ix.f() * org.telegram.messenger.g0.p) / 1.3f;
        float f13 = f12 / 3.0f;
        hxVar.d = f13;
        hxVar.e = f13;
        float f14 = f12 / 2.0f;
        hxVar.a = Utilities.i(((xf0Var.getScaleX() * bg0Var.P.getTimeX()) + r8[0]) - f14, org.telegram.messenger.g0.q.x - f12, 0.0f);
        hxVar.b = ((xf0Var.getScaleY() * bg0Var.P.getTimeY()) + r8[1]) - f14;
    }
}
