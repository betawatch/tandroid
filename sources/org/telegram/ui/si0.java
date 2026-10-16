package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class si0 extends kz {
    public final int[] N;
    public final /* synthetic */ gj0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(gj0 gj0Var, ri0 ri0Var, int i10) {
        super(i10, ri0Var);
        this.O = gj0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.kz
    public final void g(jz jzVar) {
        gj0 gj0Var = this.O;
        zi0 zi0Var = gj0Var.K;
        if (jzVar == null) {
            return;
        }
        if (gj0Var.l0 != null) {
            jzVar.c = true;
            float f7 = (kz.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            jzVar.d = f10;
            jzVar.e = f10;
            jzVar.a = Utilities.clamp(gj0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            jzVar.b = gj0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = gj0Var.Q;
        if (u1Var == null || !u1Var.isAttachedToWindow() || gj0Var.Q.getMessageObject() == null || gj0Var.Q.getMessageObject().getId() != gj0Var.R) {
            return;
        }
        gj0Var.Q.getLocationOnScreen(this.N);
        jzVar.c = true;
        float f11 = (kz.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        jzVar.d = f12;
        jzVar.e = f12;
        float f13 = f11 / 2.0f;
        jzVar.a = Utilities.clamp(((zi0Var.getScaleX() * gj0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        jzVar.b = ((zi0Var.getScaleY() * gj0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
