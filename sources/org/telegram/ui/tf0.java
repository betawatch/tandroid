package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tf0 extends lx {
    public final int[] N;
    public final /* synthetic */ eg0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(eg0 eg0Var, sf0 sf0Var, int i7) {
        super(i7, sf0Var);
        this.O = eg0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.lx
    public final void g(kx kxVar) {
        eg0 eg0Var = this.O;
        ag0 ag0Var = eg0Var.J;
        if (kxVar == null) {
            return;
        }
        if (eg0Var.k0 != null) {
            kxVar.c = true;
            float f10 = (lx.f() * org.telegram.messenger.g0.p) / 1.3f;
            float f11 = f10 / 3.0f;
            kxVar.d = f11;
            kxVar.e = f11;
            kxVar.a = Utilities.i(eg0Var.k0.right - (0.75f * f10), org.telegram.messenger.g0.q.x - f10, 0.0f);
            kxVar.b = eg0Var.k0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = eg0Var.P;
        if (q1Var == null || !q1Var.isAttachedToWindow() || eg0Var.P.getMessageObject() == null || eg0Var.P.getMessageObject().e1() != eg0Var.Q) {
            return;
        }
        eg0Var.P.getLocationOnScreen(this.N);
        kxVar.c = true;
        float f12 = (lx.f() * org.telegram.messenger.g0.p) / 1.3f;
        float f13 = f12 / 3.0f;
        kxVar.d = f13;
        kxVar.e = f13;
        float f14 = f12 / 2.0f;
        kxVar.a = Utilities.i(((ag0Var.getScaleX() * eg0Var.P.getTimeX()) + r8[0]) - f14, org.telegram.messenger.g0.q.x - f12, 0.0f);
        kxVar.b = ((ag0Var.getScaleY() * eg0Var.P.getTimeY()) + r8[1]) - f14;
    }
}
