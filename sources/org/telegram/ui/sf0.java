package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sf0 extends mx {
    public final int[] O;
    public final /* synthetic */ dg0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(dg0 dg0Var, rf0 rf0Var, int i7) {
        super(i7, rf0Var);
        this.P = dg0Var;
        this.O = new int[2];
    }

    @Override // org.telegram.ui.mx
    public final void g(lx lxVar) {
        dg0 dg0Var = this.P;
        zf0 zf0Var = dg0Var.K;
        if (lxVar == null) {
            return;
        }
        if (dg0Var.l0 != null) {
            lxVar.c = true;
            float f10 = (mx.f() * org.telegram.messenger.g0.p) / 1.3f;
            float f11 = f10 / 3.0f;
            lxVar.d = f11;
            lxVar.e = f11;
            lxVar.a = Utilities.i(dg0Var.l0.right - (0.75f * f10), org.telegram.messenger.g0.q.x - f10, 0.0f);
            lxVar.b = dg0Var.l0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.r1 r1Var = dg0Var.Q;
        if (r1Var == null || !r1Var.isAttachedToWindow() || dg0Var.Q.getMessageObject() == null || dg0Var.Q.getMessageObject().e1() != dg0Var.R) {
            return;
        }
        dg0Var.Q.getLocationOnScreen(this.O);
        lxVar.c = true;
        float f12 = (mx.f() * org.telegram.messenger.g0.p) / 1.3f;
        float f13 = f12 / 3.0f;
        lxVar.d = f13;
        lxVar.e = f13;
        float f14 = f12 / 2.0f;
        lxVar.a = Utilities.i(((zf0Var.getScaleX() * dg0Var.Q.getTimeX()) + r8[0]) - f14, org.telegram.messenger.g0.q.x - f12, 0.0f);
        lxVar.b = ((zf0Var.getScaleY() * dg0Var.Q.getTimeY()) + r8[1]) - f14;
    }
}
