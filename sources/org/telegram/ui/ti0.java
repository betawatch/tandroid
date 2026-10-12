package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ti0 extends kz {
    public final int[] N;
    public final /* synthetic */ hj0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti0(hj0 hj0Var, si0 si0Var, int i10) {
        super(i10, si0Var);
        this.O = hj0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.kz
    public final void g(jz jzVar) {
        hj0 hj0Var = this.O;
        aj0 aj0Var = hj0Var.K;
        if (jzVar == null) {
            return;
        }
        if (hj0Var.l0 != null) {
            jzVar.c = true;
            float f7 = (kz.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            jzVar.d = f10;
            jzVar.e = f10;
            jzVar.a = Utilities.clamp(hj0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            jzVar.b = hj0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = hj0Var.Q;
        if (u1Var == null || !u1Var.isAttachedToWindow() || hj0Var.Q.getMessageObject() == null || hj0Var.Q.getMessageObject().getId() != hj0Var.R) {
            return;
        }
        hj0Var.Q.getLocationOnScreen(this.N);
        jzVar.c = true;
        float f11 = (kz.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        jzVar.d = f12;
        jzVar.e = f12;
        float f13 = f11 / 2.0f;
        jzVar.a = Utilities.clamp(((aj0Var.getScaleX() * hj0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        jzVar.b = ((aj0Var.getScaleY() * hj0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
