package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class tf0 extends nx {
    public final int[] O;
    public final /* synthetic */ eg0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(eg0 eg0Var, sf0 sf0Var, int i7) {
        super(i7, sf0Var);
        this.P = eg0Var;
        this.O = new int[2];
    }

    @Override // org.telegram.ui.nx
    public final void g(mx mxVar) {
        eg0 eg0Var = this.P;
        ag0 ag0Var = eg0Var.K;
        if (mxVar == null) {
            return;
        }
        if (eg0Var.l0 != null) {
            mxVar.c = true;
            float f10 = (nx.f() * org.telegram.messenger.g0.p) / 1.3f;
            float f11 = f10 / 3.0f;
            mxVar.d = f11;
            mxVar.e = f11;
            mxVar.a = Utilities.i(eg0Var.l0.right - (0.75f * f10), org.telegram.messenger.g0.q.x - f10, 0.0f);
            mxVar.b = eg0Var.l0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.r1 r1Var = eg0Var.Q;
        if (r1Var == null || !r1Var.isAttachedToWindow() || eg0Var.Q.getMessageObject() == null || eg0Var.Q.getMessageObject().e1() != eg0Var.R) {
            return;
        }
        eg0Var.Q.getLocationOnScreen(this.O);
        mxVar.c = true;
        float f12 = (nx.f() * org.telegram.messenger.g0.p) / 1.3f;
        float f13 = f12 / 3.0f;
        mxVar.d = f13;
        mxVar.e = f13;
        float f14 = f12 / 2.0f;
        mxVar.a = Utilities.i(((ag0Var.getScaleX() * eg0Var.Q.getTimeX()) + r8[0]) - f14, org.telegram.messenger.g0.q.x - f12, 0.0f);
        mxVar.b = ((ag0Var.getScaleY() * eg0Var.Q.getTimeY()) + r8[1]) - f14;
    }
}
