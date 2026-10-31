package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zg0 extends ly {
    public final int[] N;
    public final /* synthetic */ kh0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg0(kh0 kh0Var, yg0 yg0Var, int i10) {
        super(i10, yg0Var);
        this.O = kh0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.ly
    public final void g(ky kyVar) {
        kh0 kh0Var = this.O;
        gh0 gh0Var = kh0Var.J;
        if (kyVar == null) {
            return;
        }
        if (kh0Var.k0 != null) {
            kyVar.c = true;
            float f7 = (ly.f() * org.telegram.messenger.i0.p) / 1.3f;
            float f10 = f7 / 3.0f;
            kyVar.d = f10;
            kyVar.e = f10;
            kyVar.a = Utilities.i(kh0Var.k0.right - (0.75f * f7), org.telegram.messenger.i0.q.x - f7, 0.0f);
            kyVar.b = kh0Var.k0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = kh0Var.P;
        if (q1Var == null || !q1Var.isAttachedToWindow() || kh0Var.P.getMessageObject() == null || kh0Var.P.getMessageObject().f1() != kh0Var.Q) {
            return;
        }
        kh0Var.P.getLocationOnScreen(this.N);
        kyVar.c = true;
        float f11 = (ly.f() * org.telegram.messenger.i0.p) / 1.3f;
        float f12 = f11 / 3.0f;
        kyVar.d = f12;
        kyVar.e = f12;
        float f13 = f11 / 2.0f;
        kyVar.a = Utilities.i(((gh0Var.getScaleX() * kh0Var.P.getTimeX()) + r8[0]) - f13, org.telegram.messenger.i0.q.x - f11, 0.0f);
        kyVar.b = ((gh0Var.getScaleY() * kh0Var.P.getTimeY()) + r8[1]) - f13;
    }
}
