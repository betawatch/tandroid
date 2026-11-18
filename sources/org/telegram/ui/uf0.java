package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class uf0 extends nx {
    public final int[] O;
    public final /* synthetic */ fg0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf0(fg0 fg0Var, tf0 tf0Var, int i7) {
        super(i7, tf0Var);
        this.P = fg0Var;
        this.O = new int[2];
    }

    @Override // org.telegram.ui.nx
    public final void g(mx mxVar) {
        fg0 fg0Var = this.P;
        bg0 bg0Var = fg0Var.K;
        if (mxVar == null) {
            return;
        }
        if (fg0Var.l0 != null) {
            mxVar.c = true;
            float f10 = (nx.f() * org.telegram.messenger.g0.p) / 1.3f;
            float f11 = f10 / 3.0f;
            mxVar.d = f11;
            mxVar.e = f11;
            mxVar.a = Utilities.i(fg0Var.l0.right - (0.75f * f10), org.telegram.messenger.g0.q.x - f10, 0.0f);
            mxVar.b = fg0Var.l0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.r1 r1Var = fg0Var.Q;
        if (r1Var == null || !r1Var.isAttachedToWindow() || fg0Var.Q.getMessageObject() == null || fg0Var.Q.getMessageObject().e1() != fg0Var.R) {
            return;
        }
        fg0Var.Q.getLocationOnScreen(this.O);
        mxVar.c = true;
        float f12 = (nx.f() * org.telegram.messenger.g0.p) / 1.3f;
        float f13 = f12 / 3.0f;
        mxVar.d = f13;
        mxVar.e = f13;
        float f14 = f12 / 2.0f;
        mxVar.a = Utilities.i(((bg0Var.getScaleX() * fg0Var.Q.getTimeX()) + r8[0]) - f14, org.telegram.messenger.g0.q.x - f12, 0.0f);
        mxVar.b = ((bg0Var.getScaleY() * fg0Var.Q.getTimeY()) + r8[1]) - f14;
    }
}
