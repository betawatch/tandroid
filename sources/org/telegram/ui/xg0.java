package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xg0 extends ky {
    public final int[] N;
    public final /* synthetic */ ih0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg0(ih0 ih0Var, wg0 wg0Var, int i10) {
        super(i10, wg0Var);
        this.O = ih0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.ky
    public final void g(jy jyVar) {
        ih0 ih0Var = this.O;
        eh0 eh0Var = ih0Var.J;
        if (jyVar == null) {
            return;
        }
        if (ih0Var.k0 != null) {
            jyVar.c = true;
            float f7 = (ky.f() * org.telegram.messenger.i0.p) / 1.3f;
            float f10 = f7 / 3.0f;
            jyVar.d = f10;
            jyVar.e = f10;
            jyVar.a = Utilities.i(ih0Var.k0.right - (0.75f * f7), org.telegram.messenger.i0.q.x - f7, 0.0f);
            jyVar.b = ih0Var.k0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = ih0Var.P;
        if (q1Var == null || !q1Var.isAttachedToWindow() || ih0Var.P.getMessageObject() == null || ih0Var.P.getMessageObject().f1() != ih0Var.Q) {
            return;
        }
        ih0Var.P.getLocationOnScreen(this.N);
        jyVar.c = true;
        float f11 = (ky.f() * org.telegram.messenger.i0.p) / 1.3f;
        float f12 = f11 / 3.0f;
        jyVar.d = f12;
        jyVar.e = f12;
        float f13 = f11 / 2.0f;
        jyVar.a = Utilities.i(((eh0Var.getScaleX() * ih0Var.P.getTimeX()) + r8[0]) - f13, org.telegram.messenger.i0.q.x - f11, 0.0f);
        jyVar.b = ((eh0Var.getScaleY() * ih0Var.P.getTimeY()) + r8[1]) - f13;
    }
}
