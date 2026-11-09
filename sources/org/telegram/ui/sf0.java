package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sf0 extends kx {
    public final int[] N;
    public final /* synthetic */ dg0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(dg0 dg0Var, rf0 rf0Var, int i7) {
        super(i7, rf0Var);
        this.O = dg0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.kx
    public final void g(jx jxVar) {
        dg0 dg0Var = this.O;
        zf0 zf0Var = dg0Var.J;
        if (jxVar == null) {
            return;
        }
        if (dg0Var.k0 != null) {
            jxVar.c = true;
            float f10 = (kx.f() * org.telegram.messenger.g0.p) / 1.3f;
            float f11 = f10 / 3.0f;
            jxVar.d = f11;
            jxVar.e = f11;
            jxVar.a = Utilities.i(dg0Var.k0.right - (0.75f * f10), org.telegram.messenger.g0.q.x - f10, 0.0f);
            jxVar.b = dg0Var.k0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = dg0Var.P;
        if (q1Var == null || !q1Var.isAttachedToWindow() || dg0Var.P.getMessageObject() == null || dg0Var.P.getMessageObject().e1() != dg0Var.Q) {
            return;
        }
        dg0Var.P.getLocationOnScreen(this.N);
        jxVar.c = true;
        float f12 = (kx.f() * org.telegram.messenger.g0.p) / 1.3f;
        float f13 = f12 / 3.0f;
        jxVar.d = f13;
        jxVar.e = f13;
        float f14 = f12 / 2.0f;
        jxVar.a = Utilities.i(((zf0Var.getScaleX() * dg0Var.P.getTimeX()) + r8[0]) - f14, org.telegram.messenger.g0.q.x - f12, 0.0f);
        jxVar.b = ((zf0Var.getScaleY() * dg0Var.P.getTimeY()) + r8[1]) - f14;
    }
}
