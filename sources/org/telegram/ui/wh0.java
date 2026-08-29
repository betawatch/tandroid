package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wh0 extends ry {
    public final int[] J;
    public final /* synthetic */ ki0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh0(ki0 ki0Var, vh0 vh0Var, int i10) {
        super(i10, vh0Var);
        this.K = ki0Var;
        this.J = new int[2];
    }

    @Override // org.telegram.ui.ry
    public final void h(qy qyVar) {
        ki0 ki0Var = this.K;
        di0 di0Var = ki0Var.G;
        if (qyVar == null) {
            return;
        }
        if (ki0Var.h0 != null) {
            qyVar.c = true;
            float f9 = (ry.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f9 / 3.0f;
            qyVar.d = f10;
            qyVar.e = f10;
            qyVar.a = Utilities.clamp(ki0Var.h0.right - (0.75f * f9), AndroidUtilities.displaySize.x - f9, 0.0f);
            qyVar.b = ki0Var.h0.bottom - (f9 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = ki0Var.M;
        if (s1Var == null || !s1Var.isAttachedToWindow() || ki0Var.M.getMessageObject() == null || ki0Var.M.getMessageObject().getId() != ki0Var.N) {
            return;
        }
        ki0Var.M.getLocationOnScreen(this.J);
        qyVar.c = true;
        float f11 = (ry.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        qyVar.d = f12;
        qyVar.e = f12;
        float f13 = f11 / 2.0f;
        qyVar.a = Utilities.clamp(((di0Var.getScaleX() * ki0Var.M.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        qyVar.b = ((di0Var.getScaleY() * ki0Var.M.getTimeY()) + r8[1]) - f13;
    }
}
