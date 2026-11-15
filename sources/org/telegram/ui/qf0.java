package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qf0 extends jx {
    public final int[] O;
    public final /* synthetic */ bg0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf0(bg0 bg0Var, pf0 pf0Var, int i7) {
        super(i7, pf0Var);
        this.P = bg0Var;
        this.O = new int[2];
    }

    @Override // org.telegram.ui.jx
    public final void g(ix ixVar) {
        bg0 bg0Var = this.P;
        xf0 xf0Var = bg0Var.K;
        if (ixVar == null) {
            return;
        }
        if (bg0Var.l0 != null) {
            ixVar.c = true;
            float f10 = (jx.f() * org.telegram.messenger.g0.p) / 1.3f;
            float f11 = f10 / 3.0f;
            ixVar.d = f11;
            ixVar.e = f11;
            ixVar.a = Utilities.i(bg0Var.l0.right - (0.75f * f10), org.telegram.messenger.g0.q.x - f10, 0.0f);
            ixVar.b = bg0Var.l0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = bg0Var.Q;
        if (q1Var == null || !q1Var.isAttachedToWindow() || bg0Var.Q.getMessageObject() == null || bg0Var.Q.getMessageObject().e1() != bg0Var.R) {
            return;
        }
        bg0Var.Q.getLocationOnScreen(this.O);
        ixVar.c = true;
        float f12 = (jx.f() * org.telegram.messenger.g0.p) / 1.3f;
        float f13 = f12 / 3.0f;
        ixVar.d = f13;
        ixVar.e = f13;
        float f14 = f12 / 2.0f;
        ixVar.a = Utilities.i(((xf0Var.getScaleX() * bg0Var.Q.getTimeX()) + r8[0]) - f14, org.telegram.messenger.g0.q.x - f12, 0.0f);
        ixVar.b = ((xf0Var.getScaleY() * bg0Var.Q.getTimeY()) + r8[1]) - f14;
    }
}
